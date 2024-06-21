package com.templates;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;

public abstract class cdashboardPenyakit extends JFrame {

    public JPanel header = new JPanel();
    public JPanel body = new JPanel();
    public JPanel subBody = new JPanel();

    public JLabel titleInfo = new JLabel("Apa Keluhan Anda? ");
    public JLabel nama_penyakit = new JLabel("Kegilaan");
    public JLabel lbl_pesan_kamar = new JLabel("Ingin Memesan Kamar? ");
    
    public JLabel pengertian_lbl = new JLabel("Apa itu kegilaan? ");
    public JLabel titik2Label_1 = new JLabel(" : ");
    public JLabel penanganan_lbl = new JLabel("Cara penanganan ");
    public JLabel titik2Label_2 = new JLabel(" : ");

    public cdashboardPenyakit(){
        
        super();
        setUndecorated(true);
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        titleInfo.setForeground(cColor.BLACK_1);
        titleInfo.setBounds(35, 0, 1280, 50);
        titleInfo.setFont(cFonts.NO_HP_FONT_30);

        nama_penyakit.setForeground(cColor.BLACK_1);
        nama_penyakit.setBounds(530, 50, 1280, 50);
        nama_penyakit.setFont(cFonts.NO_HP_FONT_30);
        
        header.setBackground(cColor.GREEN_TOSKA);
        header.setBounds(35, 55, 1190, 150);
        header.setLayout(null);
        header.add(nama_penyakit);

        lbl_pesan_kamar.setForeground(cColor.BLACK_1);
        lbl_pesan_kamar.setBounds(540, 350, 1280, 500);
        //lbl_pesan_kamar.setFont(cFonts.NO_HP_FONT_30);


        body.setBackground(cColor.WHITE_100_1);
        body.setBounds(0,0,1280,720);
        body.setLayout(null);
        //body.add(lbl_pesan_kamar);

        pengertian_lbl.setForeground(cColor.BLACK_1);
        pengertian_lbl.setBounds(20, 5, 1280, 50);
        pengertian_lbl.setFont(cFonts.DAF_LOG_FONT_18);

        penanganan_lbl.setForeground(cColor.BLACK_1);
        penanganan_lbl.setBounds(20, 100, 1280, 50);
        penanganan_lbl.setFont(cFonts.DAF_LOG_FONT_18);

        titik2Label_1.setForeground(cColor.BLACK_1);
        titik2Label_1.setBounds(300, 5, 1280, 50);
        titik2Label_1.setFont(cFonts.DAF_LOG_FONT_18);

        titik2Label_2.setForeground(cColor.BLACK_1);
        titik2Label_2.setBounds(300, 100, 1280, 50);
        titik2Label_2.setFont(cFonts.DAF_LOG_FONT_18);

        subBody.setBackground(cColor.GREEN_TOSKA);
        subBody.setBounds(35, 240, 1190, 350);
        subBody.setLayout(null);
        subBody.add(pengertian_lbl);
        subBody.add(titik2Label_1);
        subBody.add(penanganan_lbl);
        subBody.add(titik2Label_2);

        add(titleInfo);
        add(header);
        add(body);
        body.add(subBody);

        setVisible(true);
    }

}
