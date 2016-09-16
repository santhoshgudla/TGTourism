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
public class NatAdbFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public NatAdbFragment() {
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
        View view=inflater.inflate(R.layout.fragment_nat_adb, container, false);
        mListView=(ListView)view.findViewById(R.id.listNatAdbView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.adb_kanakai,R.drawable.adb_kuntala,R.drawable.adb_pochera,R.drawable.adb_gayatri,R.drawable.adb_kadam};
        String [] mName=mContext.getResources().getStringArray(R.array.nature_adb_array);
        mListView.setAdapter(new CustomAdapter(mContext, mImageId, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
