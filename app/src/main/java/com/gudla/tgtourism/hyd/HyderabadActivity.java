package com.gudla.tgtourism.hyd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class HyderabadActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.hydRecyclerView);
        int[] mImageId={R.drawable.hyd_birla_mandir,
                R.drawable.hyd_jagannath,
                R.drawable.hyd_yellamma,
                R.drawable.hyd_peddamma,
                R.drawable.hyd_mary_church,
                R.drawable.hyd_mecca,
                R.drawable.hyd_mahankali,
                R.drawable.hyd_charminar,
                R.drawable.hyd_salarjung,
                R.drawable.hyd_qutubshahitombs,
                R.drawable.hyd_paigahtombs,
                R.drawable.hyd_mecca,
                R.drawable.hyd_golcondafort,
                R.drawable.hyd_falaknumapalace,
                R.drawable.hyd_chaumallapalace,
                R.drawable.hyd_durgam_cheruvu,
                R.drawable.hyd_hussain_sagar,
                R.drawable.hyd_lumbini,
                R.drawable.hyd_kbr_park,
                R.drawable.hyd_mrugavani,
                R.drawable.hyd_nehru_zoological,
                R.drawable.hyd_mahavi};
        String[] mName=getResources().getStringArray(R.array.hyd_array);
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
