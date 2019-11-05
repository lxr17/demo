package com.demo.app.applifecycles;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;

import com.demo.R;
import com.demo.app.utils.MToastUtils;
import com.jess.arms.base.delegate.AppLifecycles;
import com.jess.arms.utils.ArmsUtils;

/**
 * ================================================
 * Toast的基础设置
 * ================================================
 */
public class ToastAppLifecycle implements AppLifecycles {

    @Override
    public void attachBaseContext(@NonNull Context base) {
//          MultiDex.install(base);  //这里比 onCreate 先执行,常用于 MultiDex 初始化,插件化框架的初始化
    }

    @Override
    public void onCreate(@NonNull Application application) {
        MToastUtils.setGravity(Gravity.CENTER, 0, 0);
        MToastUtils.setMsgTextSize(14);
//        MToastUtils.setBgColor(ArmsUtils.getColor(application, R.color.toast_bg));
        MToastUtils.setMsgColor(ArmsUtils.getColor(application, R.color.white));
    }

    @Override
    public void onTerminate(@NonNull Application application) {

    }
}
