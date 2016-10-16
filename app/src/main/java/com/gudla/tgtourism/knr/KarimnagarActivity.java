package com.gudla.tgtourism.knr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class KarimnagarActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karimnagar);
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
}
