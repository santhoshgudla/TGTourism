package com.gudla.tgtourism.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gudla.tgtourism.R;

import java.util.ArrayList;

/**
 * Created by dell on 9/10/2016.
 */
public class MyCustomRecyclerAdapter extends RecyclerView.Adapter<MyCustomRecyclerAdapter.ItemHolder> {
    LayoutInflater mInflater;
    public static ArrayList<DataSource> mList;
    Context mContext;

    public MyCustomRecyclerAdapter(Context mContext, int[] mImageId, String[] mName){
        this.mContext=mContext;
        mInflater=LayoutInflater.from(mContext);
        getSourceArray(mImageId,mName);
    }
    public static void getSourceArray(int[] mImageId,String[] mName){
        mList=new ArrayList<>();
        for(int i=0;i<mName.length;i++){
            DataSource sourceArray=new DataSource(mImageId[i], mName[i]);
            mList.add(sourceArray);
        }
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=mInflater.inflate(R.layout.custom_grid_row,parent,false);
        ItemHolder itemHolder= new ItemHolder(view);
        return itemHolder;
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


    class ItemHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        ImageView mImageView;
        public ItemHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView.findViewById(R.id.gridImageView);
            mTextView=(TextView)itemView.findViewById(R.id.gridTextView);
        }
    }
}
