package com.example.a12902.designmode;

import android.graphics.Bitmap;
import android.media.Image;

public class ImageLoderConfig {
     ImageCache mImageCache=new MemoryCache();
    //加载中图片id
    int mLoadingImgId;
    //加载失败图片id
    int mLoadingFailedImgId;
    private ImageLoderConfig(){

    }

    //builder模式（建造者模式）
    public static class Builder{
        ImageCache imageCache=new MemoryCache();
        //加载中图片id
        int mLoadingImgId;
        //加载失败图片id
        int mLoadingFailedImgId;
        public Builder setImageCache(ImageCache imageCache){
            this.imageCache=imageCache;
            return this;
        }
        public Builder setLoadingImgId(int loadingImgId){
            this.mLoadingImgId=loadingImgId;
            return this;
        }
        public Builder setLoadingFailedImgId(int loadingFailedImgId){
            this.mLoadingFailedImgId=loadingFailedImgId;
            return this;
        }
        void applyConfig(ImageLoderConfig config){
            config.mImageCache=this.imageCache;
            config.mLoadingImgId=this.mLoadingImgId;
            config.mLoadingFailedImgId=this.mLoadingFailedImgId;
        }

        public ImageLoderConfig create(){
            ImageLoderConfig config = new ImageLoderConfig();
            applyConfig(config);
            return config;
        }

    }

}
