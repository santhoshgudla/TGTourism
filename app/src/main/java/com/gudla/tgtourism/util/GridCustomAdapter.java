package com.gudla.tgtourism.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.gudla.tgtourism.R;
import com.gudla.tgtourism.util.SourceArray;
import com.gudla.tgtourism.util.ViewHolder;

import java.util.ArrayList;

/**
 * Created by dell on 9/4/2016.
 */
public class GridCustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<SourceArray> list;
    public GridCustomAdapter(Context context,int[] imageId, String[] name){
        this.context=context;
        list=new ArrayList<>();
        for(int i=0; i<imageId.length;i++){
            SourceArray sourceArray=new SourceArray(imageId[i], name[i]);
            list.add(sourceArray);
        }
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row=view;
        ViewHolder viewHolder;
//        int imageViewId= R.id.gridImageView;
//        int textViewId=R.id.gridTextView;
        int imageViewId= R.id.imageLinnerGrid;
        int textViewId=R.id.textLineerGrid;
        if(row==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.custon_grid_lineer,viewGroup,false);
            viewHolder=new ViewHolder(row,imageViewId,textViewId);
            row.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) row.getTag();
        }
        Bitmap icon = BitmapFactory.decodeResource(context.getResources(),list.get(i).imageId);
        Bitmap circleImage=viewHolder.getRoundedShape(icon);
        viewHolder.imageView.setImageBitmap(circleImage);
        viewHolder.textView.setText(list.get(i).mainName);
        return row;
    }
}
