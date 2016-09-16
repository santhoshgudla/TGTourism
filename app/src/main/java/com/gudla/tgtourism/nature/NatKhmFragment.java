package com.gudla.tgtourism.nature;


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
public class NatKhmFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public NatKhmFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_nat_mkh, container, false);
        mListView=(ListView)view.findViewById(R.id.listNatKhmView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.khm_palair_lake,R.drawable.khm_kinnerasani_dam,R.drawable.khm_bogatha};
        String[] mName=mContext.getResources().getStringArray(R.array.nature_khm_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageId, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
