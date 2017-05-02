package com.gudla.tgtourism.heritage;


import android.content.Context;
import android.os.Bundle;
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
public class HerNzbFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public HerNzbFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_her_nzb, container, false);
        mListView=(ListView)view.findViewById(R.id.listHerNzbView);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.nzb_domakonda,R.drawable.nzb_fort,R.drawable.nzb_archaeological};
        String[] mName=mContext.getResources().getStringArray(R.array.her_nzb_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageId, mName));

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
