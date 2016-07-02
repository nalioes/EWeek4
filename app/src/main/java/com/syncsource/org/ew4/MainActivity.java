package com.syncsource.org.ew4;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.syncsource.org.ew4.fragments.JobSearch;
import com.syncsource.org.ew4.fragments.Pulse;
import com.syncsource.org.ew4.fragments.YokeShin;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TextView screenTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        screenTitle = (TextView) findViewById(R.id.tv_screen_title);
        CircleImageView imageView = (CircleImageView) findViewById(R.id.avatar);
        navigationView = (NavigationView)findViewById(R.id.navigate_view);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setViewToYokeShin();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(final MenuItem item) {
        item.setChecked(true);
        drawerLayout.closeDrawers();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (item.getItemId()) {
                    case R.id.job_search:
                       setViewToJobSearch();
                        break;
                    case R.id.yoke_shin:
                        setViewToYokeShin();
                        break;
                    case R.id.pulse:
                        setViewToPulse();
                        break;

                }
            }
        }, 100); //to close drawer smoothly.

        return true;
    }

    private void setViewToJobSearch() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, JobSearch.newInstance())
                .commit();
    }
    private void setViewToYokeShin(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, YokeShin.newInstance())
                .commit();
    }
    private void setViewToPulse(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, Pulse.newInstance())
                .commit();
    }
}
