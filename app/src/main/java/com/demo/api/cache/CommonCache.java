package com.demo.api.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.Reply;

/**
 * Created by lanxingren on 2019-06-26.
 */
public interface CommonCache {

    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<List<Object>>> getUsers(Observable<List<Object>> oUsers, DynamicKey idLastUserQueried, EvictProvider evictProvider);

}
