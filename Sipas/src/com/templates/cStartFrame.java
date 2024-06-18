package com.templates;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.w3c.dom.events.MouseEvent;

import com.partials.cColor;
import com.partials.cFonts;
import com.partials.cImage;
import com.partials.cLinkKeluar;

public abstract class cStartFrame extends JFrame {

    public JPanel cardStart = new JPanel(){

        protected void paintComponent(Graphics g) {

            super.paintComponent(g);

             // Memuat gambar
             ImageIcon imageIcon = new ImageIcon("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\gambarlove.png");
             Image image = imageIcon.getImage();
             // Menggambar gambar di panel
             g.drawImage(image, 78, 0 , 350, 350, this);

        };

    };
    public cLinkKeluar linkKeluar = new cLinkKeluar(1128, 0);
    public JLabel titleStart = new JLabel("TITLE");
    public JPanel bg = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Definisikan warna awal dan akhir untuk gradien
            Color color1 = cColor.GRADIENT_START;
            Color color2 = cColor.GRADIENT_END;

            // Buat objek GradientPaint
            int width = getWidth();
            int height = getHeight();

            // float midx = width * 0.5f;
            // float midy = height * 0.5f;

            GradientPaint gp = new GradientPaint(470,500 , color1, width, height, color2);

            // Set GradientPaint ke Graphics2D
            g2d.setPaint(gp);

            // Gambar persegi panjang yang diisi dengan gradien
            g2d.fillRect(0, 0, width, height);

            ImageIcon icon = new ImageIcon("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\DOKTER.png");
            Image image = icon.getImage();

            float opacity = 0.5f; // Nilai opacity, dari 0.0 (transparan) hingga 1.0 (solid)
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));

            g2d.drawImage(image, 0, 0,669,1086,this);


        }
    };

    
    public cStartFrame(){

        super();
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        bg.setBounds(0, 0, 1280, 720);
        bg.setLayout(null);

        cardStart.setBackground(Color.WHITE);
        cardStart.setBounds(700, 50, 500, 630);
        //cardStart.setBounds(700, 500, 500, 620);
        cardStart.setLayout(null);

        int shadowSize = 5;
        Color shadowColor = new Color(0, 0, 0, 25); // semi-transparent black
        MatteBorder shadowBorder = new MatteBorder(0, 0, shadowSize, shadowSize, shadowColor);
        // Create an empty border to add space between the content and the shadow
        EmptyBorder emptyBorder = new EmptyBorder(0, 0, shadowSize, shadowSize);
        
        cardStart.setBorder(new CompoundBorder(shadowBorder, emptyBorder));
        
        JLabel exitLabel = new JLabel("Keluar");
        exitLabel.setBounds(1140, 0, 100, 50);
        exitLabel.setFont(cFonts.WELCOME_FONT_19);
        exitLabel.setForeground(Color.BLACK);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            
           @Override
           public void mouseEntered(java.awt.event.MouseEvent e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
           }

           @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                Object[] option = {"YA","TIDAK"};
                int konfirmasi = JOptionPane.showOptionDialog(null, "Klik 'YA' untuk keluar", "konfirmasi", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null, option, option[0]);

                if (konfirmasi == 0) {
                    System.exit(0);
                }
            }

        });
        
        titleStart.setFont(cFonts.INFOR_BOLD_FONT_19);
        titleStart.setForeground(Color.black);
        titleStart.setBounds(225, 0, 350, 100);

        cardStart.add(titleStart);
        add(cardStart);
        add(bg);
        //bg.add(exitLabel);
        bg.add(linkKeluar);
        

        setVisible(true);
    }

    public cStartFrame(String title){
        this();
        setTitle(title);
    }


}
