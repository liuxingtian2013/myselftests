// UnInstallAppObserver.aidl
package com.newland.aidl.system;

// Declare any non-default types here with import statements

interface UnInstallAppObserver {

        void onUnInstallError(int errorCode, String filePath);
        void onUnInstallFinished(String filePath);

}
