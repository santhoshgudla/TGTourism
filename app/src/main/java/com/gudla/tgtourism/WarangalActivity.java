package com.gudla.tgtourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class WarangalActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warangal);
        mRecyclerView= (RecyclerView) findViewById(R.id.wglRecyclerView);
        int[] mImageId={R.drawable.wgl_bhadrakali,
                R.drawable.wgl_thousand_pillars,
                R.drawable.wgl_padmakshi,
                R.drawable.wgl_mallikarjuna_swamy,
                R.drawable.wgl_ramappa,
                R.drawable.wgl_jain_mandir,
                R.drawable.wgl_sammakka_saralamma,R.drawable.wgl_thousand_pillars,R.drawable.wgl_warangalfort,R.drawable.wgl_ramappa,
                R.drawable.wgl_laknavaram,R.drawable.wgl_pakhallake,R.drawable.etunagaram,R.drawable.wgl_pakhal_wildlife};
        String[] mName=getResources().getStringArray(R.array.wgl_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, mImageId, mName));
    }
}
