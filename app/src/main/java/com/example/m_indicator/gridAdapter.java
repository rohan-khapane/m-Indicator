package com.example.m_indicator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridAdapter extends BaseAdapter {
    int[] images;
    String[] name;
    Context context;
    LayoutInflater infater;
    public gridAdapter(int[] images, String[] name,Context context) {
        this.images = images;
        this.name = name;
        this.context=context;
    }




    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (infater==null)
            infater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView==null){
            convertView=infater.inflate(R.layout.single_frame_gridvw_home,null);

        }

        ImageView img= (ImageView) convertView.findViewById(R.id.img_grid_item_home);
        TextView tv= (TextView) convertView.findViewById(R.id.txt_grid_item_home);
//
        img.setImageResource(images[position]);
        tv.setText(name[position]);
        return convertView;
    }


}
