package com.views;

import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;

import com.partials.cButton;
import com.partials.cColor;
import com.partials.cFormLabel;
import com.partials.cLinkStart;
import com.partials.cPasswordField;
import com.partials.cTextFields;
import com.programs.Controller;
import com.templates.cStartFrame;

public class StartView extends cStartFrame {

    private cFormLabel formLabelLogin = new cFormLabel("Masukan Email",30,400,150,32);
    private cTextFields txtLabellogin = new cTextFields(30,430,435,true);
    private cFormLabel formLabelPassLogin = new cFormLabel("Masukan Password", 30, 460, 200, 32);
    private cPasswordField txtLabelPassLogin = new cPasswordField(30, 490, 435,false);
    private cButton login_button = new cButton("Login",190 ,540, 100, 32, cColor.GREEN_TOSKA);
    private cLinkStart buat_akun_link_toDaftar = new cLinkStart("Belum Punya Akun?",175, 580);

    private cFormLabel formLabelDaftar = new cFormLabel("Masukan Email",30,340,150,32);
    private cTextFields txtLabelDaftar = new cTextFields(30,370,435,true);
    private cFormLabel formLabeNamalDaftar = new cFormLabel("Masukan Nama",30,400,150,32);
    private cTextFields txtLabelNamaDaftar = new cTextFields(30,430,435,true);
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
        cardStart.add(formLabelPassDaftar);
        cardStart.add(txtLabelPassDaftar);
        cardStart.add(Daftar_button);
        cardStart.add(buat_akun_link_toLogin);

    }

}
