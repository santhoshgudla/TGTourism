package com.gudla.tgtourism;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gudla.tgtourism.heritage.HerAdbFragment;
import com.gudla.tgtourism.heritage.HerHydFragment;
import com.gudla.tgtourism.heritage.HerKhmFragment;
import com.gudla.tgtourism.heritage.HerKnrFragment;
import com.gudla.tgtourism.heritage.HerMbnFragment;
import com.gudla.tgtourism.heritage.HerMdkFragment;
import com.gudla.tgtourism.heritage.HerNldFragment;
import com.gudla.tgtourism.heritage.HerNzbFragment;
import com.gudla.tgtourism.heritage.HerWglFragment;
import com.gudla.tgtourism.heritage.MainHeritageFragment;
import com.gudla.tgtourism.util.FragmentReplace;

public class HeritageActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    DrawerLayout drawerLayout;
    ListView listView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentManager fragmentManager;
    FragmentTransaction mFragmentTransaction;
    MainHeritageFragment testFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heritage);

        drawerLayout= (DrawerLayout) findViewById(R.id.heritage_drawer);
        listView= (ListView) findViewById(R.id.heritagelist);

        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.drawer_open,R.string.drawer_closed);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView.setAdapter(new ArrayAdapter<String>(this,R.layout.regions_item,getResources().getStringArray(R.array.her_regions_array)){

            String[] regionName=getResources().getStringArray(R.array.her_regions_array);
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
        listView.setOnItemClickListener(this);
        fragmentManager=getSupportFragmentManager();
        mFragmentTransaction=fragmentManager.beginTransaction();
        testFragment=new MainHeritageFragment();
        mFragmentTransaction.add(R.id.mainheritageContainer,testFragment,"main");
        mFragmentTransaction.commit();


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
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
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentRecreate();
        }else {
            fragmentRecreate();
        }
    }

    private void fragmentRecreate() {
        testFragment=(MainHeritageFragment) getSupportFragmentManager().findFragmentByTag("main");
        if(testFragment != null){
            fragmentDestroy();
            fragmentCreate();
        }
    }

    private void fragmentCreate() {
        mFragmentTransaction = fragmentManager.beginTransaction();
        testFragment = new MainHeritageFragment();
        mFragmentTransaction.add(R.id.mainheritageContainer, testFragment, "main");
        mFragmentTransaction.commit();
    }

    private void fragmentDestroy() {
        mFragmentTransaction = fragmentManager.beginTransaction();
        mFragmentTransaction.remove(testFragment);
        mFragmentTransaction.commit();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int mContainer=R.id.mainheritageContainer;
        onItemSelected(i);
        drawerLayout.closeDrawer(listView);
        switch (i){
            case 0:
                HerHydFragment mHerHydFragment=new HerHydFragment();
                new FragmentReplace(mHerHydFragment,mContainer,fragmentManager);
                break;
            case 1:
                HerKhmFragment mHerKhmFragment=new HerKhmFragment();
                new FragmentReplace(mHerKhmFragment,mContainer,fragmentManager);
                break;
            case 2:
                HerMbnFragment mHerMbnFragment=new HerMbnFragment();
                new FragmentReplace(mHerMbnFragment,mContainer,fragmentManager);
                break;
            case 3:
                HerNldFragment mHerNldFragment= new HerNldFragment();
                new FragmentReplace(mHerNldFragment,mContainer,fragmentManager);
                break;
            case 4:
                HerWglFragment mHerWglFragment= new HerWglFragment();
                new FragmentReplace(mHerWglFragment, mContainer, fragmentManager);
                break;
            case 5:
                HerAdbFragment mHerAdbFragment= new HerAdbFragment();
                new FragmentReplace(mHerAdbFragment, mContainer, fragmentManager);
                break;
            case 6:
                HerNzbFragment mHerNzbFragment= new HerNzbFragment();
                new FragmentReplace(mHerNzbFragment, mContainer, fragmentManager);
                break;
            case 7:
                HerKnrFragment mHerKnrFragment= new HerKnrFragment();
                new FragmentReplace(mHerKnrFragment, mContainer, fragmentManager);
                break;
            case 8:
                HerMdkFragment mHerMdkFragment= new HerMdkFragment();
                new FragmentReplace(mHerMdkFragment, mContainer, fragmentManager);
                break;
            default:
                break;
        }

    }
    private void onItemSelected(int i) {
        listView.setItemChecked(i,true);
    }

}
