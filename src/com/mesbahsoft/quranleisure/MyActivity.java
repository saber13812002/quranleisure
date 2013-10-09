package com.mesbahsoft.quranleisure;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Launchalot  launchable = new
//        ActivityInfo activity=Launchalot.activityInfo;
//        ComponentName name=new ComponentName(activity.applicationInfo.packageName,
//                activity.name);
//        Intent i=new Intent(Intent.ACTION_MAIN);
//
//        i.addCategory(Intent.CATEGORY_LAUNCHER);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
//                Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
//        i.setComponent(name);
//
//        startActivity(i);
//
//        final Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
//        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
//        final List pkgAppsList = context.getPackageManager().queryIntentActivities( mainIntent, 0);
//
//
//        final PackageManager pm = getPackageManager();
////get a list of installed apps.
//        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
//
//        for (ApplicationInfo packageInfo : packages) {
//            Log.d(TAG, "Installed package :" + packageInfo.packageName);
//            Log.d(TAG, "Launch Activity :" + pm.getLaunchIntentForPackage(packageInfo.packageName));
//        }
// the getLaunchIntentForPackage returns an intent that you can use with startActivity()
    }
    /**
     * Return whether the given PackgeInfo represents a system package or not.
     * User-installed packages (Market or otherwise) should not be denoted as
     * system packages.
     *
     * @param pkgInfo
     * @return
     */
//    private boolean isSystemPackage(PackageInfo pkgInfo) {
//        return ((pkgInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0) ? true
//                : false;
//    }





}
