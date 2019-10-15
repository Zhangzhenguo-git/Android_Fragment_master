package com.zzg.android_fragment_master.base;

import android.view.View;

/**
 * @author Zhangzhenguo
 * @create 2019/10/14
 * @Email 18311371235@163.com
 * @Describe
 */
public interface BaseViewInterface {
    //界面布局ID
    int initContentViewId();
    //实例化组件
    void initView(View view);
    //实例化数据
    void initData();
    //实例化数据
    void myOnClick();
}
