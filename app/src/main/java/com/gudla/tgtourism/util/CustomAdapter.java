package com.gudla.tgtourism.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.gudla.tgtourism.R;

import java.util.ArrayList;

/**
 * Created by dell on 9/3/2016.
 */
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<SourceArray> list;
    public CustomAdapter(Context context,int[] imageId, String[] name){
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
        int imageViewId=R.id.card_image;
        int textViewId=R.id.card_text;
        if(row==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.card_listview,viewGroup,false);
            viewHolder=new ViewHolder(row,imageViewId,textViewId);
            row.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) row.getTag();
        }
        viewHolder.imageView.setImageResource(list.get(i).imageId);
        viewHolder.textView.setText(list.get(i).mainName);
        return row;
    }
}
