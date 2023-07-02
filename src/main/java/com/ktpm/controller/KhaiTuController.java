package com.ktpm.controller;

import java.sql.SQLException;
import java.time.LocalDate;

import com.ktpm.model.NhanKhau;
import com.ktpm.services.SoHoKhauServices;
import com.ktpm.services.ThanhVienServices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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
    	for (String s: lstNhanKhau) {
    		if (s.equals(tenNguoiChetField.getText())) {
    			lstNhanKhau.remove(s);
    		}
    	}
    	nguoiKhaiTuBox.setItems(this.lstNhanKhau);
    	tenNguoiChetField.setText(tenNguoiChet);
    }

    @FXML
    void onSubmit(MouseEvent event) {
		String lyDoTuVong = lyDoTuVongField.getText();
		LocalDate ngayKhai = ngayKhaiField.getValue();
		LocalDate ngayTuVong = ngayTuVongField.getValue();
		String quanHe = quanHeField.getText();
		String tenNguoiChet = tenNguoiChetField.getText();
		String tenNguoiKhaiTu = nguoiKhaiTuBox.getValue();
		
		
		
		
		
    }

}
