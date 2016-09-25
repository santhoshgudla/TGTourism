package com.gudla.tgtourism;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
import android.widget.Toast;

import com.gudla.tgtourism.divine.DivineAdbFragment;
import com.gudla.tgtourism.divine.DivineHydFragment;
import com.gudla.tgtourism.divine.DivineKhmFragment;
import com.gudla.tgtourism.divine.DivineKnrFragment;
import com.gudla.tgtourism.divine.DivineMbnFragment;
import com.gudla.tgtourism.divine.DivineMkdFragment;
import com.gudla.tgtourism.divine.DivineNldFragment;
import com.gudla.tgtourism.divine.DivineNzbFragment;
import com.gudla.tgtourism.divine.DivineRrFragment;
import com.gudla.tgtourism.divine.DivineWglFragment;
import com.gudla.tgtourism.divine.MainFragment;
import com.gudla.tgtourism.util.FragmentReplace;

public class DivineDestinationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listView;
    ActionBarDrawerToggle divineDrawerListner;
    DrawerLayout divineDrawer;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divine_destination);
        divineDrawer= (DrawerLayout) findViewById(R.id.divine_destination_drawer);
        divineDrawerListner= new ActionBarDrawerToggle(this,divineDrawer,R.string.drawer_open,R.string.drawer_closed){
            @Override
            public void onDrawerOpened(View drawerView) {
            }

            @Override
            public void onDrawerClosed(View drawerView) {
            }
        };
        divineDrawer.addDrawerListener(divineDrawerListner);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView= (ListView) findViewById(R.id.divine_list);
        listView.setAdapter(new ArrayAdapter<String>(this,R.layout.regions_item,getResources().getStringArray(R.array.regions_array)){

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

            fragmentManager = getSupportFragmentManager();
            mainFragment = new MainFragment();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.mainDivineContainer, mainFragment, "main");
            fragmentTransaction.commit();
        listView.setOnItemClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(divineDrawerListner.onOptionsItemSelected(item)){
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
        divineDrawerListner.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        divineDrawerListner.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            mainFragment=(MainFragment)getSupportFragmentManager().findFragmentByTag("main");
            if(mainFragment instanceof MainFragment){
                fragmentDestroy();
                fragmentCreate();
            }
        }else {
            mainFragment=(MainFragment)getSupportFragmentManager().findFragmentByTag("main");
            if(mainFragment instanceof MainFragment){
                fragmentDestroy();
                fragmentCreate();
            }
        }
    }

    private void fragmentCreate() {
        fragmentTransaction = fragmentManager.beginTransaction();
        mainFragment = new MainFragment();
        fragmentTransaction.add(R.id.mainDivineContainer, mainFragment, "main");
        fragmentTransaction.commit();
    }

    private void fragmentDestroy() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(mainFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int mContainer=R.id.mainDivineContainer;
        onItemSelected(i);
        switch (i){
            case 0:
                DivineHydFragment divineHydFragment=new DivineHydFragment();
                new FragmentReplace(divineHydFragment,mContainer,fragmentManager);
                break;
            case 1:
                DivineKhmFragment divineKhmFragment =new DivineKhmFragment();
                new FragmentReplace(divineKhmFragment,mContainer,fragmentManager);
                break;
            case 2:
                DivineMbnFragment divineMbnFragment=new DivineMbnFragment();
                new FragmentReplace(divineMbnFragment,mContainer,fragmentManager);
                break;
            case 3:
                DivineNldFragment divineNldFragment=new DivineNldFragment();
                new FragmentReplace(divineNldFragment,mContainer,fragmentManager);
                break;
            case 4:
                DivineWglFragment divineWglFragment=new DivineWglFragment();
                new FragmentReplace(divineWglFragment,mContainer,fragmentManager);
                break;
            case 5:
                DivineAdbFragment divineAdbFragment=new DivineAdbFragment();
                new FragmentReplace(divineAdbFragment,mContainer,fragmentManager);
                break;
            case 6:
                DivineNzbFragment divineNzbFragment=new DivineNzbFragment();
                new FragmentReplace(divineNzbFragment,mContainer,fragmentManager);
                break;
            case 7:
                DivineKnrFragment divineKnrFragment=new DivineKnrFragment();
                new FragmentReplace(divineKnrFragment,mContainer,fragmentManager);
                break;
            case 8:
                DivineMkdFragment divineMkdFragment=new DivineMkdFragment();
                new FragmentReplace(divineMkdFragment,mContainer,fragmentManager);
                break;
            case 9:
                DivineRrFragment divineRrFragment=new DivineRrFragment();
                new FragmentReplace(divineRrFragment,mContainer,fragmentManager);
                break;
            default:
                break;
        }

    }

    private void onItemSelected(int i) {
        listView.setItemChecked(i,true);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
