package com.neuqsoft.yldyzgrz.shengt;


import android.os.Bundle;

import com.basego.cool.core.api.ExceptionHandle;
import com.basego.cool.core.base.MvpActivity;
import com.neuqsoft.yldyzgrz.shengt.Presenter.CommonPresenter;
import com.neuqsoft.yldyzgrz.shengt.view.CommonView;


public class ShentTActivity extends MvpActivity<CommonPresenter> implements CommonView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getLayoutid() {
        return R.layout.activity_iept_core;
    }

    @Override
    public void initView() {
        presener.getData();
    }

    @Override
    public void initData() {
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onfinish() {

    }

    @Override
    public void onFail() {

    }

    @Override
    public void onSuccess(Object object) {

    }

    @Override
    public void onFail(ExceptionHandle.ResponeThrowable t) {

    }

    @Override
    protected CommonPresenter initPresener() {
        return new CommonPresenter();
    }
}
