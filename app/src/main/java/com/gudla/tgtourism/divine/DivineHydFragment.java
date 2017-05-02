package com.gudla.tgtourism.divine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.hyd.birla.BrilaActivity;
import com.gudla.tgtourism.hyd.jagannath.JagannathActivity;
import com.gudla.tgtourism.hyd.mahankali.MahankaliActivity;
import com.gudla.tgtourism.hyd.mecca.MeccaMasjidActivity;
import com.gudla.tgtourism.hyd.peddamma.PeddammaActivity;
import com.gudla.tgtourism.hyd.stmarry.StMarryActivity;
import com.gudla.tgtourism.hyd.yellamma.YellammaActivity;
import com.gudla.tgtourism.util.CustomAdapter;


public class DivineHydFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    CustomAdapter mainAdapter;
    private Context context;


    public DivineHydFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_hyd, container, false);
        listView= (ListView) view.findViewById(R.id.listHydView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.hyd_birla_mandir,
                R.drawable.hyd_jagannath,
                R.drawable.hyd_yellamma,
                R.drawable.hyd_peddamma,
                R.drawable.hyd_mary_church,
                R.drawable.hyd_mecca,
                R.drawable.hyd_mahankali};
        String[] mainName=getResources().getStringArray(R.array.divine_hyd_array);
        mainAdapter=new CustomAdapter(context, imageId, mainName);
            listView.setAdapter(mainAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=null;
        switch (position){
            case 0:
                intent=new Intent(context, BrilaActivity.class);
                break;
            case 1:
                intent=new Intent(context, JagannathActivity.class);
                break;
            case 2:
                intent=new Intent(context, YellammaActivity.class);
                break;
            case 3:
                intent=new Intent(context, PeddammaActivity.class);
                break;
            case 4:
                intent=new Intent(context, StMarryActivity.class);
                break;
            case 5:
                intent=new Intent(context, MeccaMasjidActivity.class);
                break;
            case 6:
                intent=new Intent(context, MahankaliActivity.class);
                break;
            default:
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}