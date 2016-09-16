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
public class NatMbnFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public NatMbnFragment() {
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
        View view=inflater.inflate(R.layout.fragment_nat_mbn, container, false);
        mListView=(ListView)view.findViewById(R.id.listNatMbnView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageid={R.drawable.mbn_mallela,R.drawable.mbn_tiger_forest,R.drawable.mbn_jurala,R.drawable.mbn_koilsagar};
        String[] mName=mContext.getResources().getStringArray(R.array.nature_mbn_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageid, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
