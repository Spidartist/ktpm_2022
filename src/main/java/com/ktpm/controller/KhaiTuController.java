package com.ktpm.controller;

import static com.ktpm.utils.Utils.createDialog;

import java.sql.SQLException;
import java.time.LocalDate;
import javafx.stage.Stage;
import com.ktpm.model.NhanKhau;
import com.ktpm.services.NhanKhauServices;
import com.ktpm.services.SoHoKhauServices;
import com.ktpm.services.ThanhVienServices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class KhaiTuController {
	private int idNhanKhau;
	private int idHoKhau;
	
	private String tenNguoiChet;
	
	public String getTenNguoiChet() {
		return tenNguoiChet;
	}

	public void setTenNguoiChet(String tenNguoiChet) {
		this.tenNguoiChet = tenNguoiChet;
	}

	private ObservableList<String> lstNhanKhau = FXCollections.observableArrayList();
	
    @FXML
    private TextField lyDoTuVongField;

    @FXML
    private DatePicker ngayKhaiField;

    public int getIdNhanKhau() {
		return idNhanKhau;
	}

	public void setIdNhanKhau(int idNhanKhau) {
		this.idNhanKhau = idNhanKhau;
	}

	@FXML
    private DatePicker ngayTuVongField;

    @FXML
    private TextField quanHeField;

    @FXML
    private Text tenNguoiChetField;

    @FXML
    private ComboBox<String> nguoiKhaiTuBox;
    
    
    public void init() throws SQLException {
    	this.idHoKhau = ThanhVienServices.getIDHoKhauViaIDNhanKhau(idNhanKhau);
    	this.lstNhanKhau = ThanhVienServices.getThanhVienViaIDHoKhau(idHoKhau);
    	this.lstNhanKhau.add(SoHoKhauServices.getChuHoViaIDHoKhau(idHoKhau));
    	int idx = lstNhanKhau.indexOf(tenNguoiChet);
    	lstNhanKhau.remove(idx);
    	nguoiKhaiTuBox.setItems(this.lstNhanKhau);
    	tenNguoiChetField.setText(tenNguoiChet);
    }

    @FXML
    void onSubmit(MouseEvent event) throws SQLException {
		String lyDoTuVong = lyDoTuVongField.getText();
		String ngayKhai = ngayKhaiField.getValue().toString();
		String ngayTuVong = ngayTuVongField.getValue().toString();
		String quanHe = quanHeField.getText();
		String tenNguoiChet = tenNguoiChetField.getText();
		String tenNguoiKhaiTu = nguoiKhaiTuBox.getValue();
		
		int idNguoiKhaiTu = NhanKhauServices.findIDNhanKhauViaTen(tenNguoiKhaiTu);
		int idChet = NhanKhauServices.findIDNhanKhauViaTen(tenNguoiChet);
		
		
		int rs =NhanKhauServices.addKhaiTu(idChet, idNguoiKhaiTu, lyDoTuVong, ngayTuVong, ngayKhai, quanHe);
		if (rs ==1) {
			createDialog(Alert.AlertType.INFORMATION, "Thông báo", "Khai tử thành công!", "");
		}else {
			createDialog(Alert.AlertType.ERROR, "Thông báo", "Có lỗi xảy ra!", "");
		}
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
		
    }

}
