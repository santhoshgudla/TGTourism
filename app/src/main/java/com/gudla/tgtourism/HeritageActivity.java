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

import com.gudla.tgtourism.heritage.TestFragment;

public class HeritageActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    DrawerLayout drawerLayout;
    ListView listView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentManager fragmentManager;

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
        listView.setOnItemClickListener(this);
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        MainHeritageFragment mainHeritageFragment=new MainHeritageFragment();
//        fragmentTransaction.add(R.id.mainheritageContainer,mainHeritageFragment,mainHeritageFragment.getClass().getSimpleName());
        TestFragment testFragment=new TestFragment();
        fragmentTransaction.add(R.id.mainheritageContainer,testFragment,testFragment.getClass().getSimpleName());
        fragmentTransaction.commit();
//        ItemFragment itemFragment=new ItemFragment();
//        fragmentTransaction.add(R.id.mainheritageContainer,itemFragment,itemFragment.getClass().getSimpleName());
//        fragmentTransaction.commit();


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        onItemSelected(i);
    }
    private void onItemSelected(int i) {
        listView.setItemChecked(i,true);
    }

}
