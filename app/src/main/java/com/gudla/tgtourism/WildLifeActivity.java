package com.gudla.tgtourism;

import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gudla.tgtourism.wildlife.WildlifeMainFragment;

public class WildLifeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    ActionBarDrawerToggle mWildLifeDrawerListner;
    DrawerLayout mWildLifeDrawer;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_life);
        mWildLifeDrawer= (DrawerLayout) findViewById(R.id.wildlife_drawer);
        mWildLifeDrawerListner= new ActionBarDrawerToggle(this,mWildLifeDrawer,R.string.drawer_open,R.string.drawer_closed){
            @Override
            public void onDrawerOpened(View drawerView) {
            }

            @Override
            public void onDrawerClosed(View drawerView) {
            }
        };

        mWildLifeDrawer.addDrawerListener(mWildLifeDrawerListner);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mListView= (ListView) findViewById(R.id.wildlife_list);
        mListView.setAdapter(new ArrayAdapter<String>(this,R.layout.regions_item,getResources().getStringArray(R.array.regions_array)){

            String[] regionName=getResources().getStringArray(R.array.regions_array);
            @Override
            public int getCount() {
                return regionName.length;
            }

            @Override
            public String getItem(int position) {
                return regionName[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if(convertView == null){
                    LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(getContext().LAYOUT_INFLATER_SERVICE);
                    convertView=inflater.inflate(R.layout.regions_item,parent,false);
                }
                TextView textView= (TextView) convertView.findViewById(R.id.textView4);
                textView.setText(regionName[position]);
                return convertView;
            }
        });
        mListView.setOnItemClickListener(this);
        mFragmentManager=getSupportFragmentManager();
        mFragmentTransaction=mFragmentManager.beginTransaction();
        WildlifeMainFragment mWildlifeMainFragment=new WildlifeMainFragment();
        mFragmentTransaction.add(R.id.mainWildLifeContainer,mWildlifeMainFragment,mWildlifeMainFragment.getClass().getSimpleName());
        mFragmentTransaction.commit();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mWildLifeDrawerListner.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null) {
            onCreate(savedInstanceState);
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mWildLifeDrawerListner.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mWildLifeDrawerListner.onConfigurationChanged(newConfig);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int mContainer=R.id.mainWildLifeContainer;
        onItemSelected(i);

    }

    private void onItemSelected(int i) {
        mListView.setItemChecked(i,true);
    }
}
