package com.malkinfo.rentalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.malkinfo.rentalapp.databinding.ActivityMainBinding;
import com.malkinfo.rentalapp.fragments.ChatFragment;
import com.malkinfo.rentalapp.fragments.FavouriteFragment;
import com.malkinfo.rentalapp.fragments.ProfielFragment;

public class HomeActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {


    private BottomNavigationView bottomNavigationView;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(this);

        //loadFragment(new HomeFragment());
    }


    /**
     * Called when an item in the navigation menu is selected.
     *
     * @param item The selected item
     * @return true to display the item as the selected item and false if the item should not be
     * selected. Consider setting non-selectable items as disabled preemptively to make them
     * appear non-interactive.
     */
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        if (item.getItemId() == R.id.menu_home) {
           // fragment = new HomeFragment();
        } else if (item.getItemId() == R.id.menu_fav) {
            fragment = new FavouriteFragment();
        } else if (item.getItemId() == R.id.menu_chat) {
            fragment = new ChatFragment();
        } else if (item.getItemId() == R.id.menu_acc) {
            fragment = new ProfielFragment();
        }
        return loadFragment(fragment);
    }


    boolean loadFragment(Fragment fragment){
        if(fragment!=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }

}