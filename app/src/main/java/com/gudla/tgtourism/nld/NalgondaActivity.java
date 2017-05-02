package com.gudla.tgtourism.nld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.nld.bhongir.Bhongir;
import com.gudla.tgtourism.nld.chaya.ChayaSomeswara;
import com.gudla.tgtourism.nld.devara.Devarakonda;
import com.gudla.tgtourism.nld.kolanupaka.Kolanupaka;
import com.gudla.tgtourism.nld.nandi.Nandikonda;
import com.gudla.tgtourism.nld.racha.Rachakonda;
import com.gudla.tgtourism.nld.sagar.Nagarjuna;
import com.gudla.tgtourism.nld.surendra.Surendrapuri;
import com.gudla.tgtourism.nld.yadagi.Yadagirigutta;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;
import com.gudla.tgtourism.util.RecyclerItemClickListener;

public class NalgondaActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalgonda);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.nldRecyclerView);
        int[] mImageId={R.drawable.nld_yadagirigutta,
                R.drawable.nld_surendrapuri,
                R.drawable.nld_someswara,R.drawable.nld_nandikonda,R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,
                R.drawable.nld_devarakonda,R.drawable.nld_bhongir,R.drawable.nld_rachakondafort};
        String[] mName=getResources().getStringArray(R.array.nld_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(this, mImageId, mName));
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener(){

            @Override
            public void onItemClick(View view, int position) {
                Intent intent = null;
                switch (position){
                    case 0:
                        intent=new Intent(NalgondaActivity.this, Yadagirigutta.class);
                        break;
                    case 1:
                        intent = new Intent(NalgondaActivity.this, Surendrapuri.class);
                        break;
                    case 2:
                        intent = new Intent(NalgondaActivity.this, ChayaSomeswara.class);
                        break;
                    case 3:
                        intent = new Intent(NalgondaActivity.this, Nandikonda.class);
                        break;
                    case 4:
                        intent = new Intent(NalgondaActivity.this, Nagarjuna.class);
                        break;
                    case 5:
                        intent = new Intent(NalgondaActivity.this, Kolanupaka.class);
                        break;
                    case 6:
                        intent = new Intent(NalgondaActivity.this, Devarakonda.class);
                        break;
                    case 7:
                        intent = new Intent(NalgondaActivity.this, Bhongir.class);
                        break;
                    case 8:
                        intent = new Intent(NalgondaActivity.this, Rachakonda.class);
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
