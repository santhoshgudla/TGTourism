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

public class AdventureActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
        listView= (ListView) findViewById(R.id.listAdventure);
        int[] mImageId={R.drawable.bhongir_adventure,R.drawable.vikarabad_adventure};
        String[] mName=getResources().getStringArray(R.array.adventure_array);
        listView.setAdapter(new CustomAdapter(this, mImageId, mName));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView.setOnItemClickListener(this);
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
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
