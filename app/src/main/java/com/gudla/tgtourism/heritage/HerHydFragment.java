package com.gudla.tgtourism.heritage;


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
public class HerHydFragment extends Fragment {
    ListView mListView;
    Context mContext;


    public HerHydFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_her_hyd, container, false);
        mListView=(ListView)view.findViewById(R.id.listHerHydView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] mImageId={R.drawable.hyd_charminar,R.drawable.hyd_salarjung,R.drawable.hyd_qutubshahitombs,R.drawable.hyd_paigahtombs,
                        R.drawable.hyd_mecca,R.drawable.hyd_golcondafort,R.drawable.hyd_falaknumapalace,R.drawable.hyd_chaumallapalace};
        String[] mName=mContext.getResources().getStringArray(R.array.her_hyd_array);
        mListView.setAdapter(new CustomAdapter(mContext,mImageId,mName));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
