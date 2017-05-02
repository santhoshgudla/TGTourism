package com.gudla.tgtourism.mbn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.mbn.alam.Alampur;
import com.gudla.tgtourism.mbn.beechu.Beechupally;
import com.gudla.tgtourism.mbn.gadwal.GadwalFort;
import com.gudla.tgtourism.mbn.jogu.JogulambaActivity;
import com.gudla.tgtourism.mbn.jurala.Jurala;
import com.gudla.tgtourism.mbn.koilsagar.Koilsagar;
import com.gudla.tgtourism.mbn.lord.LordShiva;
import com.gudla.tgtourism.mbn.maisi.Maisigandi;
import com.gudla.tgtourism.mbn.mallela.Mallela;
import com.gudla.tgtourism.mbn.manyam.Manyamkonda;
import com.gudla.tgtourism.mbn.pillala.Pillalamarri;
import com.gudla.tgtourism.mbn.srisailam.Srisailam;
import com.gudla.tgtourism.mbn.tiger.TigerForest;
import com.gudla.tgtourism.mbn.uma.UmaMaheshwara;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;
import com.gudla.tgtourism.util.RecyclerItemClickListener;

public class MahabubnagarActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahabubnagar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.mbnRecyclerView);
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
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(this, mImageId, mName));
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener(){

            @Override
            public void onItemClick(View view, int position) {
                Intent intent = null;
                switch (position){
                    case 0:
                        intent=new Intent(MahabubnagarActivity.this, JogulambaActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MahabubnagarActivity.this, UmaMaheshwara.class);
                        break;
                    case 2:
                        intent = new Intent(MahabubnagarActivity.this, Maisigandi.class);
                        break;
                    case 3:
                        intent = new Intent(MahabubnagarActivity.this, Beechupally.class);
                        break;
                    case 4:
                        intent = new Intent(MahabubnagarActivity.this, LordShiva.class);
                        break;
                    case 5:
                        intent = new Intent(MahabubnagarActivity.this, Manyamkonda.class);
                        break;
                    case 6:
                        intent = new Intent(MahabubnagarActivity.this, Pillalamarri.class);
                        break;
                    case 7:
                        intent = new Intent(MahabubnagarActivity.this, Alampur.class);
                        break;
                    case 8:
                        intent = new Intent(MahabubnagarActivity.this, GadwalFort.class);
                        break;
                    case 9:
                        intent = new Intent(MahabubnagarActivity.this, Mallela.class);
                        break;
                    case 10:
                        intent = new Intent(MahabubnagarActivity.this, TigerForest.class);
                        break;
                    case 11:
                        intent = new Intent(MahabubnagarActivity.this, Jurala.class);
                        break;
                    case 12:
                        intent = new Intent(MahabubnagarActivity.this, Koilsagar.class);
                        break;
                    case 13:
                        intent = new Intent(MahabubnagarActivity.this, Srisailam.class);
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
