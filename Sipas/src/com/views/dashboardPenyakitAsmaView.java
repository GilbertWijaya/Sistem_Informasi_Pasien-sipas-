package com.views;

import java.awt.Font;

import javax.swing.border.LineBorder;

import org.w3c.dom.events.MouseEvent;

import com.partials.cColor;
import com.partials.cImage;
import com.partials.cScrollPane;
import com.partials.cTextArea;
import com.programs.Controller;
import com.templates.cDashboardKeluhan;
import com.templates.cdashboardPenyakit;

public class dashboardPenyakitAsmaView extends cdashboardPenyakit {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";
    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    cScrollPane spPengertianAsma;
    cScrollPane spPenangananAsma;

    cTextArea txtAreaPengertianAsma = new cTextArea(330,25,750, 80, true);
    cTextArea txtAreaPenangananAsma = new cTextArea(330,110,750, 220, true);

    
    public dashboardPenyakitAsmaView() {
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

        initsPenyakitDiabetes();
    }

    public void initsPenyakitDiabetes(){

        berandaIcon.setBounds(1190, 10, 35, 35);
        nama_penyakit.setText("Asma");

        pengertian_lbl.setText("Apa itu Asma");
        txtAreaPengertianAsma.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPengertianAsma.setText("Diabetes adalah penyakit kronis yang disebabkan oleh kadar gula dalam darah tinggi. "
                + "Kadar gula dalam darah tinggi adalah kadar gula dalam darah yang lebih tinggi dari normal."
                + "Kadar gula dalam darah tinggi dapat menyebabkan penurunan");
        spPengertianAsma = new cScrollPane(txtAreaPengertianAsma, 330, 25,800, 80);
        spPengertianAsma.setBorder(new LineBorder(cColor.BLACK_1,1));

        txtAreaPenangananAsma.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPenangananAsma.setText("Diabetes adalah penyakit kronis yang disebabkan oleh kadar gula dalam darah tinggi. "
                + "Kadar gula dalam darah tinggi adalah kadar gula dalam darah yang lebih tinggi dari normal."
                + "Kadar gula dalam darah tinggi dapat menyebabkan penurunan");
        spPenangananAsma= new cScrollPane(txtAreaPenangananAsma, 330, 110,800, 220);
        spPenangananAsma.setBorder(new LineBorder(cColor.BLACK_1,1));


        body.add(berandaIcon);
        subBody.add(spPengertianAsma);
        subBody.add(spPenangananAsma);
        
    }

}