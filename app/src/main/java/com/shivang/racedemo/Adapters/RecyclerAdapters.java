package com.shivang.racedemo.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shivang.racedemo.Models.Race;
import com.shivang.racedemo.R;

import java.util.List;

public class RecyclerAdapters extends RecyclerView.Adapter<RecyclerAdapters.viewHolder>
{
    private Context context;
    private List<Race> list;

    public RecyclerAdapters(Context context,List<Race> list) {
        this.context = context;
        this.list=list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.recycler_row,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        Race race=list.get(position);
        holder.race_name.setText(race.getRace_name());
        holder.race_organiser.setText(race.getRace_organizer());
        holder.race_guntime.setText(race.getRace_guntime());
        holder.race_type.setText(race.getRace_type());
        holder.race_laps.setText(race.getRace_laps());
        holder.race_dis.setText(race.getRace_distance());
        holder.race_associated.setText(race.getRace_associated());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder
    {
        TextView race_name,race_organiser,race_guntime,race_laps,race_type,race_dis,race_associated;

        public viewHolder(View itemView) {
            super(itemView);
            race_name=itemView.findViewById(R.id.race_name);
            race_organiser=itemView.findViewById(R.id.race_organizer);
            race_guntime=itemView.findViewById(R.id.race_guntime);
            race_laps=itemView.findViewById(R.id.race_laps);
            race_dis=itemView.findViewById(R.id.race_tdistance);
            race_type=itemView.findViewById(R.id.race_type);
            race_associated=itemView.findViewById(R.id.race_associated);

        }
    }
}
