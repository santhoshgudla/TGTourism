package com.gudla.tgtourism.mbn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class MahabubnagarActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahabubnagar);
        mRecyclerView= (RecyclerView) findViewById(R.id.khmRecyclerView);
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
}
