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


public class DivineWglFragment extends Fragment {
    GridView myGridview;
    GridCustomAdapter mainAdapter;
    private Context context;


    public DivineWglFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_wgl, container, false);
        myGridview= (GridView) view.findViewById(R.id.gridWglView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_wgl_bhadrakali,
                        R.drawable.divine_wgl_thousand_pillars,
                        R.drawable.divine_wgl_padmakshi,
                        R.drawable.divine_wgl_mallikarjuna_swamy,
                        R.drawable.divine_wgl_ramappa,
                        R.drawable.divine_wgl_jain_mandir,
                        R.drawable.divine_wgl_sammakka_saralamma};
        String[] mainName=getResources().getStringArray(R.array.divine_wgl_array);
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
