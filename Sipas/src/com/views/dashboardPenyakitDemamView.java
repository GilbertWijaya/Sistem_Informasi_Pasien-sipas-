package com.views;

import java.awt.Font;

import javax.swing.border.LineBorder;

import com.partials.cColor;
import com.partials.cImage;
import com.partials.cScrollPane;
import com.partials.cTextArea;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cdashboardPenyakit;

public class dashboardPenyakitDemamView extends cdashboardPenyakit {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";
    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    cScrollPane spPengertianDemam;
    cScrollPane spPenangananDemam;

    cTextArea txtAreaPengertianDemam = new cTextArea(330,25,750, 80, false);
    cTextArea txtAreaPenangananDemam = new cTextArea(330,110,750, 220, false);

    
    public dashboardPenyakitDemamView(int id) {
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
                Controller.showDashboard(id);
            }

        });

        initsPenyakitDemam();
    }

    public void initsPenyakitDemam(){

        berandaIcon.setBounds(1190, 10, 35, 35);
        nama_penyakit.setText("Demam");

        pengertian_lbl.setText("Apa itu Demam");
        txtAreaPengertianDemam.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPengertianDemam.setText(Model.detailPenyakit("demam")[2].toString());
        spPengertianDemam = new cScrollPane(txtAreaPengertianDemam, 330, 25,800, 80);
        spPengertianDemam.setBorder(new LineBorder(cColor.BLACK_1,1));

        txtAreaPenangananDemam.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPenangananDemam.setText(Model.detailPenyakit("demam")[3].toString());
        spPenangananDemam= new cScrollPane(txtAreaPenangananDemam, 330, 110,800, 220);
        spPenangananDemam.setBorder(new LineBorder(cColor.BLACK_1,1));


        body.add(berandaIcon);
        subBody.add(spPengertianDemam);
        subBody.add(spPenangananDemam);
        
    }

}
