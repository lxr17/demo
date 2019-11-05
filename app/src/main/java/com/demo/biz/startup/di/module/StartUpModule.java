package com.demo.biz.startup.di.module;

import dagger.Binds;
import dagger.Module;

import com.demo.biz.startup.mvp.contract.StartUpContract;
import com.demo.biz.startup.mvp.model.StartUpModel;


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
@Module
public abstract class StartUpModule {

    @Binds
    abstract StartUpContract.Model bindStartUpModel(StartUpModel model);
}