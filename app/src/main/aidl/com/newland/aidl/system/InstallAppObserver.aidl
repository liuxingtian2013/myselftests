// InstallAppObserver.aidl
package com.newland.aidl.system;

// Declare any non-default types here with import statements

interface InstallAppObserver {

    void onInstallError(int errorCode, String filePath);
    void onInstallFinished(String filePath);
}
