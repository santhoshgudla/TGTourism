package com.gudla.tgtourism;

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
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

public class DivineDestinationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listView;
    ActionBarDrawerToggle divineDrawerListner;
    DrawerLayout divineDrawer;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

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

        fragmentManager=getSupportFragmentManager();
            DivineHydFragment divineHydFragment = new DivineHydFragment();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.mainDivineContainer, divineHydFragment, "divineHyd");
            fragmentTransaction.commit();
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(divineDrawerListner.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        onCreate(savedInstanceState);
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
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        onItemSelected(i);
        switch (i){
            case 0:
                DivineHydFragment divineHydFragment=new DivineHydFragment();
                fragementReplace(divineHydFragment);
                break;
            case 1:
                DivineKhmFragment divineKhmFragment =new DivineKhmFragment();
                fragementReplace(divineKhmFragment);
                break;
            case 2:
                DivineMbnFragment divineMbnFragment=new DivineMbnFragment();
                fragementReplace(divineMbnFragment);
                break;
            case 3:
                DivineNldFragment divineNldFragment=new DivineNldFragment();
                fragementReplace(divineNldFragment);
                break;
            case 4:
                DivineWglFragment divineWglFragment=new DivineWglFragment();
                fragementReplace(divineWglFragment);
                break;
            case 5:
                DivineAdbFragment divineAdbFragment=new DivineAdbFragment();
                fragementReplace(divineAdbFragment);
                break;
            case 6:
                DivineNzbFragment divineNzbFragment=new DivineNzbFragment();
                fragementReplace(divineNzbFragment);
                break;
            case 7:
                DivineKnrFragment divineKnrFragment=new DivineKnrFragment();
                fragementReplace(divineKnrFragment);
                break;
            case 8:
                DivineMkdFragment divineMkdFragment=new DivineMkdFragment();
                fragementReplace(divineMkdFragment);
                break;
            case 9:
                DivineRrFragment divineRrFragment=new DivineRrFragment();
                fragementReplace(divineRrFragment);
                break;
            default:
                break;
        }

    }

    private void fragementReplace(Fragment fragment) {
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainDivineContainer,fragment,fragment.getClass().getSimpleName());
        fragmentTransaction.commit();
    }

    private void onItemSelected(int i) {
        listView.setItemChecked(i,true);
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
