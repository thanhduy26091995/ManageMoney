package com.thanhduy.manage_money.modules.base;

import com.thanhduy.manage_money.data.networks.api.ApiListener;
import com.thanhduy.manage_money.data.networks.api.ApiMethod;

/**
 * Created by buivu on 01/12/2017.
 */

public abstract class BasePresenter<T extends BaseView> implements ApiListener {
    protected ApiMethod mApiMethod;
    private T mView;

    public BasePresenter(T mView) {
        this.mView = mView;
        mApiMethod = new ApiMethod();
        mApiMethod.setApiListener(this);
    }

}
