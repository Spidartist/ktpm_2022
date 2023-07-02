package com.ktpm.controller.sohokhau;

import com.ktpm.model.SoHoKhau;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class TachKhauController {
	
	public void setInfo() {
		chuHoHienTai.setText(this.soHoKhauHienTai.getTenChuHo());
		diaChiHienTai.setText(this.soHoKhauHienTai.getDiaChi());
		maHoKhauHienTaiText.setText(this.soHoKhauHienTai.getMaHoKhau());
	}
	
    @FXML
    private Text maHoKhauHienTaiText;
	
	private SoHoKhau soHoKhauHienTai;
	
    @FXML
    private ComboBox<String> chuHoBox;

    @FXML
    private Text chuHoHienTai;

    @FXML
    private Text diaChiHienTai;


	public SoHoKhau getSoHoKhauHienTai() {
		return soHoKhauHienTai;
	}

	public void setSoHoKhauHienTai(SoHoKhau soHoKhauHienTai) {
		this.soHoKhauHienTai = soHoKhauHienTai;
	}

	@FXML
    private TextField diaChiMoiText;

    @FXML
    private Text hoKhauHienTai;

    @FXML
    private TextField maHoKhauMoiText;

	@FXML
    void denHoKhauMoi(MouseEvent event) {

    }

    @FXML
    void onSubmit(MouseEvent event) {

    }

    @FXML
    void veHoKhauCu(MouseEvent event) {

    }

}
