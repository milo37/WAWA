package com.mulcam.doji.wawa;

/**
 * Created by DongJinPark on 2017-06-05.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseNavigationActivity extends AppCompatActivity {
    protected ViewGroup contentView;
    private DrawerLayout drawerLayout;
    private ListView navigationMenuListView;
    private NavigationMenuListAdapter navigationMenuListAdapter;

    List<String> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basenavigation);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        contentView = (ViewGroup) findViewById(R.id.content);
        final LayoutInflater layoutInflater = getLayoutInflater();
        int layoutId = getLayoutId();
        if (layoutId != 0) {
            layoutInflater.inflate(layoutId, contentView);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
        data.add("메인");
        data.add("나의 펫");
        data.add("공지사항");
        data.add("지도 검색");
        data.add("알림");
        data.add("설정");
        data.add("고객문의");

        navigationMenuListAdapter = new NavigationMenuListAdapter(this, data);
        navigationMenuListView = (ListView) findViewById(R.id.menu_listview);
        navigationMenuListView.setAdapter(navigationMenuListAdapter);
        navigationMenuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(BaseNavigationActivity.this, position + "", Toast.LENGTH_SHORT).show();
                    if(position == 1){
                        Intent intent = new Intent(BaseNavigationActivity.this, MypetActivity.class);
                        startActivity(intent);
                    }
            }
        });

    }
    @LayoutRes
    protected abstract int getLayoutId();
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private class NavigationMenuListAdapter extends BaseAdapter {
        private Context context;
        private List<String> menus = null;

        public NavigationMenuListAdapter(Context mContext, List<String> data){
            context = mContext;
            menus = data;
        }


        @Override
        public int getCount() {
            return menus.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            if(row == null){
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                row = inflater.inflate(R.layout.view_navigation_list_item, parent, false);
            }
            ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.pic000 + position);
            TextView textViewTitle = (TextView)row.findViewById(R.id.title);
            textViewTitle.setText(menus.get(position));
            return row;
        }
    }



}
