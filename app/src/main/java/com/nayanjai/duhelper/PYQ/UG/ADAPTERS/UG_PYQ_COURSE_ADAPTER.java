package com.nayanjai.duhelper.PYQ.UG.ADAPTERS;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.nayanjai.duhelper.PYQ.UG.UG_PYQ_PAPERS;
import com.nayanjai.duhelper.R;

public class UG_PYQ_COURSE_ADAPTER extends RecyclerView.Adapter<UG_PYQ_COURSE_ADAPTER.CustomHolder> {

    Context pyqcontext;
    String[] pyqcoursestitle;

    public UG_PYQ_COURSE_ADAPTER(Context pyqcontext, String[] pyqcoursestitle) {
        this.pyqcontext = pyqcontext;
        this.pyqcoursestitle = pyqcoursestitle;
    }



    @NonNull
    @Override
    public UG_PYQ_COURSE_ADAPTER.CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(pyqcontext).inflate(R.layout.ug_pyq_courses_listitem,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UG_PYQ_COURSE_ADAPTER.CustomHolder holder, int position) {

        String pyqcoursestitle1 =pyqcoursestitle[position];

        holder.textView.setText(pyqcoursestitle1);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pyqcontext, UG_PYQ_PAPERS.class);

                intent.putExtra("pyqcoursesclasses",pyqcoursestitle1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                pyqcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pyqcoursestitle.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_pyq_courses_title);
            cardView = itemView.findViewById(R.id.ug_pyq_courses_cardview);
        }
    }
}

