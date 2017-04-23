package com.gudla.tgtourism.nzb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class NizamabadActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nizamabad);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.nzbRecyclerView);
        int[] mImageId={R.drawable.nzb_dichpalli_ramalayam,
                R.drawable.nzb_kanteshwar,
                R.drawable.nzb_quilla,
                R.drawable.nzb_sarangapur_hanuman,R.drawable.nzb_domakonda,R.drawable.nzb_fort,R.drawable.nzb_archaeological,
                R.drawable.nzb_alisagar,R.drawable.nzb_nizamsagar,R.drawable.nzb_mallaram_forest,R.drawable.nzb_pochampad,
                R.drawable.nzb_alisagar_deer};
        String[] mName=getResources().getStringArray(R.array.nzb_array);
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
