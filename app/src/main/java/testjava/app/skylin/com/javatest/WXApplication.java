package testjava.app.skylin.com.javatest;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by liuxuan on 2017/6/22.
 */

public class WXApplication extends Application {
    private ImageLoader imageLoader;

    private static WXApplication app;

    public static WXApplication getApp() {
        return app;
    }


    public ImageLoader getImageloader() {
        return imageLoader;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this, config);
        imageLoader = ImageLoader.getInstance();
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(this);
        imageLoader.getInstance().init(configuration);
    }
}
