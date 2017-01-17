package com.example.nitin.fragmentexample1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by NITIN on 17-Jan-17.
 */
public class Fragementclasss2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("TAG", String.valueOf(container));
        return inflater.inflate(R.layout.fragment_2,container,false);
    }
}
