package com.gudla.tgtourism.wildlife;


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
public class WildRrFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public WildRrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_wild_rr, container, false);
        mListView=(ListView)view.findViewById(R.id.listWildRrView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.rr_shamirpet_deer};
        String[] mName=mContext.getResources().getStringArray(R.array.wild_rr_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageId, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
