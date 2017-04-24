package com.gudla.tgtourism.nld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;

public class NalgondaActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalgonda);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.nldRecyclerView);
        int[] mImageId={R.drawable.nld_yadagirigutta,
                R.drawable.nld_surendrapuri,
                R.drawable.nld_someswara,R.drawable.nld_nandikonda,R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,
                R.drawable.nld_devarakonda,R.drawable.nld_bhongir,R.drawable.nld_rachakondafort,R.drawable.nld_nagarjunasagar,};
        String[] mName=getResources().getStringArray(R.array.nld_array);
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
