package com.gudla.tgtourism.nzb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class NizamabadActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nizamabad);
        mRecyclerView= (RecyclerView) findViewById(R.id.nzbRecyclerView);
        int[] mImageId={R.drawable.nzb_dichpalli_ramalayam,
                R.drawable.nzb_kanteshwar,
                R.drawable.nzb_quilla,
                R.drawable.nzb_sarangapur_hanuman,R.drawable.nzb_domakonda,R.drawable.nzb_fort,R.drawable.nzb_archaeological,
                R.drawable.nzb_alisagar,R.drawable.nzb_nizamsagar,R.drawable.nzb_mallaram_forest,R.drawable.nzb_pochampad,
                R.drawable.nzb_alisagar_deer};
        String[] mName=getResources().getStringArray(R.array.nzb_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, mImageId, mName));
    }
}
