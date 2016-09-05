package com.gudla.tgtourism.divine;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomAdapter;
import com.gudla.tgtourism.util.GridCustomAdapter;


public class DivineKhmFragment extends Fragment {
    GridView myGridView;
    GridCustomAdapter mainAdapter;
    private Context context;

    public DivineKhmFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_khm, container, false);
        myGridView= (GridView) view.findViewById(R.id.gridKhmView);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_khm_bhadrachalam,R.drawable.divine_khm_jamalapuram,R.drawable.divine_khm_kusumanchipng};
        String[] mainName=getResources().getStringArray(R.array.divine_khm_array);
        mainAdapter=new GridCustomAdapter(context, imageId, mainName);
        myGridView.setAdapter(mainAdapter);
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
