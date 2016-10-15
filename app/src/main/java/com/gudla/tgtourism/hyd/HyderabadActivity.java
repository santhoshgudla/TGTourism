package com.gudla.tgtourism.hyd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class HyderabadActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad);
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
}
