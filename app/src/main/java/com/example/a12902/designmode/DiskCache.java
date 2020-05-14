package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 本地sdk缓存
 */
public class DiskCache implements ImageCache {
    private LruCache<String,Bitmap> mDiskCache=new LruCache<>(8);
    @Override
    public void put(String url, Bitmap bitmap) {
        mDiskCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        return mDiskCache.get(url);
    }
}
