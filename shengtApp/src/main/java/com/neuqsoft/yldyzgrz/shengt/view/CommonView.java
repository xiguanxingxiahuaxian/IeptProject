package com.neuqsoft.yldyzgrz.shengt.view;

import com.basego.cool.core.api.ExceptionHandle;
import com.basego.cool.core.base.BaseView;

/**
 * 项目名称：Ieptproject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/22 10:36
 * 修改备注
 */
public interface CommonView extends BaseView {
    void  onSuccess(Object object);
    void  onFail(ExceptionHandle.ResponeThrowable t);
}
