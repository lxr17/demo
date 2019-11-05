package com.demo.app.applifecycles;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.demo.BuildConfig;
import com.jess.arms.base.delegate.AppLifecycles;

/**
 * ================================================
 * Arouter初始化
 * ================================================
 */
public class ArouterAppLifecycle implements AppLifecycles {

    @Override
    public void attachBaseContext(@NonNull Context base) {
//          MultiDex.install(base);  //这里比 onCreate 先执行,常用于 MultiDex 初始化,插件化框架的初始化
    }

    @Override
    public void onCreate(@NonNull Application application) {
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (BuildConfig.LOG_DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application);
    }

    @Override
    public void onTerminate(@NonNull Application application) {

    }
}
