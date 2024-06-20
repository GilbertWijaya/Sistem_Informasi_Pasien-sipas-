package com.templates;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cFormLabel;

public abstract class cDashboardIsiFormulir extends JFrame {

    public JPanel headerPanel = new JPanel();
    public JPanel bodyPanel = new JPanel();
    public JPanel subBodyPanel = new JPanel();

    public JLabel formLabel = new JLabel("Isi Formulir Saya");
    public JLabel CaptFormLabel = new JLabel("Berikut adalah data anda yang telah terdaftar");

    cFormLabel nama_lbl = new cFormLabel("Nama",35,10,1200,50);
    cFormLabel tempat_lhr_lbl = new cFormLabel("Tempat lahir",35,50,1200,50);
    cFormLabel tanggal_lhr_lbl = new cFormLabel("Tanggal lahir(YYYY-MM-DD)",35,90,1200,50);
    cFormLabel JK_lbl = new cFormLabel("Jenis Kelamin",35,130,1200,50);
    cFormLabel usia_lbl = new cFormLabel("Usia",35,170,1200,50);
    //cFormLabel email_lbl = new cFormLabel("Email",35,210,1200,50);
    cFormLabel nomorHP_lbl = new cFormLabel("Nomor HP",35,210,1200,50);
    cFormLabel kelas_lbl = new cFormLabel("Kelas",35,250,1200,50);
    cFormLabel ruang_lbl = new cFormLabel("Ruang",35,290,1200,50);
    cFormLabel penyakit_lbl = new cFormLabel("Penyakit",35,330,1200,50);
    cFormLabel pj_lbl = new cFormLabel("Penanggung Jawab",35,370,1200,50);
    cFormLabel alamat_lbl = new cFormLabel("Alamat",35,410,1200,50);

    cFormLabel titik2_lbl_1 = new cFormLabel(" : ",400,10,1200,50);
    cFormLabel titik2_lbl_2 = new cFormLabel(" : ",400,50,1200,50);
    cFormLabel titik2_lbl_3 = new cFormLabel(" : ",400,90,1200,50);
    cFormLabel titik2_lbl_4 = new cFormLabel(" : ",400,130,1200,50);
    cFormLabel titik2_lbl_5 = new cFormLabel(" : ",400,170,1200,50);
    cFormLabel titik2_lbl_6 = new cFormLabel(" : ",400,210,1200,50);
    cFormLabel titik2_lbl_7 = new cFormLabel(" : ",400,250,1200,50);
    cFormLabel titik2_lbl_8 = new cFormLabel(" : ",400,290,1200,50);
    cFormLabel titik2_lbl_9 = new cFormLabel(" : ",400,330,1200,50);
    cFormLabel titik2_lbl_10 = new cFormLabel(" : ",400,370,1200,50);
    cFormLabel titik2_lbl_11 = new cFormLabel(" : ",400,410,1200,50);

    public cDashboardIsiFormulir(){

        super();
        setSize(1280,720);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(true);

        formLabel.setForeground(cColor.BLACK_1);
        formLabel.setBounds(55, 0, 1280, 50);
        formLabel.setFont(cFonts.NAME_FONT_24);

        CaptFormLabel.setForeground(cColor.BLACK_1);
        CaptFormLabel.setBounds(55, 25, 1280, 50);
        CaptFormLabel.setFont(new Font("Poppins", Font.PLAIN, 15));

        headerPanel.setBackground(cColor.GREEN_TOSKA);
        headerPanel.setBounds(55, 70, 1150, 100);
        headerPanel.setLayout(null);

        subBodyPanel.setBackground(cColor.GREEN_TOSKA);
        subBodyPanel.setBounds(55, 180, 1150, 500);
        subBodyPanel.setLayout(null);
        subBodyPanel.add(nama_lbl);
        subBodyPanel.add(tempat_lhr_lbl);
        subBodyPanel.add(tanggal_lhr_lbl);
        subBodyPanel.add(JK_lbl);
        subBodyPanel.add(usia_lbl);
        //subBodyPanel.add(email_lbl);
        subBodyPanel.add(nomorHP_lbl);
        subBodyPanel.add(kelas_lbl);
        subBodyPanel.add(ruang_lbl);
        subBodyPanel.add(penyakit_lbl);
        subBodyPanel.add(pj_lbl);
        subBodyPanel.add(alamat_lbl);

        subBodyPanel.add(titik2_lbl_1);
        subBodyPanel.add(titik2_lbl_2);
        subBodyPanel.add(titik2_lbl_3);
        subBodyPanel.add(titik2_lbl_4);
        subBodyPanel.add(titik2_lbl_5);
        subBodyPanel.add(titik2_lbl_6);
        subBodyPanel.add(titik2_lbl_7);
        subBodyPanel.add(titik2_lbl_8);
        subBodyPanel.add(titik2_lbl_9);
        subBodyPanel.add(titik2_lbl_10);
        subBodyPanel.add(titik2_lbl_11);

        bodyPanel.setBackground(cColor.WHITE_100_1);
        bodyPanel.setBounds(0, 0, 1280, 720);
        bodyPanel.setLayout(null);
        bodyPanel.add(headerPanel);
        bodyPanel.add(subBodyPanel);
        


        add(formLabel);
        add(CaptFormLabel);
        add(bodyPanel);
        

        setVisible(true);
        
    }

}
