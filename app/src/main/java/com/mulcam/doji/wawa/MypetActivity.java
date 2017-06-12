package com.mulcam.doji.wawa;

/**
 * Created by DongJinPark on 2017-06-07.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by student on 2017-05-31.
 */

public class MypetActivity extends Activity{
    private TabHost tabHost;
    private ListView mypetList;
    private PetInfoAdapter adapter;
    private ImageButton backBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypet);

        tabHost = (TabHost) findViewById(R.id.tabHost1);
        mypetList = (ListView) findViewById(R.id.mypet_list);
        adapter = new PetInfoAdapter(this, R.layout.list_mypet, new ArrayList<PetInfo>());
        backBtn = (ImageButton)findViewById(R.id.mypet_back_btn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        tabHost.setup();

        PetInfo p = new PetInfo();
        p.setName("와와");
        p.setResist("123456789");
        p.setKind("불독");
        p.setBirthday("2013-01-14");
        p.setNeutral("Y");
        p.setWeight(30.5);
        p.setSex("수컷");
        adapter.add(p);

        PetInfo p2 = new PetInfo();
        p2.setName("와와2");
        p2.setResist("123");
        p2.setKind("치와와");
        p2.setBirthday("2011-05-24");
        p2.setNeutral("N");
        p2.setWeight(3.5);
        p2.setSex("암컷");
        adapter.add(p2);

        PetInfo p3 = new PetInfo();
        p3.setName("와와3");
        p3.setResist("111111111111111");
        p3.setKind("골든리트리버");
        p3.setBirthday("1995-05-24");
        p3.setNeutral("Y");
        p3.setWeight(1.3);
        p3.setSex("암컷");
        adapter.add(p3);

        PetInfo p4 = new PetInfo();
        p4.setName("와와5");
        p4.setResist("123");
        p4.setKind("치와와");
        p4.setBirthday("2011-05-24");
        p4.setNeutral("N");
        p4.setWeight(3.5);
        p4.setSex("암컷");
        adapter.add(p4);

        PetInfo p5 = new PetInfo();
        p5.setName("와와5");
        p5.setResist("123");
        p5.setKind("치와와");
        p5.setBirthday("2011-05-24");
        p5.setNeutral("Y");
        p5.setWeight(3.5);
        p5.setSex("암컷");
        adapter.add(p5);

        mypetList.setAdapter(adapter);

        TabHost.TabSpec ts1 = tabHost.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.content1);
        ts1.setIndicator("내 펫");
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.content2);
        ts2.setIndicator("헬스케어");
        tabHost.addTab(ts2);

        TabHost.TabSpec ts3 = tabHost.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.content3);
        ts3.setIndicator("메디컬케어");
        tabHost.addTab(ts3);

    }
}
