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

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.GridCustomAdapter;


public class DivineAdbFragment extends Fragment {
    GridView myGridview;
    GridCustomAdapter mainAdapter;
    private Context context;


    public DivineAdbFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_adb, container, false);
        myGridview= (GridView) view.findViewById(R.id.gridAdbView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_adb_basara,
                        R.drawable.divine_adb_jainath,
                        R.drawable.divine_adb_satyanaraya,
                        R.drawable.divine_papahareshwar,
                        R.drawable.divine_adb_kalwa_narsimha};
        String[] mainName=getResources().getStringArray(R.array.divine_adb_array);
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
