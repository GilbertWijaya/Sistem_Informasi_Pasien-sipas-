package com.views;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cComboBox;
import com.partials.cImage;
import com.partials.cRadioButton;
import com.partials.cTextFields;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cDashboardIsiFormulir;

public class dashBoardIsiFormulir extends cDashboardIsiFormulir {

    final String isiFormulirPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Isi Formulir.png";
    final String menungguPembayaranPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Menunggu Pembayaran.png";
    final String terdaftarPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Terdaftar.png";

    cImage iconIsiFormulir = new cImage(isiFormulirPath, 50,50);
    cImage iconMenungguPembayaran = new cImage(menungguPembayaranPath, 90,90);
    cImage iconTerdaftar = new cImage(terdaftarPath, 50,50);
    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 35, 35);

    cTextFields txtNama = new cTextFields(450, 23, 500,true); 
    cTextFields txtTempatLahir = new cTextFields(450, 63, 500,true);
    cTextFields txtTanggalLahir = new cTextFields(450, 103, 500,true);  
    ButtonGroup jk_group;
    cRadioButton jk_radioBtn_Pria = new cRadioButton("Pria", "laki_laki",450 , 143, 100, 28);
    cRadioButton jk_radioBtn_Wanita = new cRadioButton("Wanita", "perempuan",555 , 143, 200, 28);
    cTextFields txtUsia = new cTextFields(450, 183, 500, true);
    cTextFields txtNoHP = new cTextFields(450, 223, 500, true);
    ButtonGroup jk_group_kelas;
    cRadioButton jk_radioBtn_Bpjs = new cRadioButton("BPJS", "BPJS",450 , 263, 100, 28);
    cRadioButton jk_radioBtn_Umum = new cRadioButton("UMUM", "UMUM",555 , 263, 200, 28);
    //cTextFields txtRuang = new cTextFields(450, 303, 500, true);
    cComboBox ruanganBox;
    //cTextFields txtPenyakit = new cTextFields(450, 343, 500, true);
    cComboBox penyakitBox;
    cTextFields txtPenanggungJawab = new cTextFields(450, 383, 500, true);
    cTextFields txtAlamat = new cTextFields(450, 423, 500, true);

    cButton isiFormulir_btn = new cButton("Isi Formulir", 1005, 685, 200, 28, cColor.GREEN_TOSKA);

    public dashBoardIsiFormulir(int id) {
        
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
                dashBoardIsiFormulir.this.setVisible(false);
            }

        });

        iconIsiFormulir.addMouseListener(new java.awt.event.MouseAdapter() {
           
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
                Controller.showDashboardIsiFormulir(id);
                dashBoardIsiFormulir.this.setVisible(false);
            }

        });

        iconMenungguPembayaran.addMouseListener(new java.awt.event.MouseAdapter(){

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
                Controller.showDashboardPembayaran(id);
                dashBoardIsiFormulir.this.setVisible(false);
            }

        });

        iconTerdaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                
                
                // Controller.showDashboardTerdaftar(id);
                // dashBoardIsiFormulir.this.setVisible(false);

                if (Model.verifyAkunTerdaftar(id)) {
                    dashBoardIsiFormulir.this.setVisible(false);
                    Controller.showDashboardTerdaftar(id);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Anda belum mendaftarkan pasien","Error",JOptionPane.ERROR_MESSAGE);
                    Controller.showDashboard(id);
                    dashBoardIsiFormulir.this.setVisible(false);
                }

            }

        });

        isiFormulir_btn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = txtNama.getText();
                String tempatLahir = txtTempatLahir.getText();
                String tanggalLahir = txtTanggalLahir.getText();
                String usia = txtUsia.getText();
                String jenisKelamin = jk_group.getSelection().getActionCommand().toString();
                int UsiaValue = Integer.parseInt(txtUsia.getText());
                String nomorHp = txtNoHP.getText();
                String kelasValue = jk_group_kelas.getSelection().getActionCommand().toString();
                String ruanganValue = ruanganBox.getSelectedItem().toString();
                String penyakitValue = penyakitBox.getSelectedItem().toString();
                String penanggungJawabValue = txtPenanggungJawab.getText();
                String alamatValue = txtAlamat.getText();


                if(nama.isEmpty() || tempatLahir.isEmpty() || tanggalLahir.isEmpty() || usia.isEmpty() || jenisKelamin.isEmpty() 
                || nomorHp.isEmpty() || kelasValue.isEmpty() 
                || ruanganValue.isEmpty() || penyakitValue.isEmpty() 
                || penanggungJawabValue.isEmpty() || alamatValue.isEmpty()){

                dashBoardIsiFormulir.this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Mohon lengkapi data terlebih dahulu","Error",JOptionPane.ERROR_MESSAGE);
                
                }
                else{

                    if (Model.insertDataPasien(id,nama,tanggalLahir,tempatLahir,UsiaValue,nomorHp,alamatValue,jenisKelamin,Integer.parseInt(Model.detailPenyakit(penyakitValue)[0].toString()),penanggungJawabValue) ) {
                        
                        if (Model.insertDataPasienPemeriksaan(Integer.parseInt(Model.dataPasienByNama(nama)[0].toString()),Integer.parseInt(Model.dataDokterBySpesialisasi(penyakitValue)[0].toString()))) {
                            
                            int idPasien = Integer.parseInt(Model.dataPasienByNama(nama)[0].toString());
                            int idPemeriksaan = Integer.parseInt(Model.dataPemeriksaan(idPasien)[0].toString());
                            int idKamar = Integer.parseInt(Model.dataRuangan(ruanganValue)[0].toString());

                            if (Model.insertDataPasienMenginap(idPemeriksaan, idKamar)) {
                                JOptionPane.showMessageDialog(null,"data berhasil didaftarkan","Berhasil",JOptionPane.INFORMATION_MESSAGE);
                                Controller.showDashboardPembayaran(id);
                                dashBoardIsiFormulir.this.setVisible(false);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Data gagal didaftarkan","Gagal",JOptionPane.ERROR_MESSAGE);
                            }

                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Data gagal didaftarkan","Gagal",JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Data gagal didaftarkan","Gagal",JOptionPane.ERROR_MESSAGE);
                    }

                }
        }
    });
        initIsiFormulir(id);
    }
        

    public void initIsiFormulir(int id){

        iconIsiFormulir.setBounds(350, 30, 50, 50);
        iconMenungguPembayaran.setBounds(540, 5, 90, 90);
        iconTerdaftar.setBounds(750, 30, 50, 50);
        berandaImage.setBounds(1170, 15, 35, 35);

        

        jk_radioBtn_Pria.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Wanita.setBackground(cColor.GREEN_TOSKA);
        jk_group = new ButtonGroup();

        jk_radioBtn_Bpjs.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Umum.setBackground(cColor.GREEN_TOSKA);
        jk_group_kelas = new ButtonGroup();

        headerPanel.add(iconIsiFormulir);        
        headerPanel.add(iconMenungguPembayaran);
        headerPanel.add(iconTerdaftar);

        subBodyPanel.add(txtNama);
        subBodyPanel.add(txtTempatLahir);
        subBodyPanel.add(txtTanggalLahir);
        subBodyPanel.add(jk_radioBtn_Pria);
        subBodyPanel.add(jk_radioBtn_Wanita);
        jk_group.add(jk_radioBtn_Pria);
        jk_group.add(jk_radioBtn_Wanita);
        subBodyPanel.add(txtUsia);
        subBodyPanel.add(txtNoHP);
        subBodyPanel.add(jk_radioBtn_Bpjs);
        subBodyPanel.add(jk_radioBtn_Umum);
        jk_group_kelas.add(jk_radioBtn_Bpjs);
        jk_group_kelas.add(jk_radioBtn_Umum);
        ruanganBox = new cComboBox(Model.RuanganBoxModel(), 450, 303, 500, 28);
        subBodyPanel.add(ruanganBox);
        penyakitBox = new cComboBox(Model.PenyakitBoxModel(), 450, 343, 500, 28);
        subBodyPanel.add(penyakitBox);
        subBodyPanel.add(txtPenanggungJawab);
        subBodyPanel.add(txtAlamat);


        bodyPanel.add(berandaImage);   
        bodyPanel.add(isiFormulir_btn);
    }

}
