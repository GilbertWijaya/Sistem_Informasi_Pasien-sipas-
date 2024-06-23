package com.programs;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

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

    public static DefaultComboBoxModel PenyakitBoxModel(){

        connection();
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_keluhan";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Object data[] = {rs.getInt("id_keluhan"),rs.getString("nama_keluhan"),rs.getString("pengertian_klh"),rs.getString("penanganan_klh")};
                model.addElement(data[1]);
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }

    public static DefaultComboBoxModel RuanganBoxModel(){

        connection();
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_ruangan";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Object data[] = {rs.getInt("id_ruangan"),rs.getString("nama_ruangan")};
                model.addElement(data[1]);
            }

            stmt.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }

    public static Object[] detailPenyakit(String namaPenyakit){

        connection();
        Object[] data = new Object[4];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_keluhan WHERE nama_keluhan = '"+namaPenyakit+"'";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_keluhan");
            data[1] = rs.getString("nama_keluhan");
            data[2] = rs.getString("pengertian_klh");
            data[3] = rs.getString("penanganan_klh");

            stmt.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static boolean insertDataPasien(int id,String nama,String tanggalLahir,String tempatLahir,int UsiaValue,String nomorHp,String alamatValue,String jenisKelamin,int id_keluhan,String penanggungJawabValue){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "INSERT INTO `tbl_pasien`(`akun_pendaftar`, `nama_pasien`, `tanggal_lahir_psn`, `tempat_lahir_psn`, `umur_pasien`, `no_hp_pasien`, `alamat_pasien`, `jenis_kelamin_psn`,`keluhan`, `nama_wali_psn`,`no_telp_wali`,`alamat_wali`) VALUES ("+id+
            ",'"+nama+"','"+tanggalLahir+"','"+tempatLahir+" '," + UsiaValue +
            ",'"+nomorHp+"','"+alamatValue+"','"+jenisKelamin+"', '"+ id_keluhan+"','"+penanggungJawabValue+"', '"+nomorHp+"','"+alamatValue+"')";

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

    public static Object[] dataPasien(int id){
        
        connection();
        Object[] data = new Object[13];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_pasien WHERE akun_pendaftar = "+id;

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_pasien");
            data[1] = rs.getString("akun_pendaftar");
            data[2] = rs.getString("nama_pasien");
            data[3] = rs.getString("tanggal_lahir_psn");
            data[4] = rs.getString("tempat_lahir_psn");
            data[5] = rs.getInt("umur_pasien");
            data[6] = rs.getString("no_hp_pasien");
            data[7] = rs.getString("alamat_pasien");
            data[8] = rs.getString("jenis_kelamin_psn");
            data[9] = rs.getInt("keluhan");
            data[10] = rs.getString("nama_wali_psn");
            data[11] = rs.getString("no_telp_wali");
            data[12] = rs.getString("alamat_wali");


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static Object[] dataPasienByNama(String nama){
        
        connection();
        Object[] data = new Object[13];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM `tbl_pasien` WHERE tbl_pasien.`nama_pasien` = '"+nama+"'";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_pasien");
            data[1] = rs.getString("akun_pendaftar");
            data[2] = rs.getString("nama_pasien");
            data[3] = rs.getString("tanggal_lahir_psn");
            data[4] = rs.getString("tempat_lahir_psn");
            data[5] = rs.getInt("umur_pasien");
            data[6] = rs.getString("no_hp_pasien");
            data[7] = rs.getString("alamat_pasien");
            data[8] = rs.getString("jenis_kelamin_psn");
            data[9] = rs.getInt("keluhan");
            data[10] = rs.getString("nama_wali_psn");
            data[11] = rs.getString("no_telp_wali");
            data[12] = rs.getString("alamat_wali");


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static Object[] dataDokterBySpesialisasi(String namaSpesialisasi){

        connection();
        Object[] data = new Object[7];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_dokter WHERE tbl_dokter.`spesialisasi_dokter` IN (SELECT id_keluhan FROM tbl_keluhan WHERE `nama_keluhan` = '"+namaSpesialisasi+"')";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_dokter");
            data[1] = rs.getString("nama_dokter");
            data[2] = rs.getString("str_dokter");
            data[3] = rs.getString("no_hp_dokter");
            data[4] = rs.getString("alamat_dokter");
            data[5] = rs.getInt("biaya_jasa_dokter");
            data[6] = rs.getInt("spesialisasi_dokter");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static Object[] dataRuangan(String namaRuangan){

        connection();
        Object[] data = new Object[2];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_ruangan WHERE nama_ruangan = '"+namaRuangan+"'";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_ruangan");
            data[1] = rs.getString("nama_ruangan");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static boolean insertDataPasienPemeriksaan(int idAkun,int id_dokter){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "INSERT INTO `tbl_pemeriksaan`(`id_pasien`, `id_dokter`, `kelas_pasien`) VALUES ("+idAkun+","+id_dokter+",'bpjs')";
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

    public static boolean insertDataPasienMenginap(int idPemeriksaan,int idKamar){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "INSERT INTO tbl_pasien_menginap(`id_pemeriksaan`,`id_kamar`) VALUES ("+idPemeriksaan+","+idKamar+")";

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

    public static Object[] dataPemeriksaan(int id_pasien){

        connection();
        Object[] data = new Object[4];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM tbl_pemeriksaan WHERE id_pasien ="+id_pasien;

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_pemeriksaan");
            data[1] = rs.getInt("id_pasien");
            data[2] = rs.getInt("id_dokter");
            data[3] = rs.getString("kelas_pasien");

            stmt.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static Object[] infoPembayaranPasien(int idAkun){

        connection();
        Object[] data = new Object[12];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM `vwifodatapembayaranpasien` WHERE akun_pendaftar ="+idAkun;

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_pemeriksaan");
            data[1] = rs.getInt("id_pasien");
            data[2] = rs.getInt("akun_pendaftar");
            data[3] = rs.getString("nama_pasien");
            data[4] = rs.getString("kelas_pasien");
            data[5] = rs.getInt("id_kamar");
            data[6] = rs.getString("nama_ruangan");
            data[7] = rs.getString("nama_keluhan");
            data[8] = rs.getInt("keluhan");
            data[9] = rs.getInt("id_dokter");
            data[10] = rs.getInt("spesialisasi_dokter");
            data[11] = rs.getInt("biaya_jasa_dokter");

            stmt.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static boolean insertDataPembayaranPasien(int idPemeriksaan){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "INSERT INTO `tbl_pembayaran`(`id_pemeriksaan`, `metode_pembayaran`,`status_pembayaran`) VALUES ("+idPemeriksaan+",'bpjs',"+"'1')";

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

    public static Object[] dataTerdaftarPasien(int idAkun){

        connection();
        Object[] data = new Object[14];

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM `vwifodataterdaftarpasien` WHERE akun_pendaftar ="+idAkun;

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            data[0] = rs.getInt("id_pemeriksaan");
            data[1] = rs.getInt("id_pasien");
            data[2] = rs.getString("nama_pasien");
            data[3] = rs.getInt("akun_pendaftar");
            data[4] = rs.getInt("umur_pasien");
            data[5] = rs.getString("email_akun");
            data[6] = rs.getString("no_hp_pasien");
            data[7] = rs.getString("kelas_pasien");
            data[8] = rs.getInt("id_kamar");
            data[9] = rs.getString("nama_ruangan");
            data[10] = rs.getInt("keluhan");
            data[11] = rs.getString("nama_keluhan");
            data[12] = rs.getString("nama_wali_psn");
            data[13] = rs.getString("alamat_wali");
            

            stmt.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static DefaultTableModel tableModel(int id_akun){

        connection();
        String dataHeader[] = {"Id_pemeriksaan","Id_Pasien","Akun_Pendaftar","Nama_Pasien","Keluhan","Nama_keluhan","Id_kamar","Nama_Ruangan"};
        DefaultTableModel model = new DefaultTableModel(null,dataHeader);

        try {
            
            stmt = conn.createStatement();
            String query = "SELECT * FROM `vwriwayatpasien` WHERE akun_pendaftar ="+id_akun;
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Object[] data = {rs.getInt("id_pemeriksaan"),rs.getInt("id_pasien"),
                                rs.getInt("akun_pendaftar"),rs.getString("nama_pasien"),
                                rs.getInt("keluhan"),rs.getString("nama_keluhan"),
                                rs.getInt("id_kamar"),rs.getString("nama_ruangan")};
                model.addRow(data);
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }

    public static boolean UpdateDataPasien(int idAkun,String nama,int usia,String noHp,int keluhan,String pj,String alamat){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "UPDATE tbl_pasien SET nama_pasien = '"+nama+"', umur_pasien = "+usia+", no_hp_pasien = '"+noHp+"', keluhan = "+keluhan+", nama_wali_psn = '"+pj+"', alamat_pasien= '"+alamat+"' WHERE akun_pendaftar = "+idAkun;

            if (stmt.executeUpdate(query) >= 0) {
                status = true;
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;

    }

    public static boolean DeleteDataTblCustomer(int idAkun,String nama){

        connection();
        boolean status = false;

        try {
            
            stmt = conn.createStatement();
            String query = "DELETE FROM `tbl_pasien` WHERE tbl_pasien.akun_pendaftar = "+idAkun+" OR nama_pasien = '"+nama+"'";

            if (stmt.executeUpdate(query) >= 0) {
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
