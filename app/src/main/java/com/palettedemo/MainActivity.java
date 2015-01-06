package com.palettedemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image);
        Palette palette = Palette.generate(bm);
        findViewById(R.id.view1).setBackgroundColor(
                (palette.getVibrantColor(0)));
        findViewById(R.id.view2).setBackgroundColor(
                (palette.getLightVibrantColor(0)));
        findViewById(R.id.view3).setBackgroundColor(
                (palette.getDarkVibrantColor(0)));
        findViewById(R.id.view4).setBackgroundColor(
                (palette.getMutedColor(0)));
        findViewById(R.id.view5).setBackgroundColor(
                (palette.getLightMutedColor(0)));
        findViewById(R.id.view6).setBackgroundColor(
                (palette.getDarkVibrantColor(0)));
    }

}
