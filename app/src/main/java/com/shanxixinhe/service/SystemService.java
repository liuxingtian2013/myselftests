package com.shanxixinhe.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.newland.aidl.system.AidlSystemManage;
import com.newland.aidl.system.InstallAppObserver;
import com.newland.aidl.system.UnInstallAppObserver;

import java.util.ArrayList;
import java.util.List;

public class SystemService extends Service {

    public SystemService() {
        ArrayList<String> addrList = new ArrayList<>();
    }

    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("------------------------onBind");
        return new AidlSystem();
    }

    private class AidlSystem extends AidlSystemManage.Stub{

        @Override
        public List<String> getFrimwareAddr(String newOtaVersion) throws RemoteException {
            System.out.println("------------------------getFrimwareAddr");

            List<String> addrList = new ArrayList<>();
            addrList.add("/mtms/online/v1/firms/NewLand/prodcode/N910/devices/N7NL00562692/applications");
            return addrList;
        }

        @Override
        public void updateOSService(int updateType) throws RemoteException {
            System.out.println("------------------------updateOSService");
        }

        @Override
        public void installApp(String filePath, InstallAppObserver observer) throws RemoteException {
            System.out.println("------------------------------installApp");
        }

        @Override
        public void unInstallApp(String packageName, UnInstallAppObserver observer) throws RemoteException {
            System.out.println("-----------------------------------unInstallApp");
        }

        @Override
        public String getStoragePath() throws RemoteException {
            System.out.println("-----------------------------------getStoragePath");
            return "/mtms/online/v1";
        }

        @Override
        public void backToDesktop() throws RemoteException {
            System.out.println("-----------------------------------backToDesktop");
        }

        @Override
        public String getFirmwareVer() throws RemoteException {
            System.out.println("-----------------------------------getFirmwareVer");
            return "1.1";
        }

        @Override
        public String getSecureAppVer() throws RemoteException {
            System.out.println("-----------------------------------getSecureAppVer");
            return "1.1";
        }

        @Override
        public boolean isAllSignVerfy(boolean param) throws RemoteException {
            System.out.println("-----------------------------------isAllSignVerfy");
            return false;
        }

        @Override
        public boolean isShowAppOption(boolean param) throws RemoteException {
            System.out.println("-----------------------------------isShowAppOption");
            return true;
        }

        @Override
        public boolean isShowHomeScreen(boolean param) throws RemoteException {
            System.out.println("-----------------------------------isShowHomeScreen");
            return true;
        }

        @Override
        public boolean isShowStatusBar(boolean paramBoolean) throws RemoteException {
            System.out.println("-----------------------------------isShowStatusBar");
            return false;
        }

        @Override
        public boolean isShowBackupAndReset(boolean param) throws RemoteException {
            System.out.println("-----------------------------------isShowBackupAndReset");
            return true;
        }

        @Override
        public boolean isTaskButtonValid(boolean param) throws RemoteException {
            System.out.println("-----------------------------------isTaskButtonValid");
            return true;
        }

        @Override
        public String getCertOID() throws RemoteException {
            System.out.println("-----------------------------------getCertOID");
            return null;
        }

        @Override
        public boolean isProductionDevice() throws RemoteException {
            System.out.println("-----------------------------------isProductionDevice");
            return false;
        }

        @Override
        public String getHardWareID() throws RemoteException {
            System.out.println("-----------------------------------getHardWareID");
            return "11111";
        }
    }
}
