package com.pratamawijaya.infocuacadangempaterkini.view.gempa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pratamawijaya.infocuacadangempaterkini.R;
import com.pratamawijaya.infocuacadangempaterkini.model.Gempa;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by pratama on 6/13/15.
 */
public class GempaAdapter extends RecyclerView.Adapter<GempaAdapter.GempaHolder> {

    private Context context;
    private List<Gempa> gempaList;

    public GempaAdapter(Context context, List<Gempa> gempaList) {
        this.context = context;
        this.gempaList = gempaList;
    }

    @Override
    public GempaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_gempa, parent, false);
        return new GempaHolder(v);
    }

    @Override
    public void onBindViewHolder(GempaHolder holder, int position) {

        holder.lokasi.setText("" + gempaList.get(position).getWilayah());
        holder.bujur.setText("" + gempaList.get(position).getLintang() + "," + gempaList.get(position).getBujur());
        holder.jamTanggal.setText("" + gempaList.get(position).getTanggal() + " " + gempaList.get(position).getJam());
        holder.scala.setText("" + gempaList.get(position).getMagnitude());
        holder.kedalaman.setText("Kedalaman : " +gempaList.get(position).getKedalaman());

    }

    @Override
    public int getItemCount() {
        return gempaList.size();
    }

    public class GempaHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.scala_gempa)
        TextView scala;
        @InjectView(R.id.lokasi)
        TextView lokasi;
        @InjectView(R.id.bujur)
        TextView bujur;
        @InjectView(R.id.jam_tanggal)
        TextView jamTanggal;
        @InjectView(R.id.kedalaman)
        TextView kedalaman;

        public GempaHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }
    }

}
