package com.syncsource.org.ew4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.syncsource.org.ew4.R;

/**
 * Created by SyncSource on 7/1/2016.
 */
public class YokeShin extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.yokeshin_fragment,container,false);
        ImageView imgOne = (ImageView)view.findViewById(R.id.img_1);
        ImageView imgTwo = (ImageView)view.findViewById(R.id.img_2);
        ImageView imgThree= (ImageView)view.findViewById(R.id.img_3);
        ImageView imgFour = (ImageView)view.findViewById(R.id.img_4);
        return view;
    }
    public static YokeShin newInstance() {
        YokeShin fragment = new YokeShin();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
}
