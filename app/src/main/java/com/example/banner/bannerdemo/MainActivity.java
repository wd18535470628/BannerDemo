package com.example.banner.bannerdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private Banner banner;
    private List<Integer> urlList = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private int imagesid[] = new int[]{R.drawable.refid_info,R.drawable.refid_info,
            R.drawable.refid_info,R.drawable.refid_info};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        urlList.add(Integer.valueOf(R.drawable.refid_info));
        urlList.add(Integer.valueOf(R.drawable.refid_info));
        urlList.add(Integer.valueOf(R.drawable.refid_info));
        urlList.add(Integer.valueOf(R.drawable.refid_info));
        titles.add("收工回头看");
        titles.add("收工回头看");
        titles.add("收工回头看");
        titles.add("收工回头看");
    }
    private void initView() {
        banner = (Banner) findViewById(R.id.banner);
        banner.setImages(urlList).setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE).setBannerTitles(titles)
                .setBannerAnimation(Transformer.Tablet).setImageLoader(new GlideImageLoader()).start();
    }
}