package com.ithomework.maodian;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Administrator on 2018/3/18.
 */

public class GridAdapter extends BaseAdapter {

    private Context mContext;
    public GridAdapter(Activity activity){
        mContext = activity ;
    }
    @Override
    public int getCount() {
        return 10;
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
        View view = View.inflate(mContext, R.layout.adapter_item, null);
        return view;
    }
}
