package com.ktpm.services;

import static com.ktpm.constants.DBConstants.DATABASE;
import static com.ktpm.constants.DBConstants.PASSWORD;
import static com.ktpm.constants.DBConstants.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.ObservableList;

public class ThongKeServices {

    public static ResultSet statisticNhanKhau(String query) throws SQLException {
        Connection conn = DriverManager.getConnection(DATABASE, USERNAME, PASSWORD);
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
	
    public static ObservableList<String> getThanhVienGiaDinh(String maHoKhau) {
    	return null;
    }
    
	public ThongKeServices() {
		// TODO Auto-generated constructor stub
	}

}
