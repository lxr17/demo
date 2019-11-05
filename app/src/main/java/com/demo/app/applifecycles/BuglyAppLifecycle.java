package com.demo.app.applifecycles;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.demo.BuildConfig;
import com.jess.arms.base.delegate.AppLifecycles;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * ================================================
 * Bugly初始化
 * ================================================
 */
public class BuglyAppLifecycle implements AppLifecycles {

    @Override
    public void attachBaseContext(@NonNull Context base) {
//          MultiDex.install(base);  //这里比 onCreate 先执行,常用于 MultiDex 初始化,插件化框架的初始化
    }

    @Override
    public void onCreate(@NonNull Application application) {
        if (BuildConfig.LOG_DEBUG) {
            CrashReport.initCrashReport(application, "", true);
        } else {
            CrashReport.initCrashReport(application, "", false);
        }
    }

    @Override
    public void onTerminate(@NonNull Application application) {

    }
}
