package com.templates;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.partials.cColor;
import com.partials.cFonts;

public abstract class cDashboardPembayaran extends JFrame {

    public JPanel panelUtama = new JPanel();
    public JPanel panel_keterangan = new JPanel();
    public JPanel panel_harga = new JPanel();

    public JLabel titleFrame = new JLabel("Pesan Tempat");
    public JLabel kelasLabel = new JLabel("Kelas");
    public JLabel RuangLabel = new JLabel("Ruang");
    public JLabel PenyakitLabel = new JLabel("Penyakit");

    public JLabel titik2Label_1 = new JLabel(" : ");
    public JLabel titik2Label_2 = new JLabel(" : ");
    public JLabel titik2Label_3 = new JLabel(" : ");

    public JLabel jenis_kelas_lbl = new JLabel("BPJS/UMUM");
    public JLabel jenis_ruang_lbl = new JLabel("GARENG(83)");
    public JLabel jenis_penyakit_lbl = new JLabel("PENYAKIT");

    public JLabel rincian_lbl = new JLabel("Rincian Harga");
    public JLabel nama_ruang_lbl = new JLabel("GARENG(83)");
    public JLabel total_harga_label = new JLabel("Total Harga");
    public JLabel harga_lbl = new JLabel("Rp 100.000");

    //public JLabel sk_label = new JLabel("Saya telah membaca dan setuju terhadap Syarat dan ketentuan pemesanan ruang");


    public cDashboardPembayaran(){
        
        super();
        setSize(1280,720);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleFrame.setForeground(cColor.BLACK_1);
        titleFrame.setBounds(35, 5, 1280, 55);
        titleFrame.setFont(cFonts.NAME_FONT_24);

        rincian_lbl.setForeground(cColor.BLACK_1);
        rincian_lbl.setBounds(35, 300, 1280, 50);
        rincian_lbl.setFont(cFonts.NAME_FONT_24);

        nama_ruang_lbl.setForeground(cColor.BLACK_1);
        nama_ruang_lbl.setBounds(35, 330, 1280, 50);
        nama_ruang_lbl.setFont(cFonts.DAF_LOG_FONT_18);
        
        //sk_label.setForeground(cColor.BLACK_1);
        //sk_label.setBounds(70, 400, 1280, 50);
        //sk_label.setFont(new Font("Poppins", Font.PLAIN, 15));
        
        panelUtama.setBackground(cColor.WHITE_100_1);
        panelUtama.setBounds(0, 0, 1280, 720);
        panelUtama.setLayout(null);

        kelasLabel.setForeground(cColor.BLACK_1);
        kelasLabel.setBounds(20, 5, 1280, 50);
        kelasLabel.setFont(cFonts.INFOR_BOLD_FONT_19);

        jenis_kelas_lbl.setForeground(cColor.BLACK_1);
        jenis_kelas_lbl.setBounds(250, 5, 1280, 50);
        jenis_kelas_lbl.setFont(cFonts.INFOR_BOLD_FONT_19);

        RuangLabel.setForeground(cColor.BLACK_1);
        RuangLabel.setBounds(20, 60, 1280, 50);
        RuangLabel.setFont(cFonts.INFOR_BOLD_FONT_19);

        jenis_ruang_lbl.setForeground(cColor.BLACK_1);
        jenis_ruang_lbl.setBounds(250, 60, 1280, 50);
        jenis_ruang_lbl.setFont(cFonts.INFOR_BOLD_FONT_19);

        PenyakitLabel.setForeground(cColor.BLACK_1);
        PenyakitLabel.setBounds(20, 115, 1280, 50);
        PenyakitLabel.setFont(cFonts.INFOR_BOLD_FONT_19);

        jenis_penyakit_lbl.setForeground(cColor.BLACK_1);
        jenis_penyakit_lbl.setBounds(250, 115, 1280, 50);
        jenis_penyakit_lbl.setFont(cFonts.INFOR_BOLD_FONT_19);

        titik2Label_1.setForeground(cColor.BLACK_1);
        titik2Label_1.setBounds(200, 5, 1280, 50);
        titik2Label_1.setFont(cFonts.INFOR_BOLD_FONT_19);

        titik2Label_2.setForeground(cColor.BLACK_1);
        titik2Label_2.setBounds(200, 60, 1280, 50);
        titik2Label_2.setFont(cFonts.INFOR_BOLD_FONT_19);

        titik2Label_3.setForeground(cColor.BLACK_1);
        titik2Label_3.setBounds(200, 115, 1280, 50);
        titik2Label_3.setFont(cFonts.INFOR_BOLD_FONT_19);

        panel_keterangan.setBackground(cColor.GREEN_TOSKA);
        panel_keterangan.setBounds(35, 50, 1190, 180);
        panel_keterangan.setLayout(null);
        panel_keterangan.add(kelasLabel);
        panel_keterangan.add(titik2Label_1);
        panel_keterangan.add(RuangLabel);
        panel_keterangan.add(titik2Label_2);
        panel_keterangan.add(PenyakitLabel);
        panel_keterangan.add(titik2Label_3);
        panel_keterangan.add(jenis_kelas_lbl);
        panel_keterangan.add(jenis_ruang_lbl);
        panel_keterangan.add(jenis_penyakit_lbl);

        total_harga_label.setForeground(cColor.BLACK_1);
        total_harga_label.setBounds(20, 18, 1280, 50);
        total_harga_label.setFont(cFonts.INFOR_BOLD_FONT_19);

        harga_lbl.setForeground(cColor.BLACK_1);
        harga_lbl.setBounds(1050, 18, 1280, 50);
        harga_lbl.setFont(cFonts.INFOR_BOLD_FONT_19);

        panel_harga.setBackground(cColor.GREEN_TOSKA);
        panel_harga.setBounds(35, 300, 1190, 80);
        panel_harga.setLayout(null);
        panel_harga.add(harga_lbl);
        panel_harga.add(total_harga_label);
        

        
        add(titleFrame);
        add(panelUtama);
        panelUtama.add(panel_harga);
        panelUtama.add(panel_keterangan);
        panelUtama.add(rincian_lbl);
        panelUtama.add(nama_ruang_lbl);
        //panelUtama.add(sk_label);

        setVisible(true);
    }

}
