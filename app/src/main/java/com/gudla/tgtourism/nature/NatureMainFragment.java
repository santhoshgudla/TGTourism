package com.gudla.tgtourism.nature;


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
public class NatureMainFragment extends Fragment {
    RecyclerView mRecyclerView;
    Context mContext;


    public NatureMainFragment() {
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
        View view=inflater.inflate(R.layout.fragment_nature_main, container, false);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.recyclerNature);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.hyd_durgam_cheruvu,R.drawable.hyd_hussain_sagar,R.drawable.hyd_lumbini,
                        R.drawable.khm_palair_lake,R.drawable.khm_kinnerasani_dam,R.drawable.khm_bogatha,
                        R.drawable.mbn_mallela,R.drawable.mbn_tiger_forest,R.drawable.mbn_jurala,R.drawable.mbn_koilsagar,
                        R.drawable.nld_nagarjunasagar,
                        R.drawable.wgl_laknavaram,R.drawable.wgl_pakhallake,
                        R.drawable.adb_kanakai,R.drawable.adb_kuntala,R.drawable.adb_pochera,R.drawable.adb_gayatri,R.drawable.adb_kadam,
                        R.drawable.nzb_alisagar,R.drawable.nzb_nizamsagar,R.drawable.nzb_mallaram_forest,R.drawable.nzb_pochampad,
                        R.drawable.knr_manair,
                        R.drawable.mdk_pocharam,R.drawable.mdk_singur,R.drawable.mdk_manjeera,
                        R.drawable.rr_ananthagiri_hills,R.drawable.rr_ramoji,R.drawable.rr_osman_sagar};
        String[] mName=mContext.getResources().getStringArray(R.array.nature_array);
        mRecyclerView.setAdapter(new CustomRecyclerAdapter(mContext, mImageId, mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
