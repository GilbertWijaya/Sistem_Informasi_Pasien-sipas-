package com.programs;

import com.views.DashboardPembayaranView;
import com.views.StartView;
import com.views.dashBoardIsiSaldoView;
import com.views.dashBoardRiwayatView;
import com.views.dashboardKeluhan;
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

}
