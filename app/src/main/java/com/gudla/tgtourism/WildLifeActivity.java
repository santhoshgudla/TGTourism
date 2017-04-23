package com.gudla.tgtourism;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import com.gudla.tgtourism.util.FragmentReplace;
import com.gudla.tgtourism.wildlife.WildAdbFragment;
import com.gudla.tgtourism.wildlife.WildHydFragment;
import com.gudla.tgtourism.wildlife.WildKhmFragment;
import com.gudla.tgtourism.wildlife.WildKnrFragment;
import com.gudla.tgtourism.wildlife.WildMbnFragment;
import com.gudla.tgtourism.wildlife.WildMdkFragment;
import com.gudla.tgtourism.wildlife.WildNzbFragment;
import com.gudla.tgtourism.wildlife.WildRrFragment;
import com.gudla.tgtourism.wildlife.WildWglFragment;
import com.gudla.tgtourism.wildlife.WildlifeMainFragment;

public class WildLifeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    ActionBarDrawerToggle mWildLifeDrawerListner;
    DrawerLayout mWildLifeDrawer;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    WildlifeMainFragment mWildlifeMainFragment;

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
        mListView.setAdapter(new ArrayAdapter<String>(this,R.layout.regions_item,getResources().getStringArray(R.array.regions_wild_array)){

            String[] regionName=getResources().getStringArray(R.array.regions_wild_array);
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
                    LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        mWildlifeMainFragment=new WildlifeMainFragment();
        mFragmentTransaction.add(R.id.mainWildLifeContainer,mWildlifeMainFragment,"main");
        mFragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mWildLifeDrawerListner.onOptionsItemSelected(item)){
            return true;
        }
        if(item.getItemId() == R.id.contactus){
            Intent intent=new Intent(this,ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        if(savedInstanceState != null) {
//            onCreate(savedInstanceState);
//        }
//    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mWildLifeDrawerListner.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mWildLifeDrawerListner.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentRecreate();
        }else {
            fragmentRecreate();
        }
    }

    private void fragmentRecreate() {
        mWildlifeMainFragment=(WildlifeMainFragment) getSupportFragmentManager().findFragmentByTag("main");
        if(mWildlifeMainFragment != null){
            fragmentDestroy();
            fragmentCreate();
        }
    }

    private void fragmentCreate() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mWildlifeMainFragment = new WildlifeMainFragment();
        mFragmentTransaction.add(R.id.mainWildLifeContainer, mWildlifeMainFragment, "main");
        mFragmentTransaction.commit();
    }

    private void fragmentDestroy() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.remove(mWildlifeMainFragment);
        mFragmentTransaction.commit();
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int mContainer=R.id.mainWildLifeContainer;
        onItemSelected(i);
        switch(i){
            case 0:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildHydFragment mWildHydFragment=new WildHydFragment();
                new FragmentReplace(mWildHydFragment, mContainer, mFragmentManager);
                break;
            case 1:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildKhmFragment mWildKhmFragment=new WildKhmFragment();
                new FragmentReplace(mWildKhmFragment, mContainer, mFragmentManager);
                break;
            case 2:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildMbnFragment mWildMbnFragment=new WildMbnFragment();
                new FragmentReplace(mWildMbnFragment, mContainer, mFragmentManager);
                break;
            case 3:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildWglFragment mWildWglFragment=new WildWglFragment();
                new FragmentReplace(mWildWglFragment, mContainer, mFragmentManager);
                break;
            case 4:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildAdbFragment mWildAdbFragment=new WildAdbFragment();
                new FragmentReplace(mWildAdbFragment, mContainer, mFragmentManager);
                break;
            case 5:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildNzbFragment mWildNzbFragment=new WildNzbFragment();
                new FragmentReplace(mWildNzbFragment, mContainer, mFragmentManager);
                break;
            case 6:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildKnrFragment mWildKnrFragment=new WildKnrFragment();
                new FragmentReplace(mWildKnrFragment, mContainer, mFragmentManager);
                break;
            case 7:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildMdkFragment mWildMdkFragment=new WildMdkFragment();
                new FragmentReplace(mWildMdkFragment, mContainer, mFragmentManager);
                break;
            case 8:
                mFragmentTransaction=mFragmentManager.beginTransaction();
                WildRrFragment mWildRrFragment=new WildRrFragment();
                new FragmentReplace(mWildRrFragment, mContainer, mFragmentManager);
                break;
            default:
                break;
        }
    }

    private void onItemSelected(int i) {
        mListView.setItemChecked(i,true);
    }
}
