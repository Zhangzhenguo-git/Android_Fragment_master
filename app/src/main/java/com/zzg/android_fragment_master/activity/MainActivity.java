package com.zzg.android_fragment_master.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.zzg.android_fragment_master.R;
import com.zzg.android_fragment_master.fragment.HomeFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnFragemtnHomeInteractionListener {


    @BindView(R.id.fl_Main_layout)
    FrameLayout flMainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        Fragmentation.builder().stackViewMode(Fragmentation.BUBBLE).debug(BuildConfig.DEBUG).install();
        initView();
    }

    private void initView() {
        Fragment homeFragment = new HomeFragment();
        //创建Fragment并获取布局管理器
        FragmentManager manager = getSupportFragmentManager();
        //打开事务管理
        FragmentTransaction transaction = manager.beginTransaction();
        //设置资源ID，以及要添加的视图
        transaction.replace(R.id.fl_Main_layout, homeFragment);
        transaction.addToBackStack(null);
        transaction.commit();
//        if (findFragment(HomeFragment.class) == null){
//            loadRootFragment(R.id.fl_Main_layout, HomeFragment.getInstance());  //load root Fragment
//        }
    }

    @Override
    public void onFragmentInteraction(Fragment fragment) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction tran=manager.beginTransaction();
        tran.replace(R.id.fl_Main_layout,fragment);
        tran.commit();
    }
}
