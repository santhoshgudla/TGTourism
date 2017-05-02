package com.gudla.tgtourism.hyd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gudla.tgtourism.ContactUsActivity;
import com.gudla.tgtourism.R;
import com.gudla.tgtourism.hyd.birla.BrilaActivity;
import com.gudla.tgtourism.hyd.charminar.CharminarActivity;
import com.gudla.tgtourism.hyd.chowmahalla.Chowmahalla;
import com.gudla.tgtourism.hyd.durgam.Durgam;
import com.gudla.tgtourism.hyd.falaknuma.Falaknuma;
import com.gudla.tgtourism.hyd.golconda.Golconda;
import com.gudla.tgtourism.hyd.hussain.HussainSager;
import com.gudla.tgtourism.hyd.jagannath.JagannathActivity;
import com.gudla.tgtourism.hyd.kbr.KbrNational;
import com.gudla.tgtourism.hyd.lumbini.Lumbini;
import com.gudla.tgtourism.hyd.mahankali.MahankaliActivity;
import com.gudla.tgtourism.hyd.mahavir.Mahavir;
import com.gudla.tgtourism.hyd.mecca.MeccaMasjidActivity;
import com.gudla.tgtourism.hyd.mrugavani.Mrugavani;
import com.gudla.tgtourism.hyd.nehru.Nehru;
import com.gudla.tgtourism.hyd.paigah.PaigahTombs;
import com.gudla.tgtourism.hyd.peddamma.PeddammaActivity;
import com.gudla.tgtourism.hyd.qutub.QutubShahi;
import com.gudla.tgtourism.hyd.salarjung.SalarjungActivity;
import com.gudla.tgtourism.hyd.stmarry.StMarryActivity;
import com.gudla.tgtourism.hyd.yellamma.YellammaActivity;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;
import com.gudla.tgtourism.util.RecyclerItemClickListener;

public class HyderabadActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView= (RecyclerView) findViewById(R.id.hydRecyclerView);
        int[] mImageId={R.drawable.hyd_birla_mandir,
                R.drawable.hyd_jagannath,
                R.drawable.hyd_yellamma,
                R.drawable.hyd_peddamma,
                R.drawable.hyd_mary_church,
                R.drawable.hyd_mecca,
                R.drawable.hyd_mahankali,
                R.drawable.hyd_charminar,
                R.drawable.hyd_salarjung,
                R.drawable.hyd_qutubshahitombs,
                R.drawable.hyd_paigahtombs,
                R.drawable.hyd_golcondafort,
                R.drawable.hyd_falaknumapalace,
                R.drawable.hyd_chaumallapalace,
                R.drawable.hyd_durgam_cheruvu,
                R.drawable.hyd_hussain_sagar,
                R.drawable.hyd_lumbini,
                R.drawable.hyd_kbr_park,
                R.drawable.hyd_mrugavani,
                R.drawable.hyd_nehru_zoological,
                R.drawable.hyd_mahavi};
        String[] mName=getResources().getStringArray(R.array.hyd_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(this, mImageId, mName));
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent=null;
                        switch (position){
                            case 0:
                                intent=new Intent(HyderabadActivity.this, BrilaActivity.class);
                                break;
                            case 1:
                                intent=new Intent(HyderabadActivity.this, JagannathActivity.class);
                                break;
                            case 2:
                                intent=new Intent(HyderabadActivity.this, YellammaActivity.class);
                                break;
                            case 3:
                                intent=new Intent(HyderabadActivity.this, PeddammaActivity.class);
                                break;
                            case 4:
                                intent=new Intent(HyderabadActivity.this, StMarryActivity.class);
                                break;
                            case 5:
                                intent=new Intent(HyderabadActivity.this, MeccaMasjidActivity.class);
                                break;
                            case 6:
                                intent=new Intent(HyderabadActivity.this, MahankaliActivity.class);
                                break;
                            case 7:
                                intent=new Intent(HyderabadActivity.this, CharminarActivity.class);
                                break;
                            case 8:
                                intent=new Intent(HyderabadActivity.this, SalarjungActivity.class);
                                break;
                            case 9:
                                intent=new Intent(HyderabadActivity.this, QutubShahi.class);
                                break;
                            case 10:
                                intent=new Intent(HyderabadActivity.this, PaigahTombs.class);
                                break;
                            case 11:
                                intent=new Intent(HyderabadActivity.this, Golconda.class);
                                break;
                            case 12:
                                intent=new Intent(HyderabadActivity.this, Falaknuma.class);
                                break;
                            case 13:
                                intent=new Intent(HyderabadActivity.this, Chowmahalla.class);
                                break;
                            case 14:
                                intent=new Intent(HyderabadActivity.this, Durgam.class);
                                break;
                            case 15:
                                intent=new Intent(HyderabadActivity.this, HussainSager.class);
                                break;
                            case 16:
                                intent=new Intent(HyderabadActivity.this, Lumbini.class);
                                break;
                            case 17:
                                intent=new Intent(HyderabadActivity.this, KbrNational.class);
                                break;
                            case 18:
                                intent=new Intent(HyderabadActivity.this, Mrugavani.class);
                                break;
                            case 19:
                                intent=new Intent(HyderabadActivity.this, Nehru.class);
                                break;
                            case 20:
                                intent=new Intent(HyderabadActivity.this, Mahavir.class);
                                break;
                            default:
                                break;
                        }
                        if(intent != null){
                            startActivity(intent);
                        }
                    }
                })
        );

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
