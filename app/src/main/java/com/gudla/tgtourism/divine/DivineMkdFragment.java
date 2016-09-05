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

public class DivineMkdFragment extends Fragment {
    GridView myGridview;
    GridCustomAdapter mainAdapter;
    private Context context;


    public DivineMkdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_divine_mkd, container, false);
        myGridview= (GridView) view.findViewById(R.id.gridMkdView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_mdk_kotilingeswara,
                        R.drawable.divine_mdk_edupayala,
                        R.drawable.divine_mdk_narasimha,
                        R.drawable.divine_mdk_durga_bhavani,
                        R.drawable.divine_mdk_sangameswara,
                        R.drawable.divine_mdk_joginatha,
                        R.drawable.divine_mdk_visweashwara,
                        R.drawable.divine_mdk_vidya_saraswathi,
                        R.drawable.divine_mdk_veerabhadra,
                        R.drawable.divine_mdk_church};
        String[] mainName=getResources().getStringArray(R.array.divine_mdk_array);
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
