package com.gudla.tgtourism.hyd.qutub;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gudla.tgtourism.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreQutubFragment extends Fragment implements View.OnClickListener {
    Button mViewMap;


    public MoreQutubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_more_qutub, container, false);
        mViewMap = (Button) view.findViewById(R.id.qutubmap);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:17.39475,78.39472"));
        startActivity(intent);
    }

}
