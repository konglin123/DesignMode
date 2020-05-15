package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.widget.ImageView;


public class ImageLoader {
    private static ImageLoader instance;
    private ImageCache mImageCache=new MemoryCache();
    private ImageLoader(){

    }

    //单例模式
    public static ImageLoader getInstance(){
        if(instance==null){
            synchronized (ImageLoader.class){
                if(instance==null){
                    instance=new ImageLoader();
                }
            }
        }
        return instance;
    }

    public void setImageCache(ImageCache imageCache){
        mImageCache=imageCache;
    }

    public void displayImg(String imgUrl, ImageView imageView){
        Bitmap bitmap = mImageCache.get(imgUrl);
        if(bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        //图片没缓存，进行下载显示
        // xxx();
    }


}
