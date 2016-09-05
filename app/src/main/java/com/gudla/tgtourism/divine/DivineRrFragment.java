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


public class DivineRrFragment extends Fragment {
    GridView myGridview;
    GridCustomAdapter mainAdapter;
    private Context context;


    public DivineRrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_rr, container, false);
        myGridview= (GridView) view.findViewById(R.id.gridRrView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_rr_sanghi,
                        R.drawable.divine_rr_karmanghat,
                        R.drawable.divine_rr_lingeswara,
                        R.drawable.divine_rr_chilkur_balaji,
                        R.drawable.divine_rr_maheshwaram,
                        R.drawable.divine_rr_ananthagiri};
        String[] mainName=getResources().getStringArray(R.array.divine_rr_array);
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
