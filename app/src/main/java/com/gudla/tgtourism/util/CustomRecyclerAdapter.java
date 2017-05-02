package com.gudla.tgtourism.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gudla.tgtourism.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by santhosh on 13/3/17.
 */

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ItemHolder> {
    private LayoutInflater mInflater;
    private static List<DataSource> mList;
    private Context mContext;

    public CustomRecyclerAdapter(Context context, int[] imageId, String[] name){
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        getSourceArray(imageId, name);

    }
    private static void getSourceArray(int[] mImageId,String[] mName){
        mList=new ArrayList<>();
        for(int i=0;i<mName.length;i++){
            DataSource sourceArray=new DataSource(mImageId[i], mName[i]);
            mList.add(sourceArray);
        }
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.activity_cardview,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.mTextView.setText(mList.get(position).mName);
        holder.mImageView.setImageResource(mList.get(position).mImageId);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        ImageView mImageView;
        private ItemHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.text_cardview);
            mImageView = (ImageView) itemView.findViewById(R.id.image_cardview);
        }
    }
}
