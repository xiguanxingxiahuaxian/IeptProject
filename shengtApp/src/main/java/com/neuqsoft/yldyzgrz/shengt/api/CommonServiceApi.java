package com.neuqsoft.yldyzgrz.shengt.api;

import com.basego.cool.core.bean.displayDTO;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 项目名称：Ieptproject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/22 10:38
 * 修改备注
 */
public interface CommonServiceApi {
    @GET("getListType")
    Observable<displayDTO> getList(
             @Query("pageSize") int pageSize, @Query("pageNo")int pageNo);
}
