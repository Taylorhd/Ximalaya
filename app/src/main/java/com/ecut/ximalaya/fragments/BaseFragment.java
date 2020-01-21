package com.ecut.ximalaya.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public abstract class BaseFragment extends FragmentActivity {
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        mRootView = onSubViewLoad(layoutInflater);
        return  mRootView;
    }

    protected abstract View onSubViewLoad(LayoutInflater layoutInflater);


}
