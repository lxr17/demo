package com.demo.app.utils;

import android.view.View;

import com.jess.arms.utils.ArmsUtils;

/**
 * 显示隐藏View的工具类
 * <p>
 * Created by lanxingren on 2019-06-28.
 */
public class ViewUtils {

    public static void visible(View... views) {
        for (View view : views) {
            if (!ArmsUtils.isEmpty(view)) {
                view.setVisibility(View.VISIBLE);
            }
        }
    }

    public static void gone(View... views) {
        for (View view : views) {
            if (!ArmsUtils.isEmpty(view)) {
                view.setVisibility(View.GONE);
            }
        }
    }

    public static void invisible(View... views) {
        for (View view : views) {
            if (!ArmsUtils.isEmpty(view)) {
                view.setVisibility(View.INVISIBLE);
            }
        }
    }

}
