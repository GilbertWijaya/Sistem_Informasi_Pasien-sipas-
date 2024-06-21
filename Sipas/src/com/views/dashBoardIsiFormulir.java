package com.views;

import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cImage;
import com.partials.cRadioButton;
import com.partials.cTextFields;
import com.programs.Controller;
import com.templates.cDashboardIsiFormulir;

public class dashBoardIsiFormulir extends cDashboardIsiFormulir {

    final String isiFormulirPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Isi Formulir.png";
    final String menungguPembayaranPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Menunggu Pembayaran.png";
    final String terdaftarPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Terdaftar.png";

    cImage iconIsiFormulir = new cImage(isiFormulirPath, 50,50);
    cImage iconMenungguPembayaran = new cImage(menungguPembayaranPath, 90,90);
    cImage iconTerdaftar = new cImage(terdaftarPath, 50,50);
    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 35, 35);

    cTextFields txtNama = new cTextFields(450, 23, 500,true); 
    cTextFields txtTempatLahir = new cTextFields(450, 63, 500,true);
    cTextFields txtTanggalLahir = new cTextFields(450, 103, 500,true);  
    cRadioButton jk_radioBtn_Pria = new cRadioButton("Pria", "Pria",450 , 143, 100, 28);
    cRadioButton jk_radioBtn_Wanita = new cRadioButton("Wanita", "Wanita",555 , 143, 200, 28);
    cTextFields txtUsia = new cTextFields(450, 183, 500, true);
    cTextFields txtNoHP = new cTextFields(450, 223, 500, true);
    cRadioButton jk_radioBtn_Bpjs = new cRadioButton("BPJS", "BPJS",450 , 263, 100, 28);
    cRadioButton jk_radioBtn_Umum = new cRadioButton("UMUM", "UMUM",555 , 263, 200, 28);
    cTextFields txtRuang = new cTextFields(450, 303, 500, true);
    cTextFields txtPenyakit = new cTextFields(450, 343, 500, true);
    cTextFields txtPenanggungJawab = new cTextFields(450, 383, 500, true);
    cTextFields txtAlamat = new cTextFields(450, 423, 500, true);

    cButton isiFormulir_btn = new cButton("Isi Formulir", 1005, 685, 200, 28, cColor.GREEN_TOSKA);

    public dashBoardIsiFormulir() {
        
        super();

        berandaImage.addMouseListener(new java.awt.event.MouseAdapter() {
           
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                Controller.showDashboard(WIDTH);
            }

        });

        iconIsiFormulir.addMouseListener(new java.awt.event.MouseAdapter() {
           
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                Controller.showDashboardIsiFormulir();
            }

        });

        iconMenungguPembayaran.addMouseListener(new java.awt.event.MouseAdapter(){

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                Controller.showDashboardPembayaran(0);
            }

        });

        iconTerdaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                Controller.showDashboardTerdaftar();
            }

        });

        initIsiFormulir();

    }

    public void initIsiFormulir(){

        iconIsiFormulir.setBounds(350, 30, 50, 50);
        iconMenungguPembayaran.setBounds(540, 5, 90, 90);
        iconTerdaftar.setBounds(750, 30, 50, 50);
        berandaImage.setBounds(1170, 15, 35, 35);


        jk_radioBtn_Pria.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Wanita.setBackground(cColor.GREEN_TOSKA);
        ButtonGroup jk_group = new ButtonGroup();

        jk_radioBtn_Bpjs.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Umum.setBackground(cColor.GREEN_TOSKA);
        ButtonGroup jk_group_kelas = new ButtonGroup();

        headerPanel.add(iconIsiFormulir);        
        headerPanel.add(iconMenungguPembayaran);
        headerPanel.add(iconTerdaftar);

        subBodyPanel.add(txtNama);
        subBodyPanel.add(txtTempatLahir);
        subBodyPanel.add(txtTanggalLahir);
        subBodyPanel.add(jk_radioBtn_Pria);
        subBodyPanel.add(jk_radioBtn_Wanita);
        jk_group.add(jk_radioBtn_Pria);
        jk_group.add(jk_radioBtn_Wanita);
        subBodyPanel.add(txtUsia);
        subBodyPanel.add(txtNoHP);
        subBodyPanel.add(jk_radioBtn_Bpjs);
        subBodyPanel.add(jk_radioBtn_Umum);
        jk_group_kelas.add(jk_radioBtn_Bpjs);
        jk_group_kelas.add(jk_radioBtn_Umum);
        subBodyPanel.add(txtRuang);
        subBodyPanel.add(txtPenyakit);
        subBodyPanel.add(txtPenanggungJawab);
        subBodyPanel.add(txtAlamat);


        bodyPanel.add(berandaImage);   
        bodyPanel.add(isiFormulir_btn);
    }

}
