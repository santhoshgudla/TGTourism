package com.gudla.tgtourism.divine;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.GridCustomAdapter;

public class MainFragment extends Fragment {
    GridView myGridview;
    GridCustomAdapter mainAdapter;
    private Context context;


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
        myGridview= (GridView) view.findViewById(R.id.gridMainView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId = {R.drawable.divine_hyd_birla_mandir,
                R.drawable.divine_hyd_jagannath,
                R.drawable.divine_hyd_yellamma,
                R.drawable.divine_hyd_peddamma,
                R.drawable.divine_hyd_mary_church,
                R.drawable.divine_hyd_mecca,
                R.drawable.divine_hyd_mahankali,
                R.drawable.divine_khm_bhadrachalam,
                R.drawable.divine_khm_jamalapuram,
                R.drawable.divine_khm_kusumanchipng,
                R.drawable.divine_mbn_jogulamba,
                R.drawable.divine_mbn_maheshwara_swamy,
                R.drawable.divine_mbn_maisigandi_maisamma,
                R.drawable.divine_mbn_beechupally_hanuman,
                R.drawable.divine_mbn_siva_nallamalla,
                R.drawable.divine_mbn_manyamkonda_venkateshwara,
                R.drawable.divine_nld_yadagirigutta,
                R.drawable.divine_nld_surendrapuri,
                R.drawable.divine_nld_someswara,
                R.drawable.divine_wgl_bhadrakali,
                R.drawable.divine_wgl_thousand_pillars,
                R.drawable.divine_wgl_padmakshi,
                R.drawable.divine_wgl_mallikarjuna_swamy,
                R.drawable.divine_wgl_ramappa,
                R.drawable.divine_wgl_jain_mandir,
                R.drawable.divine_wgl_sammakka_saralamma,
                R.drawable.divine_adb_basara,
                R.drawable.divine_adb_jainath,
                R.drawable.divine_adb_satyanaraya,
                R.drawable.divine_papahareshwar,
                R.drawable.divine_adb_kalwa_narsimha,
                R.drawable.divine_nzb_dichpalli_ramalayam,
                R.drawable.divine_nzb_kanteshwar,
                R.drawable.divine_nzb_quilla,
                R.drawable.divine_nzb_sarangapur_hanuman,
                R.drawable.divine_knr_dharmapuri,
                R.drawable.divine_knr_kaleshwara,
                R.drawable.divine_knr_kondagattu,
                R.drawable.divine_knr_nallagonda,
                R.drawable.divine_knr_rajeshwar,
                R.drawable.divine_knr_nampally,
                R.drawable.divine_knr_nagunur,
                R.drawable.divine_mdk_kotilingeswara,
                R.drawable.divine_mdk_edupayala,
                R.drawable.divine_mdk_narasimha,
                R.drawable.divine_mdk_durga_bhavani,
                R.drawable.divine_mdk_sangameswara,
                R.drawable.divine_mdk_joginatha,
                R.drawable.divine_mdk_visweashwara,
                R.drawable.divine_mdk_vidya_saraswathi,
                R.drawable.divine_mdk_veerabhadra,
                R.drawable.divine_mdk_church,
                R.drawable.divine_rr_sanghi,
                R.drawable.divine_rr_karmanghat,
                R.drawable.divine_rr_lingeswara,
                R.drawable.divine_rr_chilkur_balaji,
                R.drawable.divine_rr_maheshwaram,
                R.drawable.divine_rr_ananthagiri};
        String[] mainName=getResources().getStringArray(R.array.divine_main_array);
        mainAdapter=new GridCustomAdapter(context, imageId, mainName);
        myGridview.setAdapter(mainAdapter);
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
