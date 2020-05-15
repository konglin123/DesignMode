package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * 新增需求，设置加载中显图片和加载失败图片等等，如果设置成员变量通过set方法注入的话会暴露给
 * 用户太多方法，而且用户还得仔细选择方法，使用成本太高，所以可以在初始化的时候一次性构造配置对象，
 * 然后注入给imageloder，之后属性就不可以修改，因为没有set方法，这里使用builder模式来够着配置对象
 */
public class ImageLoader2 {
    private static ImageLoader2 instance;
    private ImageLoderConfig imageLoderConfig;
    private ImageLoader2(){

    }

    //单例模式
    public static ImageLoader2 getInstance(){
        if(instance==null){
            synchronized (ImageLoader2.class){
                if(instance==null){
                    instance=new ImageLoader2();
                }
            }
        }
        return instance;
    }


    public void displayImg(String imgUrl, ImageView imageView){
        Bitmap bitmap = imageLoderConfig.mImageCache.get(imgUrl);
        if(bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        //图片没缓存，进行下载显示
        // xxx();
    }

    public void init(ImageLoderConfig imageLoderConfig){
        this.imageLoderConfig=imageLoderConfig;
    }

}
