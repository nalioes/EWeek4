package com.syncsource.org.ew4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.syncsource.org.ew4.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by SyncSource on 7/1/2016.
 */
public class Pulse extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.pulse_fragment, container, false);
        CircleImageView imgAvater = (CircleImageView) view.findViewById(R.id.avater_image);
        ImageView contentImage = (ImageView) view.findViewById(R.id.content_image);

        Glide.with(getContext())
                .load(R.drawable.elizabeth)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imgAvater);
        Glide.with(getContext())
                .load(R.drawable.elizabeth_show)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(contentImage);
        return view;
    }

    public static Pulse newInstance() {
        Pulse fragment = new Pulse();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
}
