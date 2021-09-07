package com.nayanjai.duhelper.PYQ.UG.ADAPTERS;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nayanjai.duhelper.R;

import java.util.List;

public class UG_PYQ_MAINADAPTER extends RecyclerView.Adapter<UG_PYQ_MAINADAPTER.ViewHolder> {

    List<SECTION> SECTIONList;

    public UG_PYQ_MAINADAPTER(List<SECTION> SECTIONList) {
        this.SECTIONList = SECTIONList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.ug_pyq_sectionrow_listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        SECTION section = SECTIONList.get(position);
        String sectionName = section.getSectionName();
        List<String> items = section.getSectionItems();

        holder.sectionNameTextView.setText(sectionName);

        UG_PYQ_CHILDADPATER UGPYQCHILDADPATER = new UG_PYQ_CHILDADPATER(items);
        holder.childRecyclerView.setAdapter(UGPYQCHILDADPATER);

    }

    @Override
    public int getItemCount() {
        return SECTIONList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView sectionNameTextView;
        RecyclerView childRecyclerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sectionNameTextView = itemView.findViewById(R.id.sectionNameTextView);
            childRecyclerView = itemView.findViewById(R.id.childRecyclerView);
        }
    }
}
