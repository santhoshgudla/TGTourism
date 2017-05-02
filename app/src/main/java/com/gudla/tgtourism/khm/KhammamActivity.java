package com.gudla.tgtourism.khm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.khm.bagatha.Bagatha;
import com.gudla.tgtourism.khm.bhadra.Bhadrachalam;
import com.gudla.tgtourism.khm.dam.KinnerasaniDam;
import com.gudla.tgtourism.khm.fort.KhammamFort;
import com.gudla.tgtourism.khm.jamala.Jamalapuram;
import com.gudla.tgtourism.khm.kinnerasani.KinnerasaniWildLife;
import com.gudla.tgtourism.khm.kusumanchi.Kusumanchi;
import com.gudla.tgtourism.khm.nela.Nelakondapalli;
import com.gudla.tgtourism.khm.palair.Palair;
import com.gudla.tgtourism.khm.parnasala.Parnasala;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;
import com.gudla.tgtourism.util.RecyclerItemClickListener;

public class KhammamActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khammam);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.khmRecyclerView);
        int[] mImageId={R.drawable.khm_bhadrachalam,R.drawable.khm_jamalapuram,R.drawable.khm_kusumanchipng,
                R.drawable.khm_nelakondapalli,R.drawable.khm_khammamfort,R.drawable.khm_parnasala,
                R.drawable.khm_palair_lake,R.drawable.khm_kinnerasani_dam,R.drawable.khm_bogatha,
                R.drawable.khm_kinnerasani_wildlife};
        String[] mName=getResources().getStringArray(R.array.khm_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(this, mImageId, mName));
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener(){

            @Override
            public void onItemClick(View view, int position) {
                Intent intent = null;
                switch (position){
                    case 0:
                        intent=new Intent(KhammamActivity.this, Bhadrachalam.class);
                        break;
                    case 1:
                        intent = new Intent(KhammamActivity.this, Jamalapuram.class);
                        break;
                    case 2:
                        intent = new Intent(KhammamActivity.this, Kusumanchi.class);
                        break;
                    case 3:
                        intent = new Intent(KhammamActivity.this, Nelakondapalli.class);
                        break;
                    case 4:
                        intent = new Intent(KhammamActivity.this, KhammamFort.class);
                        break;
                    case 5:
                        intent = new Intent(KhammamActivity.this, Parnasala.class);
                        break;
                    case 6:
                        intent = new Intent(KhammamActivity.this, Palair.class);
                        break;
                    case 7:
                        intent = new Intent(KhammamActivity.this, KinnerasaniDam.class);
                        break;
                    case 8:
                        intent = new Intent(KhammamActivity.this, Bagatha.class);
                        break;
                    case 9:
                        intent = new Intent(KhammamActivity.this, KinnerasaniWildLife.class);
                        break;
                    default:
                        break;
                }
                if(intent != null){
                    startActivity(intent);
                }
            }
        }));
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
