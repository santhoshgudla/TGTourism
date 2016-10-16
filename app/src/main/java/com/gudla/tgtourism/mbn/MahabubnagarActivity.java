package com.gudla.tgtourism.mbn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class MahabubnagarActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahabubnagar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.mbnRecyclerView);
        int[] mImageId={R.drawable.mbn_jogulamba,
                R.drawable.mbn_maheshwara_swamy,
                R.drawable.mbn_maisigandi_maisamma,
                R.drawable.mbn_beechupally_hanuman,
                R.drawable.mbn_siva_nallamalla,
                R.drawable.mbn_manyamkonda_venkateshwara,
                R.drawable.mbn_pillalamarri,R.drawable.mbn_alampur,R.drawable.mbn_gadwalfort,
                R.drawable.mbn_mallela,R.drawable.mbn_tiger_forest,R.drawable.mbn_jurala,R.drawable.mbn_koilsagar,
                R.drawable.mbn_srisailam_tiger};
        String[] mName=getResources().getStringArray(R.array.mbn_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, mImageId, mName));
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
