package com.views;

import javax.swing.ButtonGroup;

import org.w3c.dom.events.MouseEvent;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cImage;
import com.partials.cRadioButton;
import com.partials.cTextFields;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cDashboardFormTerdaftar;

public class dashboardTerdaftarView extends cDashboardFormTerdaftar {

    final String isiFormulirPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Isi Formulir.png";
    final String menungguPembayaranPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Menunggu Pembayaran.png";
    final String terdaftarPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Terdaftar.png";

    cImage iconIsiFormulir = new cImage(isiFormulirPath, 50,50);
    cImage iconTerdaftar = new cImage(terdaftarPath, 50,50);
    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 35, 35);

    cTextFields txtNama = new cTextFields(450, 23, 500,false); 
    cTextFields txtEmail = new cTextFields(450, 63, 500,false);
    cTextFields txtUsia = new cTextFields(450, 103, 500, false);
    cTextFields txtNoHP = new cTextFields(450, 143, 500, false);
    cRadioButton jk_radioBtn_Bpjs = new cRadioButton("BPJS", "bpjs",450 , 183, 100, 28);
    cRadioButton jk_radioBtn_Umum = new cRadioButton("UMUM", "umum",555 , 183, 200, 28);
    ButtonGroup jk_group_kelas;
    cTextFields txtRuang = new cTextFields(450, 223, 500, false);
    cTextFields txtPenyakit = new cTextFields(450, 263, 500, false);
    cTextFields txtPenanggungJawab = new cTextFields(450, 303, 500, false);
    cTextFields txtAlamat = new cTextFields(450, 343, 500, false);

    cButton EditFormulir_btn = new cButton("Edit Formulir", 1005, 655, 200, 28, cColor.GREEN_TOSKA);
    cButton HapusFormulir_btn = new cButton("Hapus Formulir", 795, 655, 200, 28, cColor.GREEN_TOSKA);


    public dashboardTerdaftarView(int id) {
        
        super();

        berandaImage.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                Controller.showDashboard(id);
            }

        });

        iconIsiFormulir.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                Controller.showDashboardIsiFormulir(id);
            }

        });        

        initIsiFormulir(id);

    }

    public void initIsiFormulir(int id){

        iconIsiFormulir.setBounds(350, 30, 50, 50);
        iconTerdaftar.setBounds(750, 30, 50, 50);
        berandaImage.setBounds(1170, 15, 35, 35);;

        jk_radioBtn_Bpjs.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Umum.setBackground(cColor.GREEN_TOSKA);
        jk_group_kelas = new ButtonGroup();
        

        headerPanel.add(iconIsiFormulir);        
        headerPanel.add(iconTerdaftar);

        subBodyPanel.add(txtNama);
        txtNama.setText(Model.dataTerdaftarPasien(id)[2].toString());
        subBodyPanel.add(txtEmail);
        txtEmail.setText(Model.dataTerdaftarPasien(id)[4].toString());
        subBodyPanel.add(txtUsia);
        txtUsia.setText(Model.dataTerdaftarPasien(id)[5].toString());
        subBodyPanel.add(txtNoHP);
        txtNoHP.setText(Model.dataTerdaftarPasien(id)[6].toString());
        subBodyPanel.add(jk_radioBtn_Bpjs);
        subBodyPanel.add(jk_radioBtn_Umum);
        jk_group_kelas.add(jk_radioBtn_Bpjs);
        jk_group_kelas.add(jk_radioBtn_Umum);
        
        String kelas = Model.dataTerdaftarPasien(id)[7].toString();
        System.out.println(kelas);
        if (kelas.equalsIgnoreCase("bpjs")) {
            jk_radioBtn_Bpjs.setSelected(true);
        }else{
            jk_radioBtn_Umum.setSelected(true);
        }

        subBodyPanel.add(txtRuang);
        txtRuang.setText(Model.dataTerdaftarPasien(id)[9].toString());
        subBodyPanel.add(txtPenyakit);
        txtPenyakit.setText(Model.dataTerdaftarPasien(id)[11].toString());
        subBodyPanel.add(txtPenanggungJawab);
        txtPenanggungJawab.setText(Model.dataTerdaftarPasien(id)[12].toString());
        subBodyPanel.add(txtAlamat);
        txtAlamat.setText(Model.dataTerdaftarPasien(id)[13].toString());


        bodyPanel.add(berandaImage);   
        bodyPanel.add(EditFormulir_btn);
        bodyPanel.add(HapusFormulir_btn);
    }

}
