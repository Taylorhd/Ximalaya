package com.ecut.ximalaya.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecut.ximalaya.R;
import com.ecut.ximalaya.base.BaseFragment;

public class RecommandFragment extends BaseFragment {

    @Override
    protected View onSubViewLoaded(LayoutInflater layoutInflater, ViewGroup container) {
        View  rootView = layoutInflater.inflate(R.layout.fragment_recommand,container,false);
        return rootView;
    }
}
