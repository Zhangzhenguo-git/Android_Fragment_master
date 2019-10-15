package com.zzg.android_fragment_master.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * @author Zhangzhenguo
 * @create 2019/10/14
 * @Email 18311371235@163.com
 * @Describe
 */
public abstract class BaseFragment extends Fragment implements BaseViewInterface{
    private static final String TAG="BaseFragment";
    private View contentView;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("执行"+TAG,"onCreate()");
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        Log.d("执行"+TAG,"onCreateView()");
        if (contentView==null){
            contentView=inflater.inflate(initContentViewId(),container,false);
            //这里的上下文一定要填当前this，不要填getActivity();否则直接报异常
            ButterKnife.bind(this,contentView);
            initView(contentView);
            initData();
            myOnClick();
        }
        return contentView;
    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("执行"+TAG,"onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("执行"+TAG,"onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("执行"+TAG,"onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("执行"+TAG,"onDetach()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("执行"+TAG,"onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("执行"+TAG,"onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("执行"+TAG,"onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("执行"+TAG,"onDetach()");
    }
    //设置fragment为显示和隐藏    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.d("执行"+TAG,"显示或隐藏setUserVisable()");
    }


}
