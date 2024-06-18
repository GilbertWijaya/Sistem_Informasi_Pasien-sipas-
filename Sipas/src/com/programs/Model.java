package com.programs;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class Model {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/database_pasien";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private static Connection conn;
    private static Statement stmt;

    private static void connection(){

        try {
            
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
