// AidlSystemManage.aidl
package com.newland.aidl.system;
import com.newland.aidl.system.InstallAppObserver;
import com.newland.aidl.system.UnInstallAppObserver;

// Declare any non-default types here with import statements

interface AidlSystemManage {

        List<String> getFrimwareAddr(String newOtaVersion);
        void updateOSService(int updateType);
        void installApp(String filePath,InstallAppObserver observer) ;
        void unInstallApp(String packageName,UnInstallAppObserver observer);
        String getStoragePath();
        void backToDesktop();
        String getFirmwareVer();
        String getSecureAppVer();
        boolean isAllSignVerfy(boolean param);
        boolean isShowAppOption(boolean param);
        boolean isShowHomeScreen(boolean param);
        boolean isShowBackupAndReset(boolean param);
        boolean isTaskButtonValid(boolean param);
        boolean isShowStatusBar(boolean paramBoolean);
        String getCertOID();
        boolean isProductionDevice();
        String getHardWareID();

}
