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


public class DivineRrFragment extends Fragment {
    ListView listView;
    CustomAdapter mainAdapter;
    private Context context;


    public DivineRrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_rr, container, false);
        listView= (ListView) view.findViewById(R.id.listRrView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.rr_sanghi,
                        R.drawable.rr_karmanghat,
                        R.drawable.rr_lingeswara,
                        R.drawable.rr_chilkur_balaji,
                        R.drawable.rr_maheshwaram,
                        R.drawable.rr_ananthagiri};
        String[] mainName=getResources().getStringArray(R.array.divine_rr_array);
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
