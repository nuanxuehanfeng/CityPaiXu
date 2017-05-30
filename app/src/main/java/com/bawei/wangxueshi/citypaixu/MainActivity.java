package com.bawei.wangxueshi.citypaixu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.bawei.wangxueshi.citypaixu.city.CityActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, CityActivity.class));
    }
}
