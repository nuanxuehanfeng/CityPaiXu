package com.bawei.wangxueshi.citypaixu.city;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bawei.wangxueshi.citypaixu.R;

import java.util.List;

/**
 * @author: xiaolijuan
 * @description:
 * @projectName: SelectCityDome
 * @date: 2016-03-01
 * @time: 17:25.CityAdapter就是热门城市中GridView的适配器
 */
public class CityAdapter extends ArrayAdapter<String> {
    /**
     * 需要渲染的item布局文件
     */
    private int resource;

    public CityAdapter(Context context, int textViewResourceId, List<String> objects) {
        super(context, textViewResourceId, objects);
        resource = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            layout = (LinearLayout) LayoutInflater.from(getContext()).inflate(resource, null);
        } else {
            layout = (LinearLayout) convertView;
        }
        //布局gridview_item
        Button name = (Button) layout.findViewById(R.id.tv_city);
        name.setText(getItem(position));

        
        
        return layout;
    }
}