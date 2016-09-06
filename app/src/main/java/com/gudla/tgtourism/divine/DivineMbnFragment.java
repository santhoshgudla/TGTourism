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
    ListView listView;
    CustomAdapter mainAdapter;
    private Context context;


    public DivineMbnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_mbn, container, false);
        listView= (ListView) view.findViewById(R.id.listMbnView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.mbn_jogulamba,
                R.drawable.mbn_maheshwara_swamy,
                R.drawable.mbn_maisigandi_maisamma,
                R.drawable.mbn_beechupally_hanuman,
                R.drawable.mbn_siva_nallamalla,
                R.drawable.mbn_manyamkonda_venkateshwara};
        String[] mainName=getResources().getStringArray(R.array.divine_mbn_array);
        mainAdapter=new CustomAdapter(context, imageId, mainName);
        listView.setAdapter(mainAdapter);
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
