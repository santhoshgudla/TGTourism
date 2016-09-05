package com.gudla.tgtourism.divine;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.GridCustomAdapter;


public class DivineHydFragment extends Fragment {
//    ListView listView;
    GridView myGridview;
    GridCustomAdapter mainAdapter;
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
        myGridview= (GridView) view.findViewById(R.id.gridHydView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_hyd_birla_mandir,
                R.drawable.divine_hyd_jagannath,
                R.drawable.divine_hyd_yellamma,
                R.drawable.divine_hyd_peddamma,
                R.drawable.divine_hyd_mary_church,
                R.drawable.divine_hyd_mecca,
                R.drawable.divine_hyd_mahankali};
        String[] mainName=getResources().getStringArray(R.array.divine_hyd_array);
        mainAdapter=new GridCustomAdapter(context, imageId, mainName);
            myGridview.setAdapter(mainAdapter);
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

}