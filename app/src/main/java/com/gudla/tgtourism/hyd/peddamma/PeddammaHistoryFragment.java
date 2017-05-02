package com.gudla.tgtourism.hyd.peddamma;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gudla.tgtourism.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeddammaHistoryFragment extends Fragment {


    public PeddammaHistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peddamma_history, container, false);
    }

}
