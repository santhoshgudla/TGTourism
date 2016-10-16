package com.gudla.tgtourism.knr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class KarimnagarActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karimnagar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView= (RecyclerView) findViewById(R.id.knrRecyclerView);
        int[] mImageId={R.drawable.knr_dharmapuri,
                R.drawable.knr_kaleshwara,
                R.drawable.knr_kondagattu,
                R.drawable.knr_nallagonda,
                R.drawable.knr_rajeshwar,
                R.drawable.knr_nampally,
                R.drawable.knr_nagunur,R.drawable.knr_ramagirifort,R.drawable.knr_silverfiligree,R.drawable.knr_dhulikatta,
                R.drawable.knr_elgandal,R.drawable.knr_jagtial_fort,R.drawable.knr_nagunur,
                R.drawable.knr_manair,R.drawable.knr_ujwala_park,R.drawable.knr_shivaram_wildlife};
        String[] mName=getResources().getStringArray(R.array.knr_array);
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
