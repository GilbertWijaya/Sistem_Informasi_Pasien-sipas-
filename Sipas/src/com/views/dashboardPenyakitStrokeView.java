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

public class dashboardPenyakitStrokeView extends cdashboardPenyakit {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";
    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    cScrollPane spPengertianStroke;
    cScrollPane spPenangananStroke;

    cTextArea txtAreaPengertianStroke = new cTextArea(330,25,750, 80, false);
    cTextArea txtAreaPenangananStroke = new cTextArea(330,110,750, 220, false);

    
    public dashboardPenyakitStrokeView(int id) {
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

        initsPenyakitStroke();
    }

    public void initsPenyakitStroke(){

        berandaIcon.setBounds(1190, 10, 35, 35);
        nama_penyakit.setText("Stroke");

        pengertian_lbl.setText("Apa itu Stroke");
        txtAreaPengertianStroke.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPengertianStroke.setText(Model.detailPenyakit("stroke")[2].toString());
        spPengertianStroke = new cScrollPane(txtAreaPengertianStroke, 330, 25,800, 80);
        spPengertianStroke.setBorder(new LineBorder(cColor.BLACK_1,1));

        txtAreaPenangananStroke.setFont(new Font("Poppins",Font.PLAIN,18));
        txtAreaPenangananStroke.setText(Model.detailPenyakit("stroke")[3].toString());
        spPenangananStroke= new cScrollPane(txtAreaPenangananStroke, 330, 110,800, 220);
        spPenangananStroke.setBorder(new LineBorder(cColor.BLACK_1,1));


        body.add(berandaIcon);
        subBody.add(spPengertianStroke);
        subBody.add(spPenangananStroke);
        
    }

}
