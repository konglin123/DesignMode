package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initSingleAndBuilder();
//        initOrigin();
//        initFactory();
//        initStrategy();
//        initState();
        initRequest();
    }

    private void initRequest() {
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        groupLeader.nextHandler=manager;
        groupLeader.handleRequest(3000);
    }

    private void initState() {
        findViewById(R.id.forward).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * 未登录状态会跳转登录界面，已登陆状态会直接转发
                 * 好处是少了if/else判断，不用每次都要判断状态，a状态执行a，b状态执行b
                 */
                LoginContext.getInstance().forword(MainActivity.this);
            }
        });
    }

    private void initStrategy() {
        TranficalCalculator ins = TranficalCalculator.getIns();
        //设置计算策略
        ins.setStrategy(new BusStrategy());
        //计算价格
        ins.calculatePrice(10);
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
