package com.gudla.tgtourism.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.gudla.tgtourism.R;

/**
 * Created by dell on 9/11/2016.
 */
public class FragmentReplace {
    public FragmentReplace(Fragment fragment, int mContainer, FragmentManager fragmentManager){
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(mContainer,fragment,fragment.getClass().getSimpleName());
        fragmentTransaction.commit();
    }
}
