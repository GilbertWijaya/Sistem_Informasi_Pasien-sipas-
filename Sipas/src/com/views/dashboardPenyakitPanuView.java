package com.views;

import java.awt.Font;

import javax.swing.border.LineBorder;

import com.partials.cColor;
import com.partials.cImage;
import com.partials.cScrollPane;
import com.partials.cTextArea;
import com.programs.Controller;
import com.templates.cdashboardPenyakit;

public class dashboardPenyakitPanuView extends cdashboardPenyakit {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";
    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    cScrollPane spPengertianPanu;
    cScrollPane spPenangananPanu;

    cTextArea txtAreaPengertianPanu = new cTextArea(330,25,750, 80, true);
    cTextArea txtAreaPenangananPanu = new cTextArea(330,110,750, 220, true);

    
    public dashboardPenyakitPanuView() {
        super();

        berandaIcon.addMouseListener(new java.awt.event.MouseAdapter(){

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

        initsPenyakitPanu();
    }

    public void initsPenyakitPanu(){

        berandaIcon.setBounds(1190, 10, 35, 35);
        nama_penyakit.setText("Panu");

        pengertian_lbl.setText("Apa itu Panu");
        txtAreaPengertianPanu.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPengertianPanu.setText("Diabetes adalah penyakit kronis yang disebabkan oleh kadar gula dalam darah tinggi. "
                + "Kadar gula dalam darah tinggi adalah kadar gula dalam darah yang lebih tinggi dari normal."
                + "Kadar gula dalam darah tinggi dapat menyebabkan penurunan");
        spPengertianPanu = new cScrollPane(txtAreaPengertianPanu, 330, 25,800, 80);
        spPengertianPanu.setBorder(new LineBorder(cColor.BLACK_1,1));

        txtAreaPenangananPanu.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPenangananPanu.setText("Diabetes adalah penyakit kronis yang disebabkan oleh kadar gula dalam darah tinggi. "
                + "Kadar gula dalam darah tinggi adalah kadar gula dalam darah yang lebih tinggi dari normal."
                + "Kadar gula dalam darah tinggi dapat menyebabkan penurunan");
        spPenangananPanu= new cScrollPane(txtAreaPenangananPanu, 330, 110,800, 220);
        spPenangananPanu.setBorder(new LineBorder(cColor.BLACK_1,1));


        body.add(berandaIcon);
        subBody.add(spPengertianPanu);
        subBody.add(spPenangananPanu);
        
    }

}
