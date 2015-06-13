package com.pratamawijaya.infocuacadangempaterkini.view.cuaca;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pratamawijaya.infocuacadangempaterkini.R;
import com.pratamawijaya.infocuacadangempaterkini.model.Row;
import com.pratamawijaya.infocuacadangempaterkini.presenter.CuacaViewPresenter;
import com.pratamawijaya.infocuacadangempaterkini.view.cuaca.adapter.CuacaAdapter;
import com.pratamawijaya.infocuacadangempaterkini.view.cuaca.interfaces.iCuacaView;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CuacaViewFragment extends Fragment implements iCuacaView {

    @InjectView(R.id.recylerView)
    RecyclerView recyclerView;

    private CuacaViewPresenter presenter;
    private CuacaAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cuaca_view, container, false);
        ButterKnife.inject(this, v);

        presenter = new CuacaViewPresenter(this);

        setupRecyclerView();

        presenter.loadData();

        return v;
    }

    private void setupRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }


    @Override
    public void loadData(List<Row> cuacaList) {
        adapter = new CuacaAdapter(getActivity(), cuacaList);
        recyclerView.setAdapter(adapter);
    }
}
