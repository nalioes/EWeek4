package com.syncsource.org.ew4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.syncsource.org.ew4.R;

/**
 * Created by SyncSource on 7/1/2016.
 */
public class Pulse extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.pulse_fragment,container,false);

        return view;
    }
    public static Pulse newInstance() {
        Pulse fragment = new Pulse();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
}
