package com.gudla.tgtourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gudla.tgtourism.adb.AdilabadActivity;
import com.gudla.tgtourism.hyd.HyderabadActivity;
import com.gudla.tgtourism.khm.KhammamActivity;
import com.gudla.tgtourism.knr.KarimnagarActivity;
import com.gudla.tgtourism.mbn.MahabubnagarActivity;
import com.gudla.tgtourism.mdk.MedakActivity;
import com.gudla.tgtourism.nld.NalgondaActivity;
import com.gudla.tgtourism.nzb.NizamabadActivity;
import com.gudla.tgtourism.rr.RangareddyActivity;
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
        Intent intent=null;
        switch (i){
            case 0:
                intent=new Intent(this, HyderabadActivity.class);
                break;
            case 1:
                intent=new Intent(this, KhammamActivity.class);
                break;
            case 2:
                intent=new Intent(this, MahabubnagarActivity.class);
                break;
            case 3:
                intent=new Intent(this, NalgondaActivity.class);
                break;
            case 4:
                intent=new Intent(this, WarangalActivity.class);
                break;
            case 5:
                intent=new Intent(this, AdilabadActivity.class);
                break;
            case 6:
                intent=new Intent(this, NizamabadActivity.class);
                break;
            case 7:
                intent=new Intent(this, KarimnagarActivity.class);
                break;
            case 8:
                intent=new Intent(this, MedakActivity.class);
                break;
            case 9:
                intent=new Intent(this, RangareddyActivity.class);
                break;
            default:
                break;

        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
