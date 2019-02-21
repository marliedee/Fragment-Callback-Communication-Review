package org.pursuit.myapplication.controller;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.myapplication.R;
import org.pursuit.myapplication.fragments.DisplayFragment;
import org.pursuit.myapplication.view.FragmentViewHolder;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentViewHolder> {

    private List<Integer> flowerDisplay;

    public FragmentAdapter(ArrayList<Integer>flowerDisplay) {
        this.flowerDisplay = flowerDisplay;

    }

    @NonNull
    @Override
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flowers_view_list, viewGroup, false);
        return new FragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int i) {

        Integer image = flowerDisplay.get(i);
        fragmentViewHolder.onBind(image);

    }

    @Override
    public int getItemCount() {
        return flowerDisplay.size();
    }

}
