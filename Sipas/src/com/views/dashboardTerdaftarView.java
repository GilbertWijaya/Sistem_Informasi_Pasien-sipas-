package com.views;

import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import org.w3c.dom.events.MouseEvent;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cComboBox;
import com.partials.cImage;
import com.partials.cRadioButton;
import com.partials.cTextFields;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cDashboardFormTerdaftar;

public class dashboardTerdaftarView extends cDashboardFormTerdaftar {

    final String isiFormulirPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Isi Formulir.png";
    final String menungguPembayaranPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Menunggu Pembayaran.png";
    final String terdaftarPath = "E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Terdaftar.png";

    cImage iconIsiFormulir = new cImage(isiFormulirPath, 50,50);
    cImage iconTerdaftar = new cImage(terdaftarPath, 50,50);
    cImage berandaImage = new cImage("E:\\Mata kuliah\\semester 2\\basis data\\project uas db\\Sipas\\src\\Logo Beranda.png", 35, 35);

    cTextFields txtNama = new cTextFields(450, 23, 500,false); 
    cTextFields txtEmail = new cTextFields(450, 63, 500,false);
    cTextFields txtUsia = new cTextFields(450, 103, 500, false);
    cTextFields txtNoHP = new cTextFields(450, 143, 500, false);
    cRadioButton jk_radioBtn_Bpjs = new cRadioButton("BPJS", "bpjs",450 , 183, 100, 28);
    cRadioButton jk_radioBtn_Umum = new cRadioButton("UMUM", "umum",555 , 183, 200, 28);
    ButtonGroup jk_group_kelas;
    cComboBox ruanganBox;
    //cTextFields txtRuang = new cTextFields(450, 223, 500, true);
    cComboBox penyakitBox;
    //cTextFields txtPenyakit = new cTextFields(450, 263, 500, true);
    cTextFields txtPenanggungJawab = new cTextFields(450, 303, 500, false);
    cTextFields txtAlamat = new cTextFields(450, 343, 500, false);

    cButton EditFormulir_btn = new cButton("Edit Formulir", 1005, 655, 200, 28, cColor.GREEN_TOSKA);
    cButton HapusFormulir_btn = new cButton("Hapus Formulir", 795, 655, 200, 28, cColor.GREEN_TOSKA);
    cButton editButton = new cButton("Edit",585, 655, 200, 28, cColor.GREEN_TOSKA);

    public dashboardTerdaftarView(int id) {
        
        super();

        berandaImage.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                Controller.showDashboard(id);
            }

        });

        iconIsiFormulir.addMouseListener(new java.awt.event.MouseAdapter() {
            
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
                Controller.showDashboardIsiFormulir(id);
            }

        });        

        editButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                txtNama.setEditable(true);
                //txtEmail.setEditable(true);
                txtUsia.setEditable(true);
                txtNoHP.setEditable(true);
                //ruanganBox.setEnabled(true);
                //txtRuang.setEditable(true);
                penyakitBox.setEnabled(true);
                jk_group_kelas.setSelected(jk_group_kelas.getSelection(), false);
                //txtPenyakit.setEditable(true);
                txtPenanggungJawab.setEditable(true);
                txtAlamat.setEditable(true);
                
            }
            
        });

        EditFormulir_btn.addActionListener(new java.awt.event.ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = txtNama.getText().toString();
                int usia = Integer.parseInt(Model.dataTerdaftarPasien(id)[4].toString());
                //String email = txtEmail.getText().toString();
                String noHp = txtNoHP.getText().toString();
                String penyakit = penyakitBox.getActionCommand().toString();
                int penyakitValue = Integer.parseInt(Model.detailPenyakit(penyakit)[0].toString());
                String penanggungJawab = txtPenanggungJawab.getText().toString();
                String alamat = txtAlamat.getText().toString();

                if (Model.UpdateDataPasien(id, nama, usia, noHp,penyakitValue, penanggungJawab, alamat)) {
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate","Berhasil",JOptionPane.INFORMATION_MESSAGE);
                    Controller.showDashboard(id);                    
                }


            }

        });


        HapusFormulir_btn.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = Model.dataPasien(id)[2].toString();
                
                if (Model.DeleteDataTblCustomer(id,nama)) {
                    JOptionPane.showMessageDialog(null, "Data akun berhasil dihapus","Berhasil",JOptionPane.INFORMATION_MESSAGE);
                    Controller.showDashboard(id);
                }

            }

        });
        

        initIsiFormulir(id);

    }

    public void initIsiFormulir(int id){

        iconIsiFormulir.setBounds(350, 30, 50, 50);
        iconTerdaftar.setBounds(750, 30, 50, 50);
        berandaImage.setBounds(1170, 15, 35, 35);;

        jk_radioBtn_Bpjs.setBackground(cColor.GREEN_TOSKA);
        jk_radioBtn_Umum.setBackground(cColor.GREEN_TOSKA);
        jk_group_kelas = new ButtonGroup();
        
        editButton.setActionCommand("Edit");
        

        headerPanel.add(iconIsiFormulir);        
        headerPanel.add(iconTerdaftar);
        subBodyPanel.add(txtNama);
        subBodyPanel.add(txtEmail);
        subBodyPanel.add(txtUsia);
        subBodyPanel.add(txtNoHP);
        subBodyPanel.add(jk_radioBtn_Bpjs);
        subBodyPanel.add(jk_radioBtn_Umum);
        jk_group_kelas.add(jk_radioBtn_Bpjs);
        jk_group_kelas.add(jk_radioBtn_Umum);
        ruanganBox = new cComboBox(Model.RuanganBoxModel(), 450, 223, 500, 28);
        ruanganBox.setEnabled(false);
        subBodyPanel.add(ruanganBox);
        penyakitBox = new cComboBox(Model.PenyakitBoxModel(), 450, 263, 500, 28);
        penyakitBox.setEnabled(false);
        subBodyPanel.add(penyakitBox);
        subBodyPanel.add(txtPenanggungJawab);
        subBodyPanel.add(txtAlamat);
        

        txtNama.setText(Model.dataTerdaftarPasien(id)[2].toString());
        txtEmail.setText(Model.dataTerdaftarPasien(id)[4].toString());
        txtUsia.setText(Model.dataTerdaftarPasien(id)[5].toString());
        txtNoHP.setText(Model.dataTerdaftarPasien(id)[6].toString());
        String kelas = Model.dataTerdaftarPasien(id)[7].toString();
        if (kelas.equalsIgnoreCase("bpjs")) {
            jk_radioBtn_Bpjs.setSelected(true);
        }else{
            jk_radioBtn_Umum.setSelected(true);
        }
        //txtRuang.setText(Model.dataTerdaftarPasien(id)[9].toString());
        ruanganBox.setSelectedItem(Model.dataTerdaftarPasien(id)[9].toString());
        //txtPenyakit.setText(Model.dataTerdaftarPasien(id)[11].toString());
        penyakitBox.setSelectedItem(Model.dataTerdaftarPasien(id)[11].toString());
        //txtPenyakit.setText(Model.dataTerdaftarPasien(id)[11].toString());
        txtPenanggungJawab.setText(Model.dataTerdaftarPasien(id)[12].toString());
        txtAlamat.setText(Model.dataTerdaftarPasien(id)[13].toString());

            
        

        bodyPanel.add(berandaImage);   
        bodyPanel.add(EditFormulir_btn);
        bodyPanel.add(HapusFormulir_btn);
        bodyPanel.add(editButton);
    }

}
