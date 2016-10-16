package com.gudla.tgtourism.nld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class NalgondaActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalgonda);
        mRecyclerView= (RecyclerView) findViewById(R.id.nldRecyclerView);
        int[] mImageId={R.drawable.nld_yadagirigutta,
                R.drawable.nld_surendrapuri,
                R.drawable.nld_someswara,R.drawable.nld_nandikonda,R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,
                R.drawable.nld_devarakonda,R.drawable.nld_bhongir,R.drawable.nld_rachakondafort,R.drawable.nld_nagarjunasagar,};
        String[] mName=getResources().getStringArray(R.array.nld_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, mImageId, mName));
    }
}
