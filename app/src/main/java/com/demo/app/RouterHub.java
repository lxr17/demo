package com.demo.app;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * ================================================
 * 全局管理页面跳转
 * ================================================
 */
public class RouterHub {
    private static final String APP = "/demo";

    /**
     * 首页
     */
    public static void main() {
        build(APP).navigation();
    }

    private static Postcard build(String path) {
        return ARouter.getInstance().build(path);
    }
}
