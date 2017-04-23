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
import android.widget.TextView;

import com.gudla.tgtourism.nature.NatAdbFragment;
import com.gudla.tgtourism.nature.NatHydFragment;
import com.gudla.tgtourism.nature.NatKhmFragment;
import com.gudla.tgtourism.nature.NatKnrFragment;
import com.gudla.tgtourism.nature.NatMbnFragment;
import com.gudla.tgtourism.nature.NatMdkFragment;
import com.gudla.tgtourism.nature.NatNldFragment;
import com.gudla.tgtourism.nature.NatNzbFragment;
import com.gudla.tgtourism.nature.NatRrFragment;
import com.gudla.tgtourism.nature.NatWglFragment;
import com.gudla.tgtourism.nature.NatureMainFragment;
import com.gudla.tgtourism.util.FragmentReplace;

public class NatureActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    ActionBarDrawerToggle mNatureDrawerListner;
    DrawerLayout mNatureDrawer;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    NatureMainFragment mNatureMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        mNatureDrawer= (DrawerLayout) findViewById(R.id.nature_drawer);
        mListView= (ListView) findViewById(R.id.nature_list);

        mNatureDrawerListner= new ActionBarDrawerToggle(this,mNatureDrawer,R.string.drawer_open,R.string.drawer_closed);
        mNatureDrawer.addDrawerListener(mNatureDrawerListner);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
        mNatureMainFragment=new NatureMainFragment();
        mFragmentTransaction.add(R.id.mainNatureContainer,mNatureMainFragment,"main");
        mFragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mNatureDrawerListner.onOptionsItemSelected(item)){
            return true;
        }
        if(item.getItemId() == R.id.contactus){
            Intent intent=new Intent(this,ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mNatureDrawerListner.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mNatureDrawerListner.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentRecreate();
        }else {
            fragmentRecreate();
        }
    }

    private void fragmentRecreate() {
        mNatureMainFragment=(NatureMainFragment) getSupportFragmentManager().findFragmentByTag("main");
        if(mNatureMainFragment != null){
            fragmentDestroy();
            fragmentCreate();
        }
    }

    private void fragmentCreate() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mNatureMainFragment = new NatureMainFragment();
        mFragmentTransaction.add(R.id.mainNatureContainer, mNatureMainFragment, "main");
        mFragmentTransaction.commit();
    }

    private void fragmentDestroy() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.remove(mNatureMainFragment);
        mFragmentTransaction.commit();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int mContainer=R.id.mainNatureContainer;
        onItemSelected(i);
        switch (i){
            case 0:
                NatHydFragment mHerHydFragment=new NatHydFragment();
                new FragmentReplace(mHerHydFragment,mContainer,mFragmentManager);
                break;
            case 1:
                NatKhmFragment mNatKhmFragment=new NatKhmFragment();
                new FragmentReplace(mNatKhmFragment,mContainer,mFragmentManager);
                break;
            case 2:
                NatMbnFragment mNatMbnFragment=new NatMbnFragment();
                new FragmentReplace(mNatMbnFragment, mContainer, mFragmentManager);
                break;
            case 3:
                NatNldFragment mNatNldFragment=new NatNldFragment();
                new FragmentReplace(mNatNldFragment, mContainer, mFragmentManager);
                break;
            case 4:
                NatWglFragment mNatWglFragment=new NatWglFragment();
                new FragmentReplace(mNatWglFragment, mContainer, mFragmentManager);
                break;
            case 5:
                NatAdbFragment mNatAdbFragment=new NatAdbFragment();
                new FragmentReplace(mNatAdbFragment, mContainer, mFragmentManager);
                break;
            case 6:
                NatNzbFragment mNatNzbFragment=new NatNzbFragment();
                new FragmentReplace(mNatNzbFragment, mContainer, mFragmentManager);
                break;
            case 7:
                NatKnrFragment mNatKnrFragment=new NatKnrFragment();
                new FragmentReplace(mNatKnrFragment, mContainer, mFragmentManager);
                break;
            case 8:
                NatMdkFragment mNatMdkFragment=new NatMdkFragment();
                new FragmentReplace(mNatMdkFragment, mContainer, mFragmentManager);
                break;
            case 9:
                NatRrFragment mNatRrFragment=new NatRrFragment();
                new FragmentReplace(mNatRrFragment, mContainer, mFragmentManager);
                break;
            default:
                break;
        }

    }

    private void onItemSelected(int i) {
        mListView.setItemChecked(i,true);
    }
}
