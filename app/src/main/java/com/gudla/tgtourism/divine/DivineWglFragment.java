package com.gudla.tgtourism.divine;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomAdapter;


public class DivineWglFragment extends Fragment {
    ListView listView;
    CustomAdapter mainAdapter;
    private Context context;


    public DivineWglFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_wgl, container, false);
        listView= (ListView) view.findViewById(R.id.listWglView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.wgl_bhadrakali,
                        R.drawable.wgl_thousand_pillars,
                        R.drawable.wgl_padmakshi,
                        R.drawable.wgl_mallikarjuna_swamy,
                        R.drawable.wgl_ramappa,
                        R.drawable.wgl_jain_mandir,
                        R.drawable.wgl_sammakka_saralamma};
        String[] mainName=getResources().getStringArray(R.array.divine_wgl_array);
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
