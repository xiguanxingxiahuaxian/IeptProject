package com.neuqsoft.yldyzgrz.shengt.model;

import com.basego.cool.core.api.RetrofitBuilder;
import com.basego.cool.core.api.SubscriptionManager;
import com.basego.cool.core.base.Subscribe;
import com.basego.cool.core.bean.displayDTO;
import com.neuqsoft.yldyzgrz.shengt.api.CommonServiceApi;
import com.neuqsoft.yldyzgrz.shengt.api.UrlContant;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 项目名称：Ieptproject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/22 10:39
 * 修改备注
 */
public class CommonModel {
    public void getList(Subscribe<displayDTO> subscribe){
        // get this response ,you can get obj of observable
        Observable<displayDTO> observable = new RetrofitBuilder.NewBuilder().baseUrl(UrlContant.BASEURL).initRetrofit().Build()
                .getRetrofit().create(CommonServiceApi.class).getList(0, 10);
        // set observable work thread
        Subscription subscription = observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscribe);
        //  add this request ,and sometime you what be cannel this  when you deal with an activity by desctroy or "keyback"
        SubscriptionManager.getInstance().add("getList",subscription);
    }
}
