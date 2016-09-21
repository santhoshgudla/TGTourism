package com.gudla.tgtourism.divine;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.GridCustomAdapter;
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;
import com.gudla.tgtourism.util.SourceArray;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private Context context;
    RecyclerView mRecyclerView;


    public MainFragment() {
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
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.mainRecyclerDivine);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.hyd_birla_mandir,
                R.drawable.hyd_jagannath,
                R.drawable.hyd_yellamma,
                R.drawable.hyd_peddamma,
                R.drawable.hyd_mary_church,
                R.drawable.hyd_mecca,
                R.drawable.hyd_mahankali,
                R.drawable.khm_bhadrachalam,
                R.drawable.khm_jamalapuram,
                R.drawable.khm_kusumanchipng,
                R.drawable.mbn_jogulamba,
                R.drawable.mbn_maheshwara_swamy,
                R.drawable.mbn_maisigandi_maisamma,
                R.drawable.mbn_beechupally_hanuman,
                R.drawable.mbn_siva_nallamalla,
                R.drawable.mbn_manyamkonda_venkateshwara,
                R.drawable.nld_yadagirigutta,
                R.drawable.nld_surendrapuri,
                R.drawable.nld_someswara,
                R.drawable.wgl_bhadrakali,
                R.drawable.wgl_thousand_pillars,
                R.drawable.wgl_padmakshi,
                R.drawable.wgl_mallikarjuna_swamy,
                R.drawable.wgl_ramappa,
                R.drawable.wgl_jain_mandir,
                R.drawable.wgl_sammakka_saralamma,
                R.drawable.adb_basara,
                R.drawable.adb_jainath,
                R.drawable.adb_satyanaraya,
                R.drawable.adb_papahareshwar,
                R.drawable.adb_kalwa_narsimha,
                R.drawable.nzb_dichpalli_ramalayam,
                R.drawable.nzb_kanteshwar,
                R.drawable.nzb_quilla,
                R.drawable.nzb_sarangapur_hanuman,
                R.drawable.knr_dharmapuri,
                R.drawable.knr_kaleshwara,
                R.drawable.knr_kondagattu,
                R.drawable.knr_nallagonda,
                R.drawable.knr_rajeshwar,
                R.drawable.knr_nampally,
                R.drawable.knr_nagunur,
                R.drawable.mdk_kotilingeswara,
                R.drawable.mdk_edupayala,
                R.drawable.mdk_narasimha,
                R.drawable.mdk_durga_bhavani,
                R.drawable.mdk_sangameswara,
                R.drawable.mdk_joginatha,
                R.drawable.mdk_visweashwara,
                R.drawable.mdk_vidya_saraswathi,
                R.drawable.mdk_veerabhadra,
                R.drawable.mdk_church,
                R.drawable.rr_sanghi,
                R.drawable.rr_karmanghat,
                R.drawable.rr_lingeswara,
                R.drawable.rr_chilkur_balaji,
                R.drawable.rr_maheshwaram,
                R.drawable.rr_ananthagiri};
        String[] mainName=getResources().getStringArray(R.array.divine_main_array);
        mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(context, imageId, mainName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
