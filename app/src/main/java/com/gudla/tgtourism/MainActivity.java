package com.gudla.tgtourism;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private DrawerLayout drawerLayout;
    private ListView listView;
    ActionBarDrawerToggle drawerListner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        listView = (ListView) findViewById(R.id.drawerList);
        MyAdapter myAdapter=new MyAdapter(this);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(this);
        drawerListner=new ActionBarDrawerToggle(this,drawerLayout,R.string.drawer_open, R.string.drawer_closed){
            @Override
            public void onDrawerOpened(View drawerView) {
            }

            @Override
            public void onDrawerClosed(View drawerView) {
            }
        };
        drawerLayout.addDrawerListener(drawerListner);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView imageView= (ImageView) findViewById(R.id.main_imageView);
        imageView.setImageResource(R.drawable.main_image_animations);

        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getDrawable();
        frameAnimation.start();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerListner.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListner.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerListner.onConfigurationChanged(newConfig);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        onItemSelect(i);
        Intent intent=null;
        switch (i){
            case 0:
                intent=new Intent(this,ScrollingActivity.class);
                break;
            case 1:
                intent=new Intent(this,DestinationsActivity.class);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
        startActivity(intent);
    }

    private void onItemSelect(int i) {
        listView.setItemChecked(i, true);
    }

}
class MyAdapter extends BaseAdapter{
    private Context context;
    public String[] listNav;
    int[] images = {R.drawable.ic_logo,R.drawable.ic_destinations,R.drawable.tg_districts,
            R.drawable.ic_facebook,R.drawable.ic_twitter,R.drawable.ic_youtube,R.drawable.ic_blog};
    MyAdapter(Context context){
        this.context=context;
        listNav=context.getResources().getStringArray(R.array.navlist);
    }
    @Override
    public int getCount() {
        return listNav.length;
    }

    @Override
    public Object getItem(int i) {
        return listNav[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row=null;
        if(view == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.custom_layout,viewGroup,false);
        }
        else {
            row=view;
        }
        TextView textView= (TextView) row.findViewById(R.id.textView);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
        textView.setText(listNav[i]);
        imageView.setImageResource(images[i]);
        return row;
    }
}