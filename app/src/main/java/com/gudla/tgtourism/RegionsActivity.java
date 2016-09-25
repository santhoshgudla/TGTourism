package com.gudla.tgtourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gudla.tgtourism.util.CustomAdapter;

public class RegionsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regions);
        mListView=(ListView)findViewById(R.id.listRegions);
        int[] mImageId={R.drawable.hyd_charminar,R.drawable.khm_parnasala,R.drawable.mbn_jurala,R.drawable.nld_yadagirigutta,
                        R.drawable.wgl_warangalfort,R.drawable.adb_basara,R.drawable.nzb_alisagar_deer,R.drawable.knr_elgandal,
                        R.drawable.mdk_church,R.drawable.rr_ramoji};
        String[] mName=getResources().getStringArray(R.array.regions_array);
        mListView.setAdapter(new CustomAdapter(this, mImageId, mName));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mListView.setOnItemClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        if(item.getItemId() == R.id.contactus){
            Intent intent=new Intent(this,ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
