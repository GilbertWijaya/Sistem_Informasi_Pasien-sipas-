package com.views;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cFormLabel;
import com.partials.cLinkStart;
import com.partials.cPasswordField;
import com.partials.cTextFields;
import com.programs.Controller;
import com.programs.Model;
import com.templates.cStartFrame;

public class StartView extends cStartFrame {

    private cFormLabel formLabelLogin = new cFormLabel("Masukan Email",30,400,150,32);
    private cTextFields txtLabellogin = new cTextFields(30,430,435,true);
    private cFormLabel formLabelPassLogin = new cFormLabel("Masukan Password", 30, 460, 200, 32);
    private cPasswordField txtLabelPassLogin = new cPasswordField(30, 490, 435,false);
    private cButton login_button = new cButton("Login",190 ,540, 100, 32, cColor.GREEN_TOSKA);
    private cLinkStart buat_akun_link_toDaftar = new cLinkStart("Belum Punya Akun?",175, 580);

    private cFormLabel formLabelDaftar = new cFormLabel("Masukan Email",30,280,150,32);
    private cTextFields txtLabelDaftar = new cTextFields(30,310,435,true);
    private cFormLabel formLabeNamalDaftar = new cFormLabel("Masukan Nama",30,340,150,32);
    private cTextFields txtLabelNamaDaftar = new cTextFields(30,370,435,true);
    private cFormLabel formLabeNoHpDaftar = new cFormLabel("Masukan Nomor HP",30,400,200,32);
    private cTextFields txtLabelNoHpDaftar = new cTextFields(30,430,435,true);
    private cFormLabel formLabelPassDaftar = new cFormLabel("Masukan Password", 30, 460, 200, 32);
    private cPasswordField txtLabelPassDaftar = new cPasswordField(30, 490, 435,false);
    private cButton Daftar_button = new cButton("Daftar",190 ,540, 100, 32, cColor.GREEN_TOSKA);
    private cLinkStart buat_akun_link_toLogin = new cLinkStart("Sudah Punya Akun?",175, 580);

    public StartView(){
        super();

        buat_akun_link_toDaftar.addMouseListener(new java.awt.event.MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                
                Controller.showDaftarPasien();
                
            }

        });

        buat_akun_link_toLogin.addMouseListener(new java.awt.event.MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                
                Controller.showLoginPasien();
                
            }

        });

        login_button.addActionListener(new java.awt.event.ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String email = txtLabellogin.getText().toString();
                String password = String.valueOf(txtLabelPassLogin.getPassword());

                if (txtLabellogin.getText().trim().isEmpty() || password.trim().isEmpty()) {
                    
                    StartView.this.setVisible(false);

                    if (txtLabellogin.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Masukan email secara valid","error",JOptionPane.ERROR_MESSAGE);;
                    }
                    
                    if (password.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Masukan password secara valid","error",JOptionPane.ERROR_MESSAGE);;
                    }

                    StartView.this.setVisible(true);

                }
                else{

                    if (Model.verifyAkunPasien(email, password)) {
                        Controller.showDashboard(Integer.valueOf(Model.getDetailakunByEmail(email)[0].toString()));
                        StartView.this.setVisible(false);
                    }
                    else{
                        StartView.this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Email atau password salah","error",JOptionPane.ERROR_MESSAGE);
                        StartView.this.setVisible(true);
                    }

                }

            }

        });

        Daftar_button.addActionListener(new java.awt.event.ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String email = txtLabelDaftar.getText().toString();
                String nama = txtLabelNamaDaftar.getText().toString();
                String noHpString = txtLabelNoHpDaftar.getText().toString();
                String password = String.valueOf(txtLabelPassDaftar.getPassword());

                if (txtLabelDaftar.getText().trim().isEmpty() || txtLabelNamaDaftar.getText().trim().isEmpty() || password.trim().isEmpty() || noHpString.trim().isEmpty()) {
                    
                    StartView.this.setVisible(false);
                    
                    if (txtLabelDaftar.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Masukan email secara valid","error",JOptionPane.ERROR_MESSAGE);;
                    }
                    
                    if (txtLabelNamaDaftar.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Masukan nama secara valid","error",JOptionPane.ERROR_MESSAGE);;
                    }

                    if (password.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Masukan password secara valid","error",JOptionPane.ERROR_MESSAGE);;
                    }
                    
                    if (noHpString.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Masukan nomor HP secara valid","error",JOptionPane.ERROR_MESSAGE);;
                    }
                    
                    StartView.this.setVisible(true);

                }
                else{

                    if (Model.verifyAkunPasien(email, password)) {
                        StartView.this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Periksa lagi email anda","error",JOptionPane.ERROR_MESSAGE);
                        StartView.this.setVisible(true);
                    }
                    else{
                        Model.insertAkunPasien(email, nama,noHpString, password);
                        JOptionPane.showMessageDialog(null, "Buat akun berhasil","Berhasil",JOptionPane.INFORMATION_MESSAGE);
                        Controller.showLoginPasien();
                        StartView.this.setVisible(false);
                    }

                }

            }

        });

    }        

    public void initsloginpasien(){

        this.setTitle("Login Pasien");
        cardStart.removeAll();
        titleStart.setText("Login Pasien");
        titleStart.setLocation(195,titleStart.getY());
        cardStart.add(titleStart);

        

        cardStart.add(formLabelLogin);
        cardStart.add(txtLabellogin);
        cardStart.add(formLabelPassLogin);
        cardStart.add(txtLabelPassLogin);
        cardStart.add(login_button);
        cardStart.add(buat_akun_link_toDaftar);
    }

    public void initsDaftarPasien(){

        this.setTitle("Daftar Pasien");
        cardStart.removeAll();
        titleStart.setText("Daftar Pasien");
        titleStart.setLocation(192,titleStart.getY());
        cardStart.add(titleStart);


        cardStart.add(formLabelDaftar);
        cardStart.add(txtLabelDaftar);
        cardStart.add(formLabeNamalDaftar);
        cardStart.add(txtLabelNamaDaftar);
        cardStart.add(formLabeNoHpDaftar);
        cardStart.add(txtLabelNoHpDaftar);
        cardStart.add(formLabelPassDaftar);
        cardStart.add(txtLabelPassDaftar);
        cardStart.add(Daftar_button);
        cardStart.add(buat_akun_link_toLogin);

    }

}
