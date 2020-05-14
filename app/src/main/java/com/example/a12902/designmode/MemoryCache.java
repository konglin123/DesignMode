package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 内存缓存
 */
public class MemoryCache implements ImageCache {
    private LruCache<String,Bitmap> mMemoryCache=new LruCache<>(8);


    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        return mMemoryCache.get(url);
    }
}
