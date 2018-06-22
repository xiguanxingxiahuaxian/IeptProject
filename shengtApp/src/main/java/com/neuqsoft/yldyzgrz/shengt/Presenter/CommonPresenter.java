package com.neuqsoft.yldyzgrz.shengt.Presenter;

import com.basego.cool.core.api.ExceptionHandle;
import com.basego.cool.core.base.BasePresenter;
import com.basego.cool.core.base.Subscribe;
import com.basego.cool.core.bean.displayDTO;
import com.basego.cool.core.model.SimpleModel;
import com.neuqsoft.yldyzgrz.shengt.model.CommonModel;
import com.neuqsoft.yldyzgrz.shengt.view.CommonView;

/**
 * 项目名称：Ieptproject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/22 10:35
 * 修改备注
 */
public class CommonPresenter extends BasePresenter<CommonView>{

    private  CommonModel commonModel;

    public CommonPresenter() {
        commonModel=new CommonModel();
    }
    public void getData(){
        // set activity a showDialog
        view.onShow();
        commonModel.getList(new Subscribe<displayDTO>() {
            @Override
            public void OnSuccess(displayDTO displayDTO) {
                // you can get success ,and this a  bean
                view.onSuccess(displayDTO);
            }

            @Override
            public void OnFail(ExceptionHandle.ResponeThrowable e) {
                // you can see error ,and debug or log this
                view.onFail(e);
            }

            @Override
            public void OnCompleted() {
                // rx is finish ,and request finish
                view.onfinish();
            }
        });
    }
}
