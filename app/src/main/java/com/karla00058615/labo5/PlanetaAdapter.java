package com.karla00058615.labo5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by UCA on 16/04/2018.
 */

public class PlanetaAdapter extends RecyclerView.Adapter<PlanetaAdapter.PlanetViewHolder>{
    Context mCtx;
    List<Planetas> planetasList;


    public PlanetaAdapter(Context context, List<Planetas> list){
        this.mCtx = context;
        planetasList = list;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.layout2, parent);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.textTiltle.setText(planetasList.get(position).getNombre());
        holder.textDescription.setText(planetasList.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return planetasList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView textTiltle, textDescription;

        public PlanetViewHolder(View itemView) {
            super(itemView);

            textTiltle = itemView.findViewById(R.id.textTitle);
            textDescription = itemView.findViewById(R.id.textDescription);
        }
    }
}
