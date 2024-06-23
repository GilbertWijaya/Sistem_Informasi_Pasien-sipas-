package com.views;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import com.partials.cButton;
import com.partials.cCheckBox;
import com.partials.cColor;
import com.partials.cImage;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cDashboardPembayaran;

public class DashboardPembayaranView extends cDashboardPembayaran {

    final String beranda_path = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png"; 

    cCheckBox aggrement = new cCheckBox("Saya menyetujui syarat dan ketentuan","Setuju",50 ,50);
    cButton bayarBtn = new cButton("Bayar",540,650 ,200, 35, cColor.GREEN_TOSKA);

    cImage berandaIcon = new cImage(beranda_path, 35, 35);

    public DashboardPembayaranView(int id) {
        
        super();

        berandaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
           
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
                DashboardPembayaranView.this.setVisible(false);
            }

        });

        bayarBtn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String value = aggrement.getActionCommand().toString();
                if(value.equals("Setuju")){
                    
                    int id_pasien = Integer.parseInt(Model.dataPasien(id)[0].toString());
                    int pemeriksaan_id = Integer.parseInt(Model.dataPemeriksaan(id_pasien)[0].toString());
                    int saldoAkunNow = Integer.parseInt(Model.getDetailAkun(id)[4].toString());
                    int saldoAkunNew = saldoAkunNow - Integer.parseInt(Model.infoPembayaranPasien(id)[11].toString());

                    if (Model.insertDataPembayaranPasien(pemeriksaan_id)) {
                        
                        if (Model.isiSaldo(id, saldoAkunNew)) {
                            JOptionPane.showMessageDialog(null,"Data berhasil dinput","Berhasil",JOptionPane.INFORMATION_MESSAGE);
                            Controller.showDashboardTerdaftar(id);
                            DashboardPembayaranView.this.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null,"Data gagal dinput","Gagal",JOptionPane.ERROR_MESSAGE);
                        }

                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Data gagal dinput","Gagal",JOptionPane.ERROR_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Data gagal terbayar ulangi lagi pembayaran","Gagal",JOptionPane.ERROR_MESSAGE);
                }

            }
            
        });

        initsDashboardPembayaran(id);
    }

    public void initsDashboardPembayaran(int id){

        berandaIcon.setBounds(1190, 10, 35, 35);
        aggrement.setBounds(33, 390, 500, 50);

        jenis_kelas_lbl.setText(Model.infoPembayaranPasien(id)[4].toString());
        jenis_ruang_lbl.setText(Model.infoPembayaranPasien(id)[6].toString());
        nama_ruang_lbl.setText(Model.infoPembayaranPasien(id)[6].toString());
        jenis_penyakit_lbl.setText(Model.infoPembayaranPasien(id)[7].toString());
        harga_lbl.setText("RP " + Model.infoPembayaranPasien(id)[11].toString());        

        panelUtama.add(berandaIcon);
        panelUtama.add(aggrement);
        panelUtama.add(bayarBtn);
        
        panelUtama.revalidate();
        panelUtama.repaint();
    }

}
