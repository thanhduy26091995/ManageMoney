package com.thanhduy.manage_money.modules.base;

import android.app.Application;

import com.thanhduy.manage_money.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by buivu on 20/09/2017.
 */

public class BaseApplication extends Application {
    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto_Regular")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
