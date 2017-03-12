package com.gudla.tgtourism.hyd.stmarry;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gudla.tgtourism.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StMarryMoreInfoFragment extends Fragment implements View.OnClickListener{
    Button mViewInMap;


    public StMarryMoreInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_st_marry_more_info, container, false);
        mViewInMap= (Button) view.findViewById(R.id.stmarryViewInMap);
        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:17.442196,78.5022744"));
        startActivity(intent);
    }
}