package org.pursuit.myapplication.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import org.pursuit.myapplication.R;
import org.pursuit.myapplication.fragments.DisplayFragment;

import static org.pursuit.myapplication.fragments.RVFragment.flowerDisplayPics;


public class FragmentViewHolder extends RecyclerView.ViewHolder {
    private ImageView flowerView;

    public FragmentViewHolder(@NonNull View itemView) {
        super(itemView);
        flowerView = itemView.findViewById(R.id.flower_imageview);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayFragment.newInstance(flowerDisplayPics.get(getAdapterPosition()));
            }
        });

    }

    public void onBind(Integer imageResID) {

        flowerView.setImageResource(imageResID);
    }
}
