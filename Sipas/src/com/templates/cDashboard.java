package com.templates;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cImage;
import com.partials.cLinkKeluar;

public class cDashboard extends JFrame {

    public JPanel header = new JPanel();
    public JPanel saldoPanel = new JPanel();
    public JPanel body = new JPanel();
    JComponent garisCompBPJS = new JComponent(){
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            g.drawLine(180,0, 180, 400);

        };


    };

    JComponent garisCompFooter = new JComponent(){
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            g.drawLine(20,28, 1200, 28);

        };


    };

    public cLinkKeluar linkkeluar = new cLinkKeluar(1135,15);

    public JLabel selamatDatang_Lbl = new JLabel("Selamat Datang");
    public JLabel nama_anda_lbl = new JLabel("nama anda");
    public JLabel saran_lbl = new JLabel("Jaga kesehatan yaa");
    public JLabel Saldo_Bpjs_label = new JLabel("SALDO BPJS");
    public JLabel jumlah_saldo_lbl = new JLabel("RP 0");
    

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
        garisCompBPJS.setBounds(400, 20, 200, 140);
        garisCompBPJS.setForeground(cColor.GREEN_TOSKA);
        garisCompFooter.setBounds(20,300, 1200, 30);
        garisCompFooter.setForeground(cColor.GREEN_TOSKA);
        saran_lbl.setBounds(550,300,200,100);
        saran_lbl.setFont(cFonts.DAF_LOG_FONT_18);
        saran_lbl.setForeground(cColor.BLACK_1);

        cImage iconBpjs = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\logobpjs.png", 75, 51);
        iconBpjs.setBounds(25, 30, 75, 51);
        Saldo_Bpjs_label.setBounds(85, 35, 200,20);
        Saldo_Bpjs_label.setFont(cFonts.DAF_LOG_FONT_18);
        jumlah_saldo_lbl.setBounds(40, 80, 200,20);
        jumlah_saldo_lbl.setFont(cFonts.DAF_LOG_FONT_18);

        saldoPanel.setBackground(cColor.WHITE_100_1);
        saldoPanel.setBounds(50, 80, 1157, 180);
        saldoPanel.setLayout(null);
        saldoPanel.add(iconBpjs);
        saldoPanel.add(garisCompBPJS);
        saldoPanel.add(Saldo_Bpjs_label);
        saldoPanel.add(jumlah_saldo_lbl);

        body.setBackground(cColor.WHITE_100_1);
        body.setBounds(0, 300, 1280, 420);
        body.setLayout(null);
        body.add(saran_lbl);
        body.add(garisCompFooter);
        

        add(header);
        header.add(saldoPanel);
        header.add(selamatDatang_Lbl);
        header.add(nama_anda_lbl);
        header.add(linkkeluar);
        add(body);

        setVisible(true);
    }

}
