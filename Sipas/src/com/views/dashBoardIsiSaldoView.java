package com.views;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import com.partials.cButton;
import com.partials.cCheckBox;
import com.partials.cColor;
import com.partials.cImage;
import com.partials.cTextFields;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cDashboardIsiSaldo;

public class dashBoardIsiSaldoView extends cDashboardIsiSaldo {

    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 50, 50);
    cTextFields txtIsiSaldo = new cTextFields(55, 365,250, true);
    cButton isiSaldo_btn = new cButton("Isi", 315, 365, 70, 28, cColor.GREEN_TOSKA);

    public dashBoardIsiSaldoView(int id) {
        super();
        
        berandaImage.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                Controller.showDashboard(id);
                dashBoardIsiSaldoView.this.setVisible(false);
            }

        });

        isiSaldo_btn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int saldo = Integer.parseInt(Model.getDetailAkun(id)[4].toString());
                int newSaldo = Integer.parseInt(txtIsiSaldo.getText());
                int totalSaldo = saldo + newSaldo;

                if (txtIsiSaldo.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Masukan nilai yang sesuai", "Peringatan", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if (newSaldo < 50000) {
                        JOptionPane.showMessageDialog(null, "Minimal pengisian saldo adalah Rp 50.000", "Peringatan", JOptionPane.ERROR_MESSAGE);
                    }
                    else if (newSaldo > 1000000) {
                        JOptionPane.showMessageDialog(null, "Maksimal pengisian saldo adalah Rp 1.000.000", "Peringatan", JOptionPane.ERROR_MESSAGE);
                    }
                    else if (newSaldo % 50000!= 0) {
                        JOptionPane.showMessageDialog(null, "Nominal pengisian saldo harus kelipatan 50.000", "Peringatan", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        Model.isiSaldo(id, totalSaldo);
                        JOptionPane.showMessageDialog(null, "Saldo berhasil ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        Controller.showDashboard(id);
                        dashBoardIsiSaldoView.this.setVisible(false);

                    }

                }

            }

        });
        
        initsIsiSaldo(id);
    }

    public void initsIsiSaldo(int id){
        berandaImage.setBounds(1150, 5, 100, 100);

        nomorHp.setText(Model.getDetailAkun(id)[3].toString());

        header.add(berandaImage);
        body.add(txtIsiSaldo);
        body.add(isiSaldo_btn);

    }


}
