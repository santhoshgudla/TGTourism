package com.gudla.tgtourism.mdk;

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

public class MedakActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medak);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.mdkRecyclerView);
        int[] mImageId={R.drawable.mdk_kotilingeswara,
                R.drawable.mdk_edupayala,
                R.drawable.mdk_narasimha,
                R.drawable.mdk_durga_bhavani,
                R.drawable.mdk_sangameswara,
                R.drawable.mdk_joginatha,
                R.drawable.mdk_visweashwara,
                R.drawable.mdk_vidya_saraswathi,
                R.drawable.mdk_veerabhadra,
                R.drawable.mdk_church,R.drawable.mdk_medakfort,
                R.drawable.mdk_pocharam,R.drawable.mdk_singur,R.drawable.mdk_manjeera,
                R.drawable.mdk_manjira_wildlife,R.drawable.mdk_pocharam_wildlife};
        String[] mName=getResources().getStringArray(R.array.mdk_array);
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
