package com.ecut.ximalaya.utils;

import com.ecut.ximalaya.base.BaseFragment;
import com.ecut.ximalaya.fragments.HistoryFragment;
import com.ecut.ximalaya.fragments.RecommandFragment;
import com.ecut.ximalaya.fragments.SubscriptionFragment;

import java.util.HashMap;
import java.util.Map;


public class FragmentCreator {
    public final static int INDEX_RECOMMEND = 0;
    public final static int INDEX_SUBSCRIPTION = 1;
    public final static int INDEX_HISTORY = 2;
    public final static int PAGE_COUNT = 3;
    private static final String TAG = "FragmentCreator" ;
    private static Map<Integer, BaseFragment> sCache = new HashMap<>();
    public static BaseFragment getFragment(int index){
        BaseFragment baseFragment = sCache.get(index);
        LogUtil.d(TAG,"fragment creator ");
        if (baseFragment != null){
            return  baseFragment;
        }
        switch ( index){
            case INDEX_RECOMMEND:
                baseFragment = new RecommandFragment();
                break;
            case INDEX_SUBSCRIPTION:
                baseFragment = new SubscriptionFragment();
                break;
            case INDEX_HISTORY:
                baseFragment = new HistoryFragment();
                break;
                default:
                    break;

        }
        sCache.put(index,baseFragment);
        return  baseFragment;
    }
}
