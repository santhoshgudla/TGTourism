package com.gudla.tgtourism.hyd.jagannath;


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
public class JagannathMoreInfoFragment extends Fragment implements View.OnClickListener{
    Button mViewInMap;


    public JagannathMoreInfoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_jagannath_more_info, container, false);
        mViewInMap= (Button) view.findViewById(R.id.jagannathmap);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewInMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:17.4151319,78.4262336"));
        startActivity(intent);
    }
}
