package org.pursuit.myapplication.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import org.pursuit.myapplication.R;

public class DisplayFragment extends Fragment {
    private View rootView;
    public static final String KEY = "displayfragment";
    private ImageView imageView;


    public DisplayFragment() {


    }

    public static DisplayFragment newInstance(Integer image) {
        DisplayFragment displayFrag = new DisplayFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY, image);
        displayFrag.setArguments(bundle);
        return displayFrag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_display, container, false);
        return rootView;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setImageDisplayFrag(view);
    }


    private void setImageDisplayFrag(@NonNull View view) {
        imageView = view.findViewById(R.id.display_image);
        Bundle bundle = getArguments();
        imageView.setImageResource(bundle.getInt(KEY));

    }
}
