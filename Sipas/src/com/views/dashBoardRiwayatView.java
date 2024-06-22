package com.views;

import java.awt.event.MouseEvent;

import com.partials.cImage;
import com.partials.cScrollPane;
import com.partials.cTable;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cDashboardRiwayat;

public class dashBoardRiwayatView extends cDashboardRiwayat {

    final String berandaPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";

    cImage berandaIcon = new cImage(berandaPath,35, 35);
    cTable tableRiwayat;
    cScrollPane spTableRiwayat;

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

        tableRiwayat = new cTable(Model.tableModel(id));
        spTableRiwayat = new cScrollPane(tableRiwayat,30,30,1200,250);

        tableRiwayat.getColumnModel().getColumn(0).setWidth(0);
        tableRiwayat.getColumnModel().getColumn(0).setMinWidth(0);
        tableRiwayat.getColumnModel().getColumn(0).setMaxWidth(0);

        tableRiwayat.getColumnModel().getColumn(1).setWidth(0);
        tableRiwayat.getColumnModel().getColumn(1).setMinWidth(0);
        tableRiwayat.getColumnModel().getColumn(1).setMaxWidth(0);

        tableRiwayat.getColumnModel().getColumn(2).setWidth(0);
        tableRiwayat.getColumnModel().getColumn(2).setMinWidth(0);
        tableRiwayat.getColumnModel().getColumn(2).setMaxWidth(0);

        tableRiwayat.getColumnModel().getColumn(4).setWidth(0);
        tableRiwayat.getColumnModel().getColumn(4).setMinWidth(0);
        tableRiwayat.getColumnModel().getColumn(4).setMaxWidth(0);

        tableRiwayat.getColumnModel().getColumn(6).setWidth(0);
        tableRiwayat.getColumnModel().getColumn(6).setMinWidth(0);
        tableRiwayat.getColumnModel().getColumn(6).setMaxWidth(0);

        bodyPanel.add(spTableRiwayat);
        header.revalidate();
        header.repaint();
    }

}
