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


public class DivineMbnFragment extends Fragment {
    GridView myGridView;
    GridCustomAdapter mainAdapter;
    private Context context;


    public DivineMbnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_mbn, container, false);
        myGridView= (GridView) view.findViewById(R.id.gridMbnView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_mbn_jogulamba,
                R.drawable.divine_mbn_maheshwara_swamy,
                R.drawable.divine_mbn_maisigandi_maisamma,
                R.drawable.divine_mbn_beechupally_hanuman,
                R.drawable.divine_mbn_siva_nallamalla,
                R.drawable.divine_mbn_manyamkonda_venkateshwara};
        String[] mainName=getResources().getStringArray(R.array.divine_mbn_array);
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
