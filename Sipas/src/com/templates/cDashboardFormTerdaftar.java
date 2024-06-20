package com.templates;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cFormLabel;

public abstract class cDashboardFormTerdaftar extends JFrame {

    public JPanel headerPanel = new JPanel();
    public JPanel bodyPanel = new JPanel();
    public JPanel subBodyPanel = new JPanel();

    public JLabel formLabel = new JLabel("Formulir Saya");
    public JLabel CaptFormLabel = new JLabel("Berikut adalah data anda yang telah terdaftar");

    cFormLabel nama_lbl = new cFormLabel("Nama",35,10,1200,50);
    cFormLabel usia_lbl = new cFormLabel("Usia",35,50,1200,50);
    cFormLabel email_lbl = new cFormLabel("Email",35,90,1200,50);
    cFormLabel nomorHP_lbl = new cFormLabel("Nomor HP",35,130,1200,50);
    cFormLabel kelas_lbl = new cFormLabel("Kelas",35,170,1200,50);
    cFormLabel ruang_lbl = new cFormLabel("Ruang",35,210,1200,50);
    cFormLabel penyakit_lbl = new cFormLabel("Penyakit",35,250,1200,50);
    cFormLabel pj_lbl = new cFormLabel("Penanggung Jawab",35,290,1200,50);
    cFormLabel alamat_lbl = new cFormLabel("Alamat",35,330,1200,50);

    cFormLabel titik2_lbl_1 = new cFormLabel(" : ",400,10,1200,50);
    cFormLabel titik2_lbl_2 = new cFormLabel(" : ",400,50,1200,50);
    cFormLabel titik2_lbl_3 = new cFormLabel(" : ",400,90,1200,50);
    cFormLabel titik2_lbl_4 = new cFormLabel(" : ",400,130,1200,50);
    cFormLabel titik2_lbl_5 = new cFormLabel(" : ",400,170,1200,50);
    cFormLabel titik2_lbl_6 = new cFormLabel(" : ",400,210,1200,50);
    cFormLabel titik2_lbl_7 = new cFormLabel(" : ",400,250,1200,50);
    cFormLabel titik2_lbl_8 = new cFormLabel(" : ",400,290,1200,50);
    cFormLabel titik2_lbl_9 = new cFormLabel(" : ",400,330,1200,50);

    // public cFormLabel Value_nama_lbl = new cFormLabel("test",450,10,1200,50);
    // public cFormLabel Value_usia_lbl = new cFormLabel("test",450,50,1200,50);
    // public cFormLabel Value_email_lbl = new cFormLabel("test",450,90,1200,50);
    // public cFormLabel Value_nomorHP_lbl = new cFormLabel("test",450,130,1200,50);
    // public cFormLabel Value_kelas_lbl = new cFormLabel("test",450,170,1200,50);
    // public cFormLabel Value_ruang_lbl = new cFormLabel("test",450,210,1200,50);
    // public cFormLabel Value_penyakit_lbl = new cFormLabel("test",450,250,1200,50);
    // public cFormLabel Value_pj_lbl = new cFormLabel("test",450,290,1200,50);
    // public cFormLabel Value_alamat_lbl = new cFormLabel("test",450,330,1200,50);


    public cDashboardFormTerdaftar(){
        
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
        subBodyPanel.setBounds(55, 200, 1150, 450);
        subBodyPanel.setLayout(null);
        subBodyPanel.add(nama_lbl);
        subBodyPanel.add(usia_lbl);
        subBodyPanel.add(email_lbl);
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

        // subBodyPanel.add(Value_nama_lbl);
        // subBodyPanel.add(Value_usia_lbl);
        // subBodyPanel.add(Value_email_lbl);
        // subBodyPanel.add(Value_nomorHP_lbl);
        // subBodyPanel.add(Value_kelas_lbl);
        // subBodyPanel.add(Value_ruang_lbl);
        // subBodyPanel.add(Value_penyakit_lbl);
        // subBodyPanel.add(Value_pj_lbl);
        // subBodyPanel.add(Value_alamat_lbl);

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
