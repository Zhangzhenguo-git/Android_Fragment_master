package com.zzg.android_fragment_master.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * @author Zhangzhenguo
 * @create 2019/10/14
 * @Email 18311371235@163.com
 * @Describe
 */
public abstract class ToFragment extends BaseFragment{
    private static final String TAG="ToFragment";

    /**
     * 此方法中支持startActivity和startActivityForResult两种方式
     * @param intent
     * @param isTrue 如果是true则表示普通跳转，反之则ForResult跳转
     * @param requestCode 如果使用的普通跳转，次code值直接小于0即可
     * @return
     */
    public boolean jumpStartActivity(Intent intent,boolean isTrue,int requestCode){
        if (isTrue){
            if (intent!=null){
                startActivity(intent);
                return true;
            }
            return false;
        }else {
            if (intent!=null && requestCode>=0){
                startActivityForResult(intent,requestCode);
                return true;
            }
            return false;
        }
    }


//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Log.d("执行"+TAG,"onCreate()");
//    }
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Log.d("执行"+TAG,"onCreateView()");
//        return super.onCreateView(inflater, container, savedInstanceState);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Log.d("执行"+TAG,"onActivityCreated()");
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        Log.d("执行"+TAG,"onStart()");
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        Log.d("执行"+TAG,"onResume()");
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        Log.d("执行"+TAG,"onPause()");
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        Log.d("执行"+TAG,"onStop()");
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        Log.d("执行"+TAG,"onDestroyView()");
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        Log.d("执行"+TAG,"onDestroy()");
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        Log.d("执行"+TAG,"onDetach()");
//    }
//
//
//    //设置fragment为显示和隐藏    @Override
//    public void setUserVisibleHint(boolean isVisibleToUser) {
//        super.setUserVisibleHint(isVisibleToUser);
//        Log.d("执行"+TAG,"显示或隐藏setUserVisable()");
//    }

}
