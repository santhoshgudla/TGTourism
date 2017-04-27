package com.gudla.tgtourism.hyd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.hyd.qutub.MainQutubFragment;
import com.gudla.tgtourism.hyd.qutub.MoreQutubFragment;
import com.gudla.tgtourism.util.MyPagerAdapter;

public class QutubShahi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qutub_shahi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ViewPager viewPager = (ViewPager) findViewById(R.id.qutub_viewpager);
        MainQutubFragment mainQutubFragment = new MainQutubFragment();
        MoreQutubFragment moreQutubFragment = new MoreQutubFragment();
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), mainQutubFragment, moreQutubFragment));

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
