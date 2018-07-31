package com.neuqsoft.sg.sgapp.application;

import com.basego.cool.core.base.BaseApp;

import io.rong.imkit.RongIM;

/**
 * 项目名称：IeptProject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/23 14:17
 * 修改备注
 */
public class SgAppliction extends BaseApp{

    @Override
    public void onCreate() {
        super.onCreate();
        // init RongY
        initView();
    }

    private void initView() {
        RongIM.init(this);
    }
}
