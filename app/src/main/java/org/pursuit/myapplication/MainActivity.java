package org.pursuit.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.pursuit.myapplication.fragments.DisplayFragment;
import org.pursuit.myapplication.fragments.RVFragment;
import org.pursuit.myapplication.network.FragmentInterface;

public class MainActivity extends AppCompatActivity implements FragmentInterface {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RVFragment rvFragment = RVFragment.newInstance();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();
        ft2.replace(R.id.main_container, rvFragment).addToBackStack(null);
        ft2.commit();

    }

    @Override
    public void goToDisplayFragment() {
        DisplayFragment displayFragment = DisplayFragment.newInstance(R.drawable.flowers4);
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();
        ft2.replace(R.id.main_container, displayFragment).addToBackStack(null);
        ft2.commit();

    }


}