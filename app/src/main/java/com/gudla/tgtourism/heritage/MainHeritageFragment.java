package com.gudla.tgtourism.heritage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.GridCustomAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainHeritageFragment extends Fragment {
    GridView gridView;
    int[] imageId;
    String[] names;
    GridCustomAdapter gridCustomAdapter;



    public MainHeritageFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_main_heritage, container, false);
        gridView= (GridView) view.findViewById(R.id.gridHeritageMain);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] imageId={R.drawable.hyd_charminar,R.drawable.hyd_salarjung,R.drawable.hyd_qutubshahitombs,
                        R.drawable.hyd_paigahtombs,R.drawable.hyd_mecca,R.drawable.hyd_golcondafort,R.drawable.hyd_falaknumapalace,
                        R.drawable.hyd_chaumallapalace,R.drawable.khm_nelakondapalli,R.drawable.khm_khammamfort,R.drawable.khm_parnasala,
                        R.drawable.mbn_pillalamarri,R.drawable.mbn_alampur,R.drawable.mbn_gadwalfort,R.drawable.nld_nandikonda,
                        R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,R.drawable.nld_devarakonda,R.drawable.nld_bhongir,
                        R.drawable.nld_rachakondafort,R.drawable.wgl_thousand_pillars,R.drawable.wgl_warangalfort,R.drawable.wgl_ramappa,
                        R.drawable.adb_nirmalfort,R.drawable.nzb_domakonda,R.drawable.nzb_fort,R.drawable.nzb_archaeological,
                        R.drawable.knr_ramagirifort,R.drawable.knr_silverfiligree,R.drawable.knr_dhulikatta,R.drawable.knr_elgandal,
                        R.drawable.knr_jagtial_fort,R.drawable.knr_nagunur,R.drawable.mdk_medakfort};
        this.imageId=imageId;
        names=getActivity().getResources().getStringArray(R.array.main_heritage_array);
        gridCustomAdapter=new GridCustomAdapter(getActivity(),imageId,names);
        gridView.setAdapter(gridCustomAdapter);
    }

}
