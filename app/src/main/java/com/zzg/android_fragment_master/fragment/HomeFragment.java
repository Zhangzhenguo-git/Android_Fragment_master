package com.zzg.android_fragment_master.fragment;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.zzg.android_fragment_master.R;
import com.zzg.android_fragment_master.activity.MyActivity;
import com.zzg.android_fragment_master.base.BaseFragment;
import com.zzg.android_fragment_master.base.ToFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;

/**
 * @author Zhangzhenguo
 * @create 2019/10/14
 * @Email 18311371235@163.com
 * @Describe
 */
public class HomeFragment extends ToFragment {
    private static final int REQUESTCODE = 0;
    @BindView(R.id.bt_Start)
    Button btStart;
    private OnFragemtnHomeInteractionListener onFragemtnHomeInteractionListener=null;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            onFragemtnHomeInteractionListener= (OnFragemtnHomeInteractionListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString() + " must implement OnArticleSelectedListener");
        }

    }

    /**
     * 工厂函数
     * @return
     */
    public static HomeFragment getInstance(){
        HomeFragment homeFragment=new HomeFragment();
        Bundle bundle=new Bundle();
        homeFragment.setArguments(bundle);
        return homeFragment;
    }

        @Override
    public int initContentViewId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView(View view) {
    }

    @Override
    public void initData() {

    }

    @Override
    public void myOnClick() {
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment跳转到Activity
//                Intent intent = new Intent(getActivity(), MyActivity.class);
//                jumpStartActivity(intent, false, REQUESTCODE);
                long id=123;
                //片段间数据共享，没琢磨透
//                Uri noteUri= ContentUris.withAppendedId(ArticleColumns.CONTENT_URI,id);
                //接口跳转
//                Fragment fragment=new BlankFragment();
//                onFragemtnHomeInteractionListener.onFragmentInteraction(fragment);
//                Fragment框架跳转
                start(BlankFragment.newInstance());
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 0:
                Toast.makeText(getActivity(), "返回来了", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                break;
            default:
                break;
        }
    }


    public interface OnFragemtnHomeInteractionListener{
        // TODO: Update argument type and name
        void onFragmentInteraction(Fragment fragment);
    }
}
