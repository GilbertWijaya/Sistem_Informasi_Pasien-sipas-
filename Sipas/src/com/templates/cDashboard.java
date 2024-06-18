package com.templates;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cLinkKeluar;

public class cDashboard extends JFrame {

    public JPanel header = new JPanel();
    public JPanel saldoPanel = new JPanel();
    public JPanel body = new JPanel();
    public cLinkKeluar linkkeluar = new cLinkKeluar(1135,15);

    public JLabel selamatDatang_Lbl = new JLabel("Selamat Datang");
    public JLabel nama_anda_lbl = new JLabel("nama anda");

    public cDashboard(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280,720);
        setLocationRelativeTo(null);
        setLayout(null);
        //setResizable(false);
        //setUndecorated(true);

        header.setBackground(cColor.GREEN_TOSKA);
        header.setBounds(0, 0, 1280, 300);
        header.setLayout(null);

        selamatDatang_Lbl.setBounds(50, 0, 200, 50);
        selamatDatang_Lbl.setFont(cFonts.WELCOME_FONT_19);
        nama_anda_lbl.setBounds(50, 27, 200, 50);
        nama_anda_lbl.setFont(cFonts.TEXTFIELD_LBL_BUTTON_FONT_36);

        saldoPanel.setBackground(cColor.WHITE_100_1);
        saldoPanel.setBounds(50, 80, 1157, 180);
        saldoPanel.setLayout(null);

        body.setBackground(cColor.WHITE_100_1);
        body.setBounds(0, 0, 1280, 440);
        body.setLayout(null);

        add(header);
        header.add(saldoPanel);
        header.add(selamatDatang_Lbl);
        header.add(nama_anda_lbl);
        header.add(linkkeluar);
        add(body);

        setVisible(true);
    }

}
