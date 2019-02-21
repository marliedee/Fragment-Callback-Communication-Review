package org.pursuit.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.myapplication.R;
import org.pursuit.myapplication.controller.FragmentAdapter;

import java.util.ArrayList;

public class RVFragment extends Fragment {
    private View rootView;
    private RecyclerView recyclerView;
    public static ArrayList<Integer> flowerDisplayPics;


    public RVFragment() {
    }

    public static RVFragment newInstance() {
        RVFragment fragment = new RVFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_rv, container, false);

        recyclerView = rootView.findViewById(R.id.rv_frag);


        flowerDisplayPics = new ArrayList<>();
        flowerDisplayPics.add(R.drawable.flower1);
        flowerDisplayPics.add(R.drawable.flower2);
        flowerDisplayPics.add(R.drawable.flower3);
        flowerDisplayPics.add(R.drawable.flowers4);

        FragmentAdapter imageAdapter = new FragmentAdapter(flowerDisplayPics);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
        recyclerView.setAdapter(imageAdapter);


        return rootView;

    }
}
