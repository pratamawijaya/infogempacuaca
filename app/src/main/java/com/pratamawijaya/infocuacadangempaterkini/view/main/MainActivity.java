package com.pratamawijaya.infocuacadangempaterkini.view.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.pratamawijaya.infocuacadangempaterkini.R;
import com.pratamawijaya.infocuacadangempaterkini.model.FragmentModels;
import com.pratamawijaya.infocuacadangempaterkini.presenter.MainViewPresenter;
import com.pratamawijaya.infocuacadangempaterkini.view.main.adapter.MainViewAdapter;
import com.pratamawijaya.infocuacadangempaterkini.view.main.interfaces.iMainView;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements iMainView {


    @InjectView(R.id.viewpager)
    ViewPager viewPager;
    @InjectView(R.id.tabs)
    TabLayout tabLayout;
    @InjectView(R.id.toolbar)
    Toolbar toolbar;

    private MainViewPresenter presenter;
    private MainViewAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        setSupportActionBar(toolbar);

        presenter = new MainViewPresenter(this);
        presenter.addFragment();

        tabLayout.setupWithViewPager(viewPager);

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
        if (id == R.id.action_about) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setupFragment(List<FragmentModels> fragmentModelsList) {
        fragmentAdapter = new MainViewAdapter(getSupportFragmentManager(), fragmentModelsList);
        viewPager.setAdapter(fragmentAdapter);
    }
}
