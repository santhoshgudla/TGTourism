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
public class HerMbnFragment extends Fragment {
    ListView mListView;
    Context mContext;

    public HerMbnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_her_mbn, container, false);
        mListView=(ListView)view.findViewById(R.id.listHerMbnView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.mbn_pillalamarri,R.drawable.mbn_alampur,R.drawable.mbn_gadwalfort};
        String[] mName=mContext.getResources().getStringArray(R.array.her_mbn_array);
        mListView.setAdapter(new CustomAdapter(mContext,mImageId,mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
