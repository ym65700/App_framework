package com.sample.app_framework.fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sample.app_framework.base.BaseFragment;

/**
 * 作者：Administrator on 2017/6/19 13:57
 * 作用：
 */

public class OneFragment extends BaseFragment {
    private static final String TAG = OneFragment.class.getSimpleName();
    private TextView textView;

    @Override
    protected View initView() {
        Log.e(TAG, "常用框架Fragment页面被初始化了...");
        textView = new TextView(context);
        return textView;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG, "常用框架Fragment数据被初始化了...");
        textView.setText("常用框架");

    }
}
