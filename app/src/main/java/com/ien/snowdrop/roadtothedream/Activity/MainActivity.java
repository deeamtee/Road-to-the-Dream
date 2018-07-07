package com.ien.snowdrop.roadtothedream.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ien.snowdrop.roadtothedream.BottomNavigationViewHelper;
import com.ien.snowdrop.roadtothedream.Fragments.AndroidFragment;
import com.ien.snowdrop.roadtothedream.Fragments.HomeFragment;
import com.ien.snowdrop.roadtothedream.Fragments.MusicFragment;
import com.ien.snowdrop.roadtothedream.Fragments.NotificationFragment;
import com.ien.snowdrop.roadtothedream.Fragments.PhoneFragment;
import com.ien.snowdrop.roadtothedream.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        BottomNavigationViewHelper.disableShiftMode(navigation);

        //Toolbar_main

        Toolbar toolbar_main = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar_main.setTitle(R.string.title_toolbar_home);
        setSupportActionBar(toolbar_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_music:
                fragment = new MusicFragment();
                break;
            case R.id.navigation_android:
                fragment = new AndroidFragment();
                break;
            case R.id.navigation_smartphone:
                fragment = new PhoneFragment();
                break;
            case R.id.navigation_notifications:
                fragment = new NotificationFragment();
                break;

        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}

