package com.gudla.tgtourism.divine;

import android.content.Context;
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


public class DivineHydFragment extends Fragment {
    ListView listView;
    CustomAdapter mainAdapter;
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
        listView= (ListView) view.findViewById(R.id.listHydView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.hyd_birla_mandir,
                R.drawable.hyd_jagannath,
                R.drawable.hyd_yellamma,
                R.drawable.hyd_peddamma,
                R.drawable.hyd_mary_church,
                R.drawable.hyd_mecca,
                R.drawable.hyd_mahankali};
        String[] mainName=getResources().getStringArray(R.array.divine_hyd_array);
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