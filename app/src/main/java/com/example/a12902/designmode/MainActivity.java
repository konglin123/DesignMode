package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initSingleAndBuilder();
//        initOrigin();
//        initFactory();
    }

    private void initFactory() {
        AudiCarFactory audiCarFactory = new AudiCarFactory();
        AudiQ3 audiQ3 = audiCarFactory.creatAudiCar(AudiQ3.class);
        AudiQ5 audiQ5 = audiCarFactory.creatAudiCar(AudiQ5.class);
        audiQ3.drive();
        audiQ5.drive();
    }

    private void initOrigin() {
        OriginDoc originDoc = new OriginDoc();
        originDoc.setText("这是原text");
        OriginDoc doc = (OriginDoc) originDoc.clone();
        originDoc.setText("这是修改的text");
        doc.showDoc();
    }

    private void initSingleAndBuilder() {
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

        ImageLoderConfig config = new ImageLoderConfig.Builder().setImageCache(new DoubleCache())
                .setLoadingFailedImgId(1)
                .setLoadingImgId(0)
                .create();

    }
}
