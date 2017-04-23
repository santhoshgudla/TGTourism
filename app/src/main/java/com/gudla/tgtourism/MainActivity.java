package com.gudla.tgtourism;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.gudla.tgtourism.adb.AdilabadActivity;
import com.gudla.tgtourism.hyd.HyderabadActivity;
import com.gudla.tgtourism.khm.KhammamActivity;
import com.gudla.tgtourism.knr.KarimnagarActivity;
import com.gudla.tgtourism.mbn.MahabubnagarActivity;
import com.gudla.tgtourism.mdk.MedakActivity;
import com.gudla.tgtourism.nld.NalgondaActivity;
import com.gudla.tgtourism.nzb.NizamabadActivity;
import com.gudla.tgtourism.rr.RangareddyActivity;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;
import com.gudla.tgtourism.util.RecyclerItemClickListener;
import com.gudla.tgtourism.wgl.WarangalActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private DrawerLayout drawerLayout;
    private ListView mListView;
    private RecyclerView mRecyclerView;
    ActionBarDrawerToggle drawerListner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_drawer_layout);
        mRecyclerView = (RecyclerView) findViewById(R.id.drawer_recycler);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mListView = (ListView) findViewById(R.id.drawer_main_list);
        MyAdapter myAdapter = new MyAdapter(this);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(this);
        int[] mImageId={R.drawable.hyd_charminar,R.drawable.khm_parnashala,R.drawable.mbn_gadwalfort,R.drawable.nld_nagarjunasagar,
                R.drawable.wgl_warangalfort,R.drawable.adb_nirmalfort,R.drawable.nzb_domakonda,R.drawable.knr_elgandalfort,
                R.drawable.mdk_medakfort,R.drawable.rr_ramoji};
        String[] mName=getResources().getStringArray(R.array.regions_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(this, mImageId, mName));
        mRecyclerView.setScrollContainer(true);
        mRecyclerView.setNestedScrollingEnabled(false);

        drawerListner = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_closed) {
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
        imageAnimation();

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener(){

            @Override
            public void onItemClick(View view, int position) {
                Intent intent=null;
                switch (position){
                    case 0:
                        intent=new Intent(MainActivity.this, HyderabadActivity.class);
                        break;
                    case 1:
                        intent=new Intent(MainActivity.this, KhammamActivity.class);
                        break;
                    case 2:
                        intent=new Intent(MainActivity.this, MahabubnagarActivity.class);
                        break;
                    case 3:
                        intent=new Intent(MainActivity.this, NalgondaActivity.class);
                        break;
                    case 4:
                        intent=new Intent(MainActivity.this, WarangalActivity.class);
                        break;
                    case 5:
                        intent=new Intent(MainActivity.this, AdilabadActivity.class);
                        break;
                    case 6:
                        intent=new Intent(MainActivity.this, NizamabadActivity.class);
                        break;
                    case 7:
                        intent=new Intent(MainActivity.this, KarimnagarActivity.class);
                        break;
                    case 8:
                        intent=new Intent(MainActivity.this, MedakActivity.class);
                        break;
                    case 9:
                        intent=new Intent(MainActivity.this, RangareddyActivity.class);
                        break;
                    default:
                        break;

                }
                if(intent != null){
                    startActivity(intent);
                }
            }
        }));
    }

    private void imageAnimation() {

        imageView = (ImageView) findViewById(R.id.drawer_image_animation);
        imageView.setImageResource(R.drawable.main_image_animations);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getDrawable();
        frameAnimation.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerListner.onOptionsItemSelected(item))
            return true;
        if(item.getItemId() == R.id.contactus){
            Intent intent=new Intent(this,ContactUsActivity.class);
            startActivity(intent);
        }
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
//        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
//            setContentView(R.layout.activity_main);
//            imageAnimation();
//        }
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
//            setContentView(R.layout.activity_main_land);
//            imageAnimation();
//        }
        drawerListner.onConfigurationChanged(newConfig);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        onItemSelect(i);
        Intent intent = null;
        switch (i) {
            case 0:
                intent = new Intent(this, ScrollingActivity.class);
                break;
            case 1:
                intent = new Intent(this, DestinationsActivity.class);
                break;
            case 2:
                intent = getOpenFacebookIntent(this);
                break;
            case 3:
                intent = getOpenTwitterIntent(this);
                break;
            case 4:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/tstourism"));
                break;
            case 5:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.telanganatourism.gov.in/blog/blog.html"));
                break;
            default:
                break;
        }
        startActivity(intent);
    }

    public Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/509952489131030"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tourismtelanganastate/?ref=page_internal"));
        }
    }

    public Intent getOpenTwitterIntent(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.twitter.android", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://page?tstourism"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/tstourism"));
        }
    }

    private void onItemSelect(int i) {
        mListView.setItemChecked(i, true);
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client.connect();
//        Action viewAction = Action.newAction(
//                Action.TYPE_VIEW, // TODO: choose an action type.
//                "Main Page", // TODO: Define a title for the content shown.
//                // TODO: If you have web page content that matches this app activity's content,
//                // make sure this auto-generated web page URL is correct.
//                // Otherwise, set the URL to null.
//                Uri.parse("http://host/path"),
//                // TODO: Make sure this auto-generated app URL is correct.
//                Uri.parse("android-app://com.gudla.tgtourism/http/host/path")
//        );
//        AppIndex.AppIndexApi.start(client, viewAction);
//    }

//    @Override
//    public void onStop() {
//        super.onStop();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        Action viewAction = Action.newAction(
//                Action.TYPE_VIEW, // TODO: choose an action type.
//                "Main Page", // TODO: Define a title for the content shown.
//                // TODO: If you have web page content that matches this app activity's content,
//                // make sure this auto-generated web page URL is correct.
//                // Otherwise, set the URL to null.
//                Uri.parse("http://host/path"),
//                // TODO: Make sure this auto-generated app URL is correct.
//                Uri.parse("android-app://com.gudla.tgtourism/http/host/path")
//        );
//        AppIndex.AppIndexApi.end(client, viewAction);
//        client.disconnect();
//    }
}
class MyAdapter extends BaseAdapter{
    private Context context;
    private String[] listNav;
    private final int[] images = {R.drawable.ic_logo,R.drawable.ic_destinations,
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
        View row;
        if(view == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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