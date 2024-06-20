package com.views;

import java.awt.event.MouseEvent;

import com.partials.cButton;
import com.partials.cCheckBox;
import com.partials.cColor;
import com.partials.cImage;
import com.partials.cTextFields;
import com.programs.Controller;
import com.templates.cDashboardIsiSaldo;

public class dashBoardIsiSaldoView extends cDashboardIsiSaldo {

    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 50, 50);
    cTextFields txtIsiSaldo = new cTextFields(55, 365,250, true);
    cButton isiSaldo_btn = new cButton("Isi", 315, 365, 70, 28, cColor.GREEN_TOSKA);

    public dashBoardIsiSaldoView(int id) {
        super();
        
        berandaImage.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
        
        initsIsiSaldo();
    }

    public void initsIsiSaldo(){
        berandaImage.setBounds(1150, 5, 100, 100);

        header.add(berandaImage);
        body.add(txtIsiSaldo);
        body.add(isiSaldo_btn);

    }


}
