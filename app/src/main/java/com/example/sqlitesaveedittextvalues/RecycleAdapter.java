package com.example.sqlitesaveedittextvalues;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.Myholder> {
    List<DataModel> dataModelArrayList;

    public RecycleAdapter(List<DataModel> dataModelArrayList) {
        this.dataModelArrayList = dataModelArrayList;
    }

    class Myholder extends RecyclerView.ViewHolder{
        TextView name,city,country,country2;

        public Myholder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name1);
            city = (TextView) itemView.findViewById(R.id.city1);
            country = (TextView) itemView.findViewById(R.id.country1);
            country2 = (TextView) itemView.findViewById(R.id.country2);
        }
    }


    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,null);
        return new Myholder(view);

    }



    @Override
    public void onBindViewHolder(Myholder holder, int position) {
        DataModel dataModel=dataModelArrayList.get(position);
        holder.name.setText(dataModel.getName());
        holder.city.setText(dataModel.getCity());
        holder.country.setText(dataModel.getCounty());
        holder.country2.setText(dataModel.getCompany());

    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }
}
