package com.demo.biz.startup.di.component;

import dagger.BindsInstance;
import dagger.Component;
import com.jess.arms.di.component.AppComponent;

import com.demo.biz.startup.di.module.StartUpModule;
import com.demo.biz.startup.mvp.contract.StartUpContract;

import com.jess.arms.di.scope.ActivityScope;
import com.demo.biz.startup.mvp.ui.activity.StartUpActivity;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 11/04/2019 14:33
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = StartUpModule.class, dependencies = AppComponent.class)
public interface StartUpComponent {
    void inject(StartUpActivity activity);
    @Component.Builder
    interface Builder {
        @BindsInstance
        StartUpComponent.Builder view(StartUpContract.View view);
        StartUpComponent.Builder appComponent(AppComponent appComponent);
        StartUpComponent build();
    }
}