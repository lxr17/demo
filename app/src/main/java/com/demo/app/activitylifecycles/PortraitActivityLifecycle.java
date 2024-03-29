package com.demo.app.activitylifecycles;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

//import com.demo.mmz.wxapi.WXEntryActivity;

/**
 * ================================================
 * 强制所有页面竖屏显示
 * ================================================
 */
public class PortraitActivityLifecycle implements Application.ActivityLifecycleCallbacks {

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        // 只有WXEntryActivity不添加该属性
//        if (!(activity instanceof WXEntryActivity)) {
//            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        }
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }
}
