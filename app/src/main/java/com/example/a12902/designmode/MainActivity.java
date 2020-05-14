package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUse();
    }

    private void initUse() {
        ImageLoader instance = ImageLoader.getInstance();
        //内存缓存
        instance.setImageCache(new MemoryCache());
        //sd卡缓存
        instance.setImageCache(new DiskCache());
        //双重缓存
        instance.setImageCache(new DoubleCache());
        //自定义缓存
        instance.setImageCache(new ImageCache() {
            @Override
            public void put(String url, Bitmap bitmap) {

            }

            @Override
            public Bitmap get(String url) {
                return null;
            }
        });
    }
}
