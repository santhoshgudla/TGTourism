package com.gudla.tgtourism.heritage;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class HerNldFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public HerNldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_her_nld, container, false);
        mListView=(ListView)view.findViewById(R.id.listHerNldView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.nld_nandikonda,R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,
                        R.drawable.nld_devarakonda,R.drawable.nld_bhongir,R.drawable.nld_rachakondafort};
        String [] mName=mContext.getResources().getStringArray(R.array.her_nld_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageId, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
