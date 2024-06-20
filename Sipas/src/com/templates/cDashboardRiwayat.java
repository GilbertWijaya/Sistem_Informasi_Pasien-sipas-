package com.templates;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.partials.cColor;
import com.partials.cFonts;

public abstract class cDashboardRiwayat extends JFrame {

    public JPanel header = new JPanel();
    public JPanel subHeader = new JPanel();
    public JPanel bodyPanel = new JPanel();
    public JPanel footer = new JPanel();

    public JLabel RiwayatLabel = new JLabel("Riwayat Anda");
    public JLabel Saran_label = new JLabel("Setelah melihat riwayat anda, tolong terus menjaga kesehatan anda");

    public cDashboardRiwayat(){
        
        super();
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        header.setBackground(cColor.GREEN_TOSKA);
        header.setBounds(0, 0, 1280, 300);
        header.setLayout(null);

        subHeader.setBackground(cColor.OLD_WHITE_1);
        subHeader.setBounds(45, 50, 1170, 200);
        subHeader.setLayout(null);
        subHeader.setBorder(new LineBorder(cColor.BLACK_1, 1));

        RiwayatLabel.setForeground(cColor.BLACK_1);
        RiwayatLabel.setBounds(445, 70, 500, 50);
        RiwayatLabel.setFont(cFonts.KETERANGAN_FONT_40);
        subHeader.add(RiwayatLabel);
        
        bodyPanel.setBackground(cColor.WHITE_100_1);
        bodyPanel.setBounds(0, 300, 1280, 470);
        bodyPanel.setLayout(null);

        Saran_label.setForeground(cColor.BLACK_1);
        Saran_label.setBounds(350, 0, 1200, 50);
        Saran_label.setFont(cFonts.DAF_LOG_FONT_18);
        footer.add(Saran_label);

        footer.setBackground(cColor.WHITE_100_1);
        footer.setBounds(30, 300, 1200, 50);
        footer.setLayout(null);
        footer.setBorder(new LineBorder(cColor.ORANGE_1, 1));

        add(header);
        header.add(subHeader);
        add(bodyPanel);
        bodyPanel.add(footer);

        setVisible(true);
    }

}
