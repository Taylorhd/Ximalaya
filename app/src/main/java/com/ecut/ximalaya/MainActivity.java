package com.ecut.ximalaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.ecut.ximalaya.adapters.IndicatorAdapter;
import com.ecut.ximalaya.adapters.MainContentAdapter;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;

public class MainActivity extends FragmentActivity {
    private static final String TAG = "MainActivity";

    private IndicatorAdapter mIndicatorAdapter;
    private ViewPager contentPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initEvent() {
        mIndicatorAdapter.setOnIndicatorTapClickListener(new IndicatorAdapter.OnIndicatorTapClickListener() {
            @Override
            public void onTabClick(int index) {
                if (contentPager!=null){
                contentPager.setCurrentItem(index);
                }
            }
        });

    }

    private void initView() {
        MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.main_indicator);
//        magicIndicator.setBackgroundColor(Color.BLACK);
        magicIndicator.setBackgroundColor(ContextCompat.getColor(this.getApplicationContext(),R.color.mainColor));
        //创建indicator 的适配器
        mIndicatorAdapter = new IndicatorAdapter(this);
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setAdapter(mIndicatorAdapter);
        // 设置要显示的内容


        // View Pager
        contentPager = findViewById(R.id.content_pager);
        // 创建内容适配器
        FragmentManager fm = getSupportFragmentManager();
        MainContentAdapter mainContentAdapter = new MainContentAdapter(fm);
        contentPager.setAdapter(mainContentAdapter);
        // 将 view pager和indicator绑定到一起
        magicIndicator.setNavigator(commonNavigator);
        ViewPagerHelper.bind(magicIndicator, contentPager);

    }
}
