package com.views;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cImage;
import com.programs.Controller;
import com.templates.cDashboardKeluhan;

public class dashboardKeluhan extends cDashboardKeluhan {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png";
    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    cButton DiabetesBtn = new cButton("Diabetes", 50 , 85, 150, 70, cColor.BLUE_1);
    cButton AsmaBtn = new cButton("Asma", 250 , 85, 150, 70, cColor.BLUE_1);
    cButton DemamBtn = new cButton("Demam",505, 85, 150, 70, cColor.BLUE_1);
    cButton PanuBtn = new cButton("Panu", 750, 85, 150, 70, cColor.BLUE_1);
    cButton StrokeBtn = new cButton("Stroke", 945, 85, 150, 70, cColor.BLUE_1);

    public dashboardKeluhan(int id) {
        
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

        initsDashboardKeluhan(id);

    }

    public void initsDashboardKeluhan(int id){

        berandaIcon.setBounds(1175, 10, 35, 35);

        headerPanel.add(DiabetesBtn);
        headerPanel.add(AsmaBtn);
        headerPanel.add(DemamBtn);
        headerPanel.add(PanuBtn);
        headerPanel.add(StrokeBtn);
        
        panel.add(berandaIcon);        
    }

}
