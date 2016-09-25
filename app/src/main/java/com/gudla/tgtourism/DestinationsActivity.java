package com.gudla.tgtourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gudla.tgtourism.util.CustomAdapter;

import java.util.List;

public class DestinationsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    CustomAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);
        listView= (ListView) findViewById(R.id.listView2);
        int[] imageId={R.drawable.divine_destination,R.drawable.heritage_spots,R.drawable.nature_discovery,R.drawable.wild_life,R.drawable.adventure_journeys};
        String[] mainName=getResources().getStringArray(R.array.mainarray);
        mainAdapter=new CustomAdapter(this, imageId,mainName);
        listView.setAdapter(mainAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView.setOnItemClickListener(this);
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


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=null;
        switch (i){
            case 0:
                intent=new Intent(this,DivineDestinationActivity.class);
                break;
            case 1:
                intent=new Intent(this,HeritageActivity.class);
                break;
            case 2:
                intent=new Intent(this,NatureActivity.class);
                break;
            case 3:
                intent=new Intent(this,WildLifeActivity.class);
                break;
            case 4:
                intent=new Intent(this,AdventureActivity.class);
                break;
            default:
                break;
        }
        if(intent!= null)
        startActivity(intent);
    }
}
