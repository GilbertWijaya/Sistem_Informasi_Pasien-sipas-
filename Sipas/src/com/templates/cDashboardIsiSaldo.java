package com.templates;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cImage;

public abstract class cDashboardIsiSaldo extends JFrame {

    public JPanel header = new JPanel();
    public JPanel body = new JPanel();
    public JPanel subPanel = new JPanel();
    public JPanel panel_info = new JPanel();

    JComponent BatasHorizontal = new JComponent(){
        
        protected void paintComponent(java.awt.Graphics g) {

            super.paintComponent(g);
            g.drawLine(20,28, 1200, 28);

        };

    };

    JComponent BatasVertical = new JComponent(){
        
        protected void paintComponent(java.awt.Graphics g) {

            super.paintComponent(g);
            g.drawLine(180,0, 180, 400);

        };

    };

    public JLabel isiSaldoLabel = new JLabel("Isi Saldo BPJS");
    public JLabel nomorHpAnda = new JLabel("Nomor HP Anda");
    public JLabel nomorHp = new JLabel("085732745305");
    public JLabel informasi = new JLabel("Ini adalah nomor anda untuk melakukan pengisian saldo");
    public JLabel BPJSBayar = new JLabel("BPJSBayar");
    public JLabel saldoBpjs = new JLabel("RP 0");
    public JLabel keterangan_label = new JLabel("Saldo Anda akan otomatis ter-update 5 menit setelah proses Top-Up anda selesai,"+ 
    "mohon lakukan pengecekan secara berkala. ");
    public JLabel keterangan_label_2 = new JLabel("Ada penyesuaian biaya layanan untuk top-up / isi saldo BPJSBayar,saldo yang diterima tidak akan dipotong oleh pihak Bank sebagai biaya layanan.");
    public JLabel peraturan_label = new JLabel("Isi Saldo BPJSBayar");
    public JLabel lbl_peraturan_1 = new JLabel("1. Anda hanya bisa melakukan pengisian saldo 3 kali dalam sehari");
    public JLabel lbl_peraturan_2 = new JLabel("2. Minimal pengisian saldo adalah Rp 50.000");
    public JLabel lbl_peraturan_3 = new JLabel("3. Saldo akan bertambah otomatis setelah anda melakukan pengisian saldo");
    public JLabel nominal = new JLabel("Masukan nominal");


    public cDashboardIsiSaldo(){

        super();
        setSize(1280, 720);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        isiSaldoLabel.setForeground(cColor.BLACK_1);
        isiSaldoLabel.setBounds(5, 0, 1280, 100);
        isiSaldoLabel.setFont(cFonts.NO_HP_FONT_30);
        isiSaldoLabel.setHorizontalAlignment(JLabel.CENTER);

        header.setBackground(cColor.GREEN_TOSKA);
        header.setBounds(0, 0, 1280, 200);
        header.setLayout(null);
        header.add(isiSaldoLabel);

        nomorHpAnda.setForeground(cColor.GRAY);
        nomorHpAnda.setBounds(25, 0, 1280, 100);
        nomorHpAnda.setFont(cFonts.DAF_LOG_FONT_18);

        nomorHp.setForeground(cColor.BLACK_1);
        nomorHp.setBounds(25, 25, 1280, 100);
        nomorHp.setFont(cFonts.NO_HP_FONT_30);

        BatasHorizontal.setForeground(cColor.GREEN_TOSKA);
        BatasHorizontal.setBounds(0, 80, 500, 200);

        BatasVertical.setForeground(cColor.GREEN_TOSKA);
        BatasVertical.setBounds(500, 25, 200, 150);

        informasi.setForeground(cColor.BLACK_1);
        informasi.setBounds(25, 100, 1280, 100);
        informasi.setFont(cFonts.DAF_LOG_FONT_18);

        cImage iconBpjs = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\logobpjs.png", 90, 90);
        iconBpjs.setBounds(750, 55, 90, 90);

        BPJSBayar.setForeground(cColor.BLACK_1);
        BPJSBayar.setBounds(830, 35, 1280, 100);
        BPJSBayar.setFont(cFonts.DAF_LOG_FONT_18);

        saldoBpjs.setForeground(cColor.BLACK_1);
        saldoBpjs.setBounds(830, 60, 1280, 100);
        saldoBpjs.setFont(cFonts.DAF_LOG_FONT_18);

        subPanel.setBackground(cColor.WHITE_100_1);
        subPanel.setBounds(55, 100, 1150, 200);
        subPanel.setLayout(null);
        subPanel.setBorder(new LineBorder(cColor.BLACK_1, 1));
        subPanel.add(nomorHpAnda);
        subPanel.add(nomorHp);
        subPanel.add(BatasHorizontal);
        subPanel.add(BatasVertical);
        subPanel.add(informasi);
        subPanel.add(iconBpjs);
        subPanel.add(BPJSBayar);
        subPanel.add(saldoBpjs);

        keterangan_label.setForeground(cColor.BLACK_1);
        keterangan_label.setBounds(220, 0, 1000, 50);
        keterangan_label_2.setForeground(cColor.BLACK_1);
        keterangan_label_2.setBounds(175, 20, 1200, 50);

        panel_info.setBackground(cColor.OLD_WHITE_1);
        panel_info.setBounds(55, 120, 1150, 70);
        panel_info.setLayout(null);
        panel_info.setBorder(new LineBorder(cColor.ORANGE_1, 1));
        panel_info.add(keterangan_label);
        panel_info.add(keterangan_label_2);

        peraturan_label.setForeground(cColor.BLACK_1);
        peraturan_label.setBounds(57, 180, 1280, 100);
        peraturan_label.setFont(cFonts.INFOR_BOLD_FONT_19);

        lbl_peraturan_1.setForeground(cColor.BLACK_1);
        lbl_peraturan_1.setBounds(57, 210, 1280, 100);
        lbl_peraturan_2.setForeground(cColor.BLACK_1);
        lbl_peraturan_2.setBounds(57, 230, 1280, 100);
        lbl_peraturan_3.setForeground(cColor.BLACK_1);
        lbl_peraturan_3.setBounds(57, 250, 1280, 100);

        nominal.setForeground(cColor.BLACK_1);
        nominal.setBounds(57, 290, 1280, 100);
        nominal.setFont(cFonts.WELCOME_FONT_19);


        body.setBackground(cColor.WHITE_100_1);
        body.setBounds(0, 200, 1280, 520);
        body.setLayout(null);
        body.add(panel_info);
        body.add(peraturan_label);
        body.add(lbl_peraturan_1);
        body.add(lbl_peraturan_2);
        body.add(lbl_peraturan_3);
        body.add(nominal);

        add(subPanel);
        add(header);
        add(body);

        setVisible(true);
    }

}
