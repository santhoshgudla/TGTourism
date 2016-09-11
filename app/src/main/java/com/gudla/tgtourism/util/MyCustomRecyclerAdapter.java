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
//       String[] mName=mContext.getResources().getStringArray(R.array.main_heritage_array);
//       int[] mImageId={R.drawable.hyd_charminar,R.drawable.hyd_salarjung,R.drawable.hyd_qutubshahitombs,
//                R.drawable.hyd_paigahtombs,R.drawable.hyd_mecca,R.drawable.hyd_golcondafort,R.drawable.hyd_falaknumapalace,
//                R.drawable.hyd_chaumallapalace,R.drawable.khm_nelakondapalli,R.drawable.khm_khammamfort,R.drawable.khm_parnasala,
//                R.drawable.mbn_pillalamarri,R.drawable.mbn_alampur,R.drawable.mbn_gadwalfort,R.drawable.nld_nandikonda,
//                R.drawable.nld_nagarjunasagar,R.drawable.nld_kolanupaka,R.drawable.nld_devarakonda,R.drawable.nld_bhongir,
//                R.drawable.nld_rachakondafort,R.drawable.wgl_thousand_pillars,R.drawable.wgl_warangalfort,R.drawable.wgl_ramappa,
//                R.drawable.adb_nirmalfort,R.drawable.nzb_domakonda,R.drawable.nzb_fort,R.drawable.nzb_archaeological,
//                R.drawable.knr_ramagirifort,R.drawable.knr_silverfiligree,R.drawable.knr_dhulikatta,R.drawable.knr_elgandal,
//                R.drawable.knr_jagtial_fort,R.drawable.knr_nagunur,R.drawable.mdk_medakfort};
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
//        Bitmap icon = BitmapFactory.decodeResource(mContext.getResources(), mList.get(position).mImageId);
//        Bitmap circleImage = getRoundedShape(icon);
//        holder.mImageView.setImageBitmap(circleImage);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

//    public Bitmap getRoundedShape(Bitmap scaleBitmapImage) {
//        int targetWidth = 200;
//        int targetHeight = 200;
//        Bitmap targetBitmap = Bitmap.createBitmap(targetWidth,
//                targetHeight,Bitmap.Config.ARGB_8888);
//
//        Canvas canvas = new Canvas(targetBitmap);
//        Path path = new Path();
//        path.addCircle(((float) targetWidth - 1) / 2,
//                ((float) targetHeight - 1) / 2,
//                (Math.min(((float) targetWidth),
//                        ((float) targetHeight)) / 2),
//                Path.Direction.CCW);
//
//        canvas.clipPath(path);
//        Bitmap sourceBitmap = scaleBitmapImage;
//        canvas.drawBitmap(sourceBitmap,
//                new Rect(0, 0, sourceBitmap.getWidth(),
//                        sourceBitmap.getHeight()),
//                new Rect(0, 0, targetWidth, targetHeight), null);
//        return targetBitmap;
//    }

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
