package com.example.a12902.designmode;

import android.graphics.Bitmap;

public interface ImageCache {
   void put(String url, Bitmap bitmap);
   Bitmap get(String url);
}
