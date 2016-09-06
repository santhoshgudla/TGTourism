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

public class DivineMkdFragment extends Fragment {
    ListView listView;
    CustomAdapter mainAdapter;
    private Context context;


    public DivineMkdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_mkd, container, false);
        listView= (ListView) view.findViewById(R.id.listMkdView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.mdk_kotilingeswara,
                        R.drawable.mdk_edupayala,
                        R.drawable.mdk_narasimha,
                        R.drawable.mdk_durga_bhavani,
                        R.drawable.mdk_sangameswara,
                        R.drawable.mdk_joginatha,
                        R.drawable.mdk_visweashwara,
                        R.drawable.mdk_vidya_saraswathi,
                        R.drawable.mdk_veerabhadra,
                        R.drawable.mdk_church};
        String[] mainName=getResources().getStringArray(R.array.divine_mdk_array);
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
