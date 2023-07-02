package com.ktpm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import static com.ktpm.utils.Utils.createDialog;
 
public class TamVangController {
	private int  idNhankhau;

    @FXML
    private DatePicker denNgayDatePicker;

    @FXML
    private TextField liDoTextField;

    @FXML
    private TextField noiTamTruTextField;

    @FXML
    private Button submit;

    @FXML
    private DatePicker tuNgayDatePicker;
    
    @FXML
    void onSubmit(MouseEvent event) {
    	String denNgay=denNgayDatePicker.getValue().toString();
    	String tuNgay=tuNgayDatePicker.getValue().toString();
    	String lido=liDoTextField.getText();
    	String noiTamTru=noiTamTruTextField.getText();
    	
    	if(denNgay.equals("") || tuNgay.equals("")|| lido.equals("")|| noiTamTru.equals("")) {
    		  createDialog(
                      Alert.AlertType.WARNING,
                      "Thông báo",
                      "", "Vui lòng nhập đủ thông tin!");
    	}else {
    		
    	}
    }
    public void setIdNhanKhau(int id) {
    	this.idNhankhau=id;
    }

}