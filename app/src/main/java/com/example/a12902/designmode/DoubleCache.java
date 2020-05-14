package com.example.a12902.designmode;

import android.graphics.Bitmap;

/**
 * 双缓存
 */
public class DoubleCache implements ImageCache {

    private DiskCache mDiskCache=new DiskCache();
    private MemoryCache mMemoryCache=new MemoryCache();

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
        mDiskCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if(bitmap==null){
            bitmap=mDiskCache.get(url);
        }
        return bitmap;
    }
}
