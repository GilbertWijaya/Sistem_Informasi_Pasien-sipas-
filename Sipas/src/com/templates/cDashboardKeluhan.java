package com.templates;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cImage;

public abstract class cDashboardKeluhan extends JFrame {

    public JPanel headerPanel = new JPanel();
    public JPanel panel = new JPanel();

    public JLabel titleInfo = new JLabel("Apa Keluhan Anda? ");
    //public JLabel pesanKamar = new JLabel("Ingin Memesan Kamar? ");

    public cDashboardKeluhan(){
        
        super();
        setSize(1280,720);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(cColor.WHITE_100_1);

        titleInfo.setForeground(cColor.BLACK_1);
        titleInfo.setBounds(55, 5, 1280, 55);
        titleInfo.setFont(cFonts.NAME_FONT_24);

        headerPanel.setBackground(cColor.GREEN_TOSKA);
        headerPanel.setBounds(55, 60, 1150, 250);
        headerPanel.setLayout(null);

        cImage dokter_icon = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Gambar Dokter.png", 300, 291);
        dokter_icon.setBounds(470, 320, 300, 291);

        //pesanKamar.setForeground(cColor.BLACK_1);
        //pesanKamar.setBounds(485, 580, 1280, 55);
        //pesanKamar.setFont(cFonts.NAME_FONT_24);

        panel.setBackground(cColor.WHITE_100_1);
        panel.setBounds(0, 0, 1280, 720);
        panel.setLayout(null);
        panel.add(dokter_icon);
        //panel.add(pesanKamar);

        add(headerPanel);
        add(titleInfo);
        add(panel);

        setVisible(true);   
    }
    
}
