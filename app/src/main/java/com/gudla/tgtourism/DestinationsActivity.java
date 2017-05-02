package com.gudla.tgtourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;
import com.gudla.tgtourism.util.RecyclerItemClickListener;

public class DestinationsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_recycler);
        mRecyclerView = (RecyclerView) findViewById(R.id.destination_recycler);
        int[] imageId={R.drawable.divine_destination,R.drawable.heritage_spots,R.drawable.nature_discovery,R.drawable.wild_life,R.drawable.adventure_journeys};
        String[] mainName=getResources().getStringArray(R.array.mainarray);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(this, imageId, mainName));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener(){

            @Override
            public void onItemClick(View view, int position) {
                Intent intent = null;
                switch (position){
                    case 0:
                        intent=new Intent(DestinationsActivity.this, DivineDestinationActivity.class);
                        break;
                    case 1:
                        intent = new Intent(DestinationsActivity.this, HeritageActivity.class);
                        break;
                    case 2:
                        intent = new Intent(DestinationsActivity.this, NatureActivity.class);
                        break;
                    case 3:
                        intent = new Intent(DestinationsActivity.this, WildLifeActivity.class);
                        break;
                    case 4:
                        intent = new Intent(DestinationsActivity.this, AdventureActivity.class);
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
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        if(item.getItemId() == R.id.contactus){
            Intent intent=new Intent(this,ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
