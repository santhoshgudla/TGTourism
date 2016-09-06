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

public class DivineNldFragment extends Fragment {
    ListView listView;
    CustomAdapter mainAdapter;
    private Context context;


    public DivineNldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_nld, container, false);
        listView= (ListView) view.findViewById(R.id.listNldView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.nld_yadagirigutta,
                        R.drawable.nld_surendrapuri,
                        R.drawable.nld_someswara};
        String[] mainName=getResources().getStringArray(R.array.divine_nld_array);
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
