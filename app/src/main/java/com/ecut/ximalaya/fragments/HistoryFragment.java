package com.ecut.ximalaya.fragments;

import android.view.LayoutInflater;
import android.view.View;

import com.ecut.ximalaya.R;

public class HistoryFragment extends BaseFragment {

    @Override
    protected View onSubViewLoad(LayoutInflater layoutInflater) {
        View  rootView = layoutInflater.inflate(R.layout.fragment_history,null);

        return rootView;
    }
}
