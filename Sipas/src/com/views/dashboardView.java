package com.views;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.partials.cFormLabel;
import com.partials.cImage;
import com.programs.Controller;
import com.templates.cDashboard;

public class dashboardView extends cDashboard {

    final String riwayatIconPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Rowayat.png";
    final String isiSaldoPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logi Isi Saldo.png";
    final String pendaftaranPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Pendaftaran.png";
    final String konsultasiPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Konsultasi.png";

    private cImage isiSaldoIcon = new cImage(isiSaldoPath,200,150); 
    private cImage RiwayatIcon = new cImage(riwayatIconPath,200,150);
    private cImage pendaftaranIcon = new cImage(pendaftaranPath,150,150);
    private cImage konsultasiIcon = new cImage(konsultasiPath,130,130);

    cFormLabel isiSaldoLabel = new cFormLabel("Isi Saldo",710 , 120,100, 50);
    cFormLabel RiwayatLabel = new cFormLabel("Riwayat",915 , 120,100, 50);
    cFormLabel pendaftaranLabel = new cFormLabel("Pendaftaran",400 ,180, 150, 50);
    cFormLabel konsultasiLabel = new cFormLabel("Konsultasi",800 ,180, 150, 50);

    private void refreshContent(){

        try {
            
            header.removeAll();
            saldoPanel.removeAll();
            body.removeAll();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public dashboardView(int id){
        super();
        
        isiSaldoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                Controller.showDashboardIsiSaldo(id);
            }

        });

        RiwayatIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                Controller.showDashboardRiwayat(id);
            }

        });

        pendaftaranIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                //Controller.showDashboardIsiSaldo(id);
            }

        });

        konsultasiIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                //Controller.showDashboardIsiSaldo(id);
            }

        });
        
        initsDasboardUtamaPasien();
    }

    public void initsDasboardUtamaPasien(){

        isiSaldoIcon.setBounds(650, 43, 200, 100);
        RiwayatIcon.setBounds(850,43, 200, 100);
        pendaftaranIcon.setBounds(380,45, 150, 150);
        konsultasiIcon.setBounds(780,60, 130, 130);
        

        body.add(pendaftaranIcon);
        body.add(pendaftaranLabel);
        body.add(konsultasiIcon);
        body.add(konsultasiLabel);
    
        saldoPanel.add(isiSaldoLabel);
        saldoPanel.add(RiwayatLabel);
        saldoPanel.add(RiwayatIcon);
        saldoPanel.add(isiSaldoIcon);

        body.revalidate();
        body.repaint();
        saldoPanel.revalidate();
        saldoPanel.repaint();

    }
    

}
