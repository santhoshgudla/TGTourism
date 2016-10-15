package com.gudla.tgtourism.khm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class KhammamActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khammam);
        mRecyclerView= (RecyclerView) findViewById(R.id.khmRecyclerView);
        int[] mImageId={R.drawable.khm_bhadrachalam,R.drawable.khm_jamalapuram,R.drawable.khm_kusumanchipng,
                R.drawable.khm_nelakondapalli,R.drawable.khm_khammamfort,R.drawable.khm_parnasala,
                R.drawable.khm_palair_lake,R.drawable.khm_kinnerasani_dam,R.drawable.khm_bogatha,
                R.drawable.khm_kinnerasani_wildlife};
        String[] mName=getResources().getStringArray(R.array.khm_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, mImageId, mName));
    }
}
