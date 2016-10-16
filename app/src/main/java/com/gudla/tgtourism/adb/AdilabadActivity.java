package com.gudla.tgtourism.adb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

public class AdilabadActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adilabad);
        mRecyclerView= (RecyclerView) findViewById(R.id.adbRecyclerView);
        int[] mImageId={R.drawable.adb_basara,
                R.drawable.adb_jainath,
                R.drawable.adb_satyanaraya,
                R.drawable.adb_papahareshwar,
                R.drawable.adb_kalwa_narsimha,R.drawable.adb_nirmalfort,
                R.drawable.adb_kanakai,R.drawable.adb_kuntala,R.drawable.adb_pochera,R.drawable.adb_gayatri,R.drawable.adb_kadam,
                R.drawable.adb_kawal_wildlife,R.drawable.adb_pranahita_wildlife,R.drawable.adb_jannaram};
        String[] mName=getResources().getStringArray(R.array.adb_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, mImageId, mName));
    }
}
