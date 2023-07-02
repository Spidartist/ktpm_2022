package com.ktpm.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ThongKeController implements Initializable {

    @FXML
    private TextField denNamField;

    @FXML
    private TextField denTuoiField;

    @FXML
    private ComboBox<String> gioiTinhList;

    @FXML
    private ComboBox<String> tinhTrangList;

    @FXML
    private TextField tuNamField;

    @FXML
    private TextField tuTuoiField;

    
    @FXML
    private TableColumn<?, ?> gioiTinhColumn;


    @FXML
    private TableColumn<?, ?> hoTenColumn;

    @FXML
    private TableColumn<?, ?> ngaySinhColumn;

    @FXML
    private TableColumn<?, ?> noiThuongTruColumn;

    @FXML
    private TableView<?> tableView;

    
    @FXML
    void onStatistic(MouseEvent event) {
    	String denNam= denNamField.getText();
    	String tuNam=tuNamField.getText();
    	String gioiTinh=gioiTinhList.getValue();
    	String tinhTrang=tinhTrangList.getValue();
    	
    	System.out.println("thong ke"+ tuNam +" "+denNam+" "+gioiTinh+ " "+tinhTrang);
    	
    	
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 ObservableList<String> listGioiTinhOptions = FXCollections.observableArrayList("Nam", "Nữ","Toàn bộ");
		gioiTinhList.setItems(listGioiTinhOptions);
		gioiTinhList.setValue("Toàn bộ");
		 ObservableList<String> tinhTrangOptions = FXCollections.observableArrayList("Toàn bộ", "Đăng kí tạm trú","Đăng kí tạm văng","Khai tử");
		 tinhTrangList.setItems(tinhTrangOptions);
		 tinhTrangList.setValue("Toàn bộ");
		 
		
	}

}
