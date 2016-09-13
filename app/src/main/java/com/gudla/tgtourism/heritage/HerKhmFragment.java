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
public class HerKhmFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public HerKhmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_her_khm, container, false);
        mListView=(ListView)view.findViewById(R.id.listHerKhmView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.khm_nelakondapalli,R.drawable.khm_khammamfort,R.drawable.khm_parnasala};
        String[] mName=mContext.getResources().getStringArray(R.array.her_khm_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageId,mName));

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
