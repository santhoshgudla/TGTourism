package com.gudla.tgtourism.nld.kolanupaka;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gudla.tgtourism.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainKolanupakaFragment extends Fragment {


    public MainKolanupakaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_kolanupaka, container, false);
    }

}