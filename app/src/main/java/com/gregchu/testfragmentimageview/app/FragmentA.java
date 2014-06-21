package com.gregchu.testfragmentimageview.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by greg on 6/21/2014.
 */
public class FragmentA extends Fragment {
    ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_a,container,false);
       //Super.onCreateView(inflater, container, savedInstanceState);
        iv = (ImageView) view.findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.china);
        return view;
    }
}
