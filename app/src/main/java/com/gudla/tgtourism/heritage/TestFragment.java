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
import com.gudla.tgtourism.util.MyCustomRecyclerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {
    RecyclerView mRecyclerView;
    Context mContext;


    public TestFragment() {
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
        mRecyclerView.setHasFixedSize(true);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(mRecyclerView==null){
            Toast.makeText(mContext,"RecyclerView is null",Toast.LENGTH_LONG).show();
        }else {
            mRecyclerView.setAdapter(new MyCustomRecyclerAdapter(mContext));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
}
