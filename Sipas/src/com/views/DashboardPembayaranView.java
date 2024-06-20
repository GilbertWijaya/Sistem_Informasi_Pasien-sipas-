package com.views;

import java.awt.event.MouseEvent;

import com.partials.cButton;
import com.partials.cCheckBox;
import com.partials.cColor;
import com.partials.cImage;
import com.programs.Controller;
import com.templates.cDashboardPembayaran;

public class DashboardPembayaranView extends cDashboardPembayaran {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png"; 

    cCheckBox aggrement = new cCheckBox("Saya menyetujui syarat dan ketentuan","Setuju",50 ,50);
    cButton bayarBtn = new cButton("Bayar",540,650 ,200, 35, cColor.GREEN_TOSKA);

    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    public DashboardPembayaranView(int id) {
        
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

        initsDashboardPembayaran(id);
    }

    public void initsDashboardPembayaran(int id){

        berandaIcon.setBounds(1190, 10, 35, 35);
        aggrement.setBounds(33, 390, 500, 50);

        panelUtama.add(berandaIcon);
        panelUtama.add(aggrement);
        panelUtama.add(bayarBtn);
        
        panelUtama.revalidate();
        panelUtama.repaint();
    }

}
