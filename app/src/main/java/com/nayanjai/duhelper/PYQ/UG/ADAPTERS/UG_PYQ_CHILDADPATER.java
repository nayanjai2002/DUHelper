package com.nayanjai.duhelper.PYQ.UG.ADAPTERS;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.nayanjai.duhelper.R;

import java.util.List;

public class UG_PYQ_CHILDADPATER extends RecyclerView.Adapter<UG_PYQ_CHILDADPATER.ViewHolder> {

    List<String> items;


    public UG_PYQ_CHILDADPATER(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.ug_pyq_itemrow_listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemTextView.setText(items.get(position));


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView itemTextView;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTextView = itemView.findViewById(R.id.itemTextView);
            cardView = itemView.findViewById(R.id.ug_pyq_subject_cardview);
        }
    }
}
