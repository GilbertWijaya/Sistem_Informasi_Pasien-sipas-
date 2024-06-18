package com.partials;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class cLinkKeluar extends JLabel {

    public cLinkKeluar(int x,int y){

        super();
        setBounds(x, y, 78, 36);
        setText("Keluar");
        setFont(cFonts.CR_SARAN_OUTLINK_FONT_24);
        setForeground(cColor.BLACK_1);
        addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                Object[] option = {"YA","TIDAK"};
                int konfirmasi = JOptionPane.showOptionDialog(null, "Klik 'YA' untuk keluar", "konfirmasi", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null, option, option[0]);

                if (konfirmasi == 0) {
                    System.exit(0);
                }

            }

        });

    }

}
