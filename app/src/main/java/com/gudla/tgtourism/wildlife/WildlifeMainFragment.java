package com.gudla.tgtourism.wildlife;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class WildlifeMainFragment extends Fragment {
    RecyclerView mRecyclerView;
    Context mContext;


    public WildlifeMainFragment() {
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
        View view=inflater.inflate(R.layout.fragment_wildlife_main, container, false);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.recyclerWildLife);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.hyd_kbr_park,R.drawable.hyd_mrugavani,R.drawable.hyd_nehru_zoological,R.drawable.hyd_mahavi,
        R.drawable.khm_kinnerasani_wildlife,
        R.drawable.mbn_srisailam_tiger,
        R.drawable.etunagaram,R.drawable.wgl_pakhal_wildlife,
        R.drawable.adb_kawal_wildlife,R.drawable.adb_pranahita_wildlife,R.drawable.adb_jannaram,
        R.drawable.nzb_alisagar_deer,
        R.drawable.knr_ujwala_park,R.drawable.knr_shivaram_wildlife,
        R.drawable.mdk_manjira_wildlife,R.drawable.mdk_pocharam_wildlife,
        R.drawable.rr_shamirpet_deer};
        String[] mName=mContext.getResources().getStringArray(R.array.wildlife_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(mContext, mImageId, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
