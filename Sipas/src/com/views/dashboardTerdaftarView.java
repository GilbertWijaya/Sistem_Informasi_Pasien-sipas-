package com.views;

import javax.swing.ButtonGroup;

import org.w3c.dom.events.MouseEvent;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cImage;
import com.partials.cRadioButton;
import com.partials.cTextFields;
import com.programs.Controller;
import com.templates.cDashboardFormTerdaftar;

public class dashboardTerdaftarView extends cDashboardFormTerdaftar {

    final String isiFormulirPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Isi Formulir.png";
    final String menungguPembayaranPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Menunggu Pembayaran.png";
    final String terdaftarPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Terdaftar.png";

    cImage iconIsiFormulir = new cImage(isiFormulirPath, 50,50);
    cImage iconTerdaftar = new cImage(terdaftarPath, 50,50);
    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 35, 35);

    cTextFields txtNama = new cTextFields(450, 23, 500,true); 
    cTextFields txtEmail = new cTextFields(450, 63, 500,true);
    cTextFields txtUsia = new cTextFields(450, 103, 500, true);
    cTextFields txtNoHP = new cTextFields(450, 143, 500, true);
    cRadioButton jk_radioBtn_Bpjs = new cRadioButton("BPJS", "BPJS",450 , 183, 100, 28);
    cRadioButton jk_radioBtn_Umum = new cRadioButton("UMUM", "UMUM",555 , 183, 200, 28);
    cTextFields txtRuang = new cTextFields(450, 223, 500, true);
    cTextFields txtPenyakit = new cTextFields(450, 263, 500, true);
    cTextFields txtPenanggungJawab = new cTextFields(450, 303, 500, true);
    cTextFields txtAlamat = new cTextFields(450, 343, 500, true);

    cButton EditFormulir_btn = new cButton("Edit Formulir", 1005, 655, 200, 28, cColor.GREEN_TOSKA);

    public dashboardTerdaftarView() {
        
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
                Controller.showDashboard(WIDTH);
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
                Controller.showDashboardIsiFormulir();
            }

        });        

        initIsiFormulir();

    }

    public void initIsiFormulir(){

        iconIsiFormulir.setBounds(350, 30, 50, 50);
        iconTerdaftar.setBounds(750, 30, 50, 50);
        berandaImage.setBounds(1170, 15, 35, 35);;

        jk_radioBtn_Bpjs.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Umum.setBackground(cColor.GREEN_TOSKA);
        ButtonGroup jk_group_kelas = new ButtonGroup();

        headerPanel.add(iconIsiFormulir);        
        headerPanel.add(iconTerdaftar);

        subBodyPanel.add(txtNama);
        subBodyPanel.add(txtEmail);
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
        bodyPanel.add(EditFormulir_btn);
    }

}
