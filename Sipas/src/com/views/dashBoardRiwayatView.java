package com.views;

import java.awt.event.MouseEvent;

import com.partials.cImage;
import com.programs.Controller;
import com.templates.cDashboardRiwayat;

public class dashBoardRiwayatView extends cDashboardRiwayat {

    final String berandaPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";

    cImage berandaIcon = new cImage(berandaPath,35, 35);

    public dashBoardRiwayatView(int id) {
        super();

        berandaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                Controller.showDashboard(id);
            }

        });

        initsDashboardRiwayat(id);
    }

    public void initsDashboardRiwayat( int id){

        berandaIcon.setBounds(1185, 10, 35, 35);
        header.add(berandaIcon);

        header.revalidate();
        header.repaint();
    }

}
