package com.syncsource.org.ew4.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.syncsource.org.ew4.R;

/**
 * Created by SyncSource on 6/30/2016.
 */
public class JobSearch extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.job_search_fragment,container,false);

        return view;
    }
    public static JobSearch newInstance() {
        JobSearch fragment = new JobSearch();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
}
