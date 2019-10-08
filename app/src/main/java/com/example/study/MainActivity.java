package com.example.study;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final HomeFragment homeFragment = new HomeFragment();
        final GroupsFragment groupsFragment = new GroupsFragment();
        final MessagesFragment messagesFragment = new MessagesFragment();
        final ProfileFragment profileFragment = new ProfileFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.Home){
                    setFragment(homeFragment);
                    return true;
                } else if (id == R.id.Groups){
                    setFragment(groupsFragment);
                    return true;
                } else if (id == R.id.Messages){
                    setFragment(messagesFragment);
                    return true;
                } else if (id == R.id.Profile){
                    setFragment(profileFragment);
                    return true;
                }
                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.Home);
    }

    private void setFragment (Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }


}


