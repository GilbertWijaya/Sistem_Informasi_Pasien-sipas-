package com.programs;

import com.views.DashboardPembayaranView;
import com.views.StartView;
import com.views.dashBoardIsiFormulir;
import com.views.dashBoardIsiSaldoView;
import com.views.dashBoardRiwayatView;
import com.views.dashboardKeluhan;
import com.views.dashboardPenyakitAsmaView;
import com.views.dashboardPenyakitDemamView;
import com.views.dashboardPenyakitDiabetesView;
import com.views.dashboardPenyakitPanuView;
import com.views.dashboardPenyakitStrokeView;
import com.views.dashboardTerdaftarView;
import com.views.dashboardView;

public class Controller {

    private static StartView frameLogindanDaftar = new StartView();

    public static void showLoginPasien(){
        
        frameLogindanDaftar.setVisible(false);
        frameLogindanDaftar.initsloginpasien();
        frameLogindanDaftar.setVisible(true);
        
    }

    public static void showDaftarPasien(){
        
        frameLogindanDaftar.setVisible(false);
        frameLogindanDaftar.initsDaftarPasien();
        frameLogindanDaftar.setVisible(true);

    }

    public static void showDashboard(int id){
        dashboardView dashboardUtama = new dashboardView(id);
        dashboardUtama.setVisible(true);
    }

    public static void showDashboardIsiSaldo(int id){
        
        dashBoardIsiSaldoView dashBoardIsiSaldoView = new dashBoardIsiSaldoView(id);
        dashBoardIsiSaldoView.setVisible(true);

    }

    public static void showDashboardRiwayat(int id){

        dashBoardRiwayatView dashboardRiwayat = new dashBoardRiwayatView(id);
        dashboardRiwayat.setVisible(true);

    }

    public static void showDashboardPembayaran(int id){

        DashboardPembayaranView dashboardPembayaranView = new DashboardPembayaranView(id);
        dashboardPembayaranView.setVisible(true);

    }

    public static void showDashboardKeluhan(int id){

        dashboardKeluhan dashboardKeluhan = new dashboardKeluhan(id);
        dashboardKeluhan.setVisible(true);

    }

    public static void showDashboardDiabetes(int id){

        dashboardPenyakitDiabetesView penyakitDiabetes = new dashboardPenyakitDiabetesView(id);
        penyakitDiabetes.setVisible(true);
        

    }

    public static void showDashboardAsma(int id){

        dashboardPenyakitAsmaView penyakitAsma = new dashboardPenyakitAsmaView(id);
        penyakitAsma.setVisible(true);
        

    }

    public static void showDashboardDemam(int id){

        dashboardPenyakitDemamView penyakitDemamView = new dashboardPenyakitDemamView(id);
        penyakitDemamView.setVisible(true);

    }

    public static void showDashboardPanu(int id){

        dashboardPenyakitPanuView penyakitPanu  = new dashboardPenyakitPanuView(id);
        penyakitPanu.setVisible(true);

    }

    public static void showDashboardStroke(int id){

        dashboardPenyakitStrokeView penyakitStrokeView = new dashboardPenyakitStrokeView(id);
        penyakitStrokeView.setVisible(true);

    }

    public static void showDashboardIsiFormulir(int id){

        dashBoardIsiFormulir dashboardIsiForm = new dashBoardIsiFormulir(id);
        dashboardIsiForm.setVisible(true);

    }

    public static void showDashboardTerdaftar(int id){

        dashboardTerdaftarView formTerdaftarView = new dashboardTerdaftarView(id);
        formTerdaftarView.setVisible(true);

    }

}
