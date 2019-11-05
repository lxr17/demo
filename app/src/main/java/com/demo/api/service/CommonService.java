package com.demo.api.service;

import com.demo.entity.BaseResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by lanxingren on 2019-06-26.
 */
public interface CommonService {

    /**
     * 获取banner列表
     *
     * @return
     */
    @GET("banner/list")
    Observable<BaseResponse<List<Object>>> bannerList();


}
