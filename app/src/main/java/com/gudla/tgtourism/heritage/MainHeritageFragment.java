package com.gudla.tgtourism.heritage;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.CustomRecyclerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainHeritageFragment extends Fragment {
    RecyclerView mRecyclerView;
    Context mContext;


    public MainHeritageFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_test, container, false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.recyclerTest);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] mName=mContext.getResources().getStringArray(R.array.main_heritage_array);
        int[] mImageId={R.drawable.hyd_charminar,R.drawable.hyd_salarjung,R.drawable.hyd_qutubshahitombs,
                R.drawable.hyd_paigahtombs,R.drawable.hyd_mecca,R.drawable.hyd_golcondafort,R.drawable.hyd_falaknumapalace,
                R.drawable.hyd_chaumallapalace,R.drawable.khm_nelakondapalli,R.drawable.khm_khammamfort,R.drawable.khm_parnasala,
                R.drawable.mbn_pillalamarri,R.drawable.mbn_alampur,R.drawable.mbn_gadwalfort,R.drawable.nld_nandikonda,
                R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,R.drawable.nld_devarakonda,R.drawable.nld_bhongir,
                R.drawable.nld_rachakondafort,R.drawable.wgl_thousand_pillars,R.drawable.wgl_warangalfort,R.drawable.wgl_ramappa,
                R.drawable.adb_nirmalfort,R.drawable.nzb_domakonda,R.drawable.nzb_fort,R.drawable.nzb_archaeological,
                R.drawable.knr_ramagirifort,R.drawable.knr_silverfiligree,R.drawable.knr_dhulikatta,R.drawable.knr_elgandal,
                R.drawable.knr_jagtial_fort,R.drawable.knr_nagunur,R.drawable.mdk_medakfort};
        if(mRecyclerView==null){
            Toast.makeText(mContext,"RecyclerView is null",Toast.LENGTH_LONG).show();
        }else {
            mRecyclerView.setAdapter(new CustomRecyclerAdapter(mContext, mImageId, mName));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
