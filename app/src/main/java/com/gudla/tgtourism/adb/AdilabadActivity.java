package com.gudla.tgtourism.adb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;

public class AdilabadActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adilabad);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.adbRecyclerView);
        int[] mImageId={R.drawable.adb_basara,
                R.drawable.adb_jainath,
                R.drawable.adb_satyanaraya,
                R.drawable.adb_papahareshwar,
                R.drawable.adb_kalwa_narsimha,R.drawable.adb_nirmalfort,
                R.drawable.adb_kanakai,R.drawable.adb_kuntala,R.drawable.adb_pochera,R.drawable.adb_gayatri,R.drawable.adb_kadam,
                R.drawable.adb_kawal_wildlife,R.drawable.adb_pranahita_wildlife,R.drawable.adb_jannaram};
        String[] mName=getResources().getStringArray(R.array.adb_array);
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
