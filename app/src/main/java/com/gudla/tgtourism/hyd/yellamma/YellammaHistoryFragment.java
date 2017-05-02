package com.gudla.tgtourism.hyd.yellamma;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gudla.tgtourism.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YellammaHistoryFragment extends Fragment {


    public YellammaHistoryFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_yellamma_history, container, false);
    }

}
