package com.ktpm.controller;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class KhaiTuController {
	private int idNhanKhau;

    @FXML
    private TextField lyDoTuVongField;

    @FXML
    private DatePicker ngayKhaiField;

    @FXML
    private DatePicker ngayTuVongField;

    @FXML
    private TextField quanHeField;

    @FXML
    private Text tenNguoiChetField;

    @FXML
    private TextField tenNguoiKhaiTuField;

    @FXML
    void onSubmit(MouseEvent event) {
    	 String lyDoTuVong = lyDoTuVongField.getText();
    	    LocalDate ngayKhai = ngayKhaiField.getValue();
    	    LocalDate ngayTuVong = ngayTuVongField.getValue();
    	    String quanHe = quanHeField.getText();
    	    String tenNguoiChet = tenNguoiChetField.getText();
    	    String tenNguoiKhaiTu = tenNguoiKhaiTuField.getText();
    }

}
