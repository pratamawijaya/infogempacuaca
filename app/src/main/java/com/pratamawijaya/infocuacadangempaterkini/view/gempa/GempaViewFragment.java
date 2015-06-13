package com.pratamawijaya.infocuacadangempaterkini.view.gempa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.pratamawijaya.infocuacadangempaterkini.R;
import com.pratamawijaya.infocuacadangempaterkini.model.Gempa;
import com.pratamawijaya.infocuacadangempaterkini.presenter.GempaViewPresenter;
import com.pratamawijaya.infocuacadangempaterkini.view.gempa.adapter.GempaAdapter;
import com.pratamawijaya.infocuacadangempaterkini.view.gempa.interfaces.iGempaView;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 */
public class GempaViewFragment extends Fragment implements iGempaView {

    @InjectView(R.id.recylerView)
    RecyclerView recyclerView;
    @InjectView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefreshLayout;
    @InjectView(R.id.loading)
    ProgressBar loading;

    private GempaViewPresenter presenter;
    private GempaAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gempa_view, container, false);
        ButterKnife.inject(this, v);

        setupRecyclerView();
        setupRefreshLayout();

        presenter = new GempaViewPresenter(this);

        presenter.getDataGempa();

        return v;
    }

    private void setupRefreshLayout() {
        swipeRefreshLayout.setColorSchemeColors(R.color.primaryColor);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.getDataGempa();
            }
        });

    }


    private void setupRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    @Override
    public void loadData(List<Gempa> gempa) {
        adapter = new GempaAdapter(getActivity(), gempa);
        recyclerView.setAdapter(adapter);
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void showLoading(boolean show) {
        if (show) {
            recyclerView.setVisibility(View.GONE);
            loading.setVisibility(View.VISIBLE);
        } else {
            recyclerView.setVisibility(View.VISIBLE);
            loading.setVisibility(View.GONE);
        }
    }
}
