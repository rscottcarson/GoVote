package com.crevhive.govote.ui.welcome.slides;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crevhive.govote.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Slide1Fragment extends Fragment {


    public Slide1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.welcome_slide1, container, false);
    }

}