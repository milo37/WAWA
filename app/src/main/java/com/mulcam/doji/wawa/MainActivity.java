package com.mulcam.doji.wawa;

/**
 * Created by DongJinPark on 2017-06-05.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

/**
 * Created by DongJinPark on 2017-06-03.
 */

public class MainActivity extends BaseNavigationActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private ViewPager viewpager;
    private Fragment f1;
    private Fragment f2;
    private Fragment f3;
    private Fragment f4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        btn1 = (Button)findViewById(R.id.btn_first);
        btn2 = (Button)findViewById(R.id.btn_second);
        btn3 = (Button)findViewById(R.id.btn_third);
        btn4 = (Button)findViewById(R.id.btn_fourth);
        f1 = new PageOneFragment();
        f2 = new PageTwoFragment();
        f3 = new PageThreeFragment();
        f4 = new PageFourFragment();
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(3);
            }
        });
        viewpager.setAdapter(new MyViewPager(getSupportFragmentManager()));

    }
    class MyViewPager extends FragmentPagerAdapter {

        public MyViewPager(FragmentManager fm){
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return f1;
                case 1:
                    return f2;
                case 2:
                    return f3;
                case 3:
                    return f4;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

}