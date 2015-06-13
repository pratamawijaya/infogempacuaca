package com.pratamawijaya.infocuacadangempaterkini.view.cuaca.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pratamawijaya.infocuacadangempaterkini.R;
import com.pratamawijaya.infocuacadangempaterkini.model.Row;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by pratama on 6/13/15.
 */
public class CuacaAdapter extends RecyclerView.Adapter<CuacaAdapter.CuacaHolder> {
    private static final String HUJAN_RINGAN = "Hujan Ringan";
    private static final String BERAWAN = "Berawan";
    private static final String CERAH_BERAWAN = "Cerah Berawan";
    private static final String HUJAN_SEDANG = "Hujan Sedang";
    private Context context;
    private List<Row> listCuaca;

    public CuacaAdapter(Context context, List<Row> listCuaca) {
        this.context = context;
        this.listCuaca = listCuaca;
    }

    @Override
    public CuacaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_cuaca, parent, false);
        return new CuacaHolder(v);
    }

    @Override
    public void onBindViewHolder(CuacaHolder holder, int position) {
        holder.kota.setText("" + listCuaca.get(position).getKota());

        holder.detailCuaca.setText(""+listCuaca.get(position).getCuaca());

        holder.suhu.setText(listCuaca.get(position).getSuhuMin()+"/"+listCuaca.get(position).getSuhuMax());


        if (listCuaca.get(position).getCuaca().equals(HUJAN_RINGAN)) {
            holder.icon.setImageResource(R.drawable.hujan_ringan);
        } else if (listCuaca.get(position).getCuaca().equals(BERAWAN)) {
            holder.icon.setImageResource(R.drawable.berawan);
        } else if (listCuaca.get(position).getCuaca().equals(CERAH_BERAWAN)) {
            holder.icon.setImageResource(R.drawable.cerah_berawan);
        } else if (listCuaca.get(position).getCuaca().equals(HUJAN_SEDANG)) {
            holder.icon.setImageResource(R.drawable.hujan_ringan);
        }
    }

    @Override
    public int getItemCount() {
        return listCuaca.size();
    }

    public class CuacaHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.kota)
        TextView kota;
        @InjectView(R.id.icon)
        ImageView icon;
        @InjectView(R.id.detailcuaca)
        TextView detailCuaca;
        @InjectView(R.id.suhu)
        TextView suhu;

        public CuacaHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }
    }
}
