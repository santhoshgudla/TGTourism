package com.gudla.tgtourism.rr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;

public class RangareddyActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangareddy);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.rrRecyclerView);
        int[] mImageId={R.drawable.rr_sanghi,
                R.drawable.rr_karmanghat,
                R.drawable.rr_lingeswara,
                R.drawable.rr_chilkur_balaji,
                R.drawable.rr_maheshwaram,
                R.drawable.rr_ananthagiri,
                R.drawable.rr_ananthagiri_hills,R.drawable.rr_ramoji,R.drawable.rr_osman_sagar,
                R.drawable.rr_shamirpet_deer};
        String[] mName=getResources().getStringArray(R.array.rr_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(this, mImageId, mName));
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
