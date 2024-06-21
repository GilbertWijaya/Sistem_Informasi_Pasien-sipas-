package com.views;

import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cImage;
import com.partials.cScrollPane;
import com.partials.cTextArea;
import com.programs.Controller;
import com.templates.cdashboardPenyakit;

public class dashboardPenyakitDiabetesView extends cdashboardPenyakit {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";
    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    cScrollPane spPengertianDiabetes;
    cScrollPane spPenangananDiabetes;

    cTextArea txtAreaPengertianDiabetes = new cTextArea(330,25,750, 80, true);
    cTextArea txtAreaPenangananDiabetes = new cTextArea(330,110,750, 220, true);

    
    public dashboardPenyakitDiabetesView() {
        super();

        berandaIcon.addMouseListener(new java.awt.event.MouseAdapter(){

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

        initsPenyakitDiabetes();
    }

    public void initsPenyakitDiabetes(){

        berandaIcon.setBounds(1190, 10, 35, 35);
        nama_penyakit.setText("Diabetes");

        pengertian_lbl.setText("Apa itu diabetes");
        txtAreaPengertianDiabetes.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPengertianDiabetes.setText("Diabetes adalah penyakit kronis yang disebabkan oleh kadar gula dalam darah tinggi. "
                + "Kadar gula dalam darah tinggi adalah kadar gula dalam darah yang lebih tinggi dari normal."
                + "Kadar gula dalam darah tinggi dapat menyebabkan penurunan");
        spPengertianDiabetes = new cScrollPane(txtAreaPengertianDiabetes, 330, 25,800, 80);
        spPengertianDiabetes.setBorder(new LineBorder(cColor.BLACK_1,1));

        txtAreaPenangananDiabetes.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPenangananDiabetes.setText("Diabetes adalah penyakit kronis yang disebabkan oleh kadar gula dalam darah tinggi. "
                + "Kadar gula dalam darah tinggi adalah kadar gula dalam darah yang lebih tinggi dari normal."
                + "Kadar gula dalam darah tinggi dapat menyebabkan penurunan");
        spPenangananDiabetes= new cScrollPane(txtAreaPenangananDiabetes, 330, 110,800, 220);
        spPenangananDiabetes.setBorder(new LineBorder(cColor.BLACK_1,1));


        body.add(berandaIcon);
        subBody.add(spPengertianDiabetes);
        subBody.add(spPenangananDiabetes);
        
        
    }

}
