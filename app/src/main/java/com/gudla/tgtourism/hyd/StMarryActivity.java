package com.gudla.tgtourism.hyd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.hyd.jagannath.JagannathHistoryFragment;
import com.gudla.tgtourism.hyd.jagannath.JagannathMoreInfoFragment;
import com.gudla.tgtourism.hyd.stmarry.StMarryHistoryFragment;
import com.gudla.tgtourism.hyd.stmarry.StMarryMoreInfoFragment;
import com.gudla.tgtourism.util.MyPagerAdapter;

public class StMarryActivity extends AppCompatActivity {
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_marry);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mViewPager= (ViewPager) findViewById(R.id.stMarryPager);
        StMarryHistoryFragment mStMarryHistoryFragment=new StMarryHistoryFragment();
        StMarryMoreInfoFragment mStMarryMoreInfoFragment=new StMarryMoreInfoFragment();
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), mStMarryHistoryFragment, mStMarryMoreInfoFragment));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.contactus) {
            Intent intent = new Intent(this, ContactUsActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}