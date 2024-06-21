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

    public static Object[] getDetailAkun(int id){
        
        connection();
        Object[] data = new Object[6];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM vwinfoakun WHERE `vwinfoakun`.`id_akun` =" + id;

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_akun");
            data[1] = rs.getString("email_akun");
            data[2] = rs.getString("nama_akun");
            data[3] = rs.getString("no_hp_akun");
            data[4] = rs.getInt("saldo");
            data[5] = rs.getString("password_akun");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static boolean isiSaldo(int id,int totalsaldo){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "UPDATE `tbl_akun` SET `saldo`="+totalsaldo+" WHERE tbl_akun.id_akun =" + id;
            
            if (stmt.executeUpdate(query) > 0) {
                status = true;
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

        return status;
    }

    public static boolean verifyAkunPasien(String email,String password){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM vwinfoakun WHERE `vwinfoakun`.`email_akun` ='"+email+"' AND `vwinfoakun`.`password_akun` ="+password+"";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();

            if (rs.getInt(1) == 1) {
                status = true;
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public static Object[] getDetailakunByEmail(String email){

        connection();
        Object[] data = new Object[6];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM vwinfoakun WHERE `vwinfoakun`.`email_akun` ='"+email+"'";
            
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_akun");
            data[1] = rs.getString("email_akun");
            data[2] = rs.getString("nama_akun");
            data[3] = rs.getString("no_hp_akun");
            data[4] = rs.getInt("saldo");
            data[5] = rs.getString("password_akun");

            stmt.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static boolean verifyEmailPasien(String email){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM vwinfoakun WHERE email_akun = '"+email+"'";
            
            ResultSet rs = stmt.executeQuery(query);
            rs.next();

            if (rs.getInt(1) == 0) {
                status = true;
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public static boolean insertAkunPasien(String email,String nama,String noHp,String password){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "INSERT INTO `tbl_akun`(`email_akun`, `nama_akun`,`no_hp_akun`,`saldo`,`password_akun`) VALUES ('"+email+"','"+nama+"','"+noHp+"',"+0+",'"+password+"')";

            if (stmt.executeUpdate(query) > 0) {
                status = true;
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

}
