package com.nayanjai.duhelper.EBOOKS.UG.ADAPTERS;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.nayanjai.duhelper.EBOOKS.UG.UG_EBK_PAPERS;
import com.nayanjai.duhelper.PYQ.UG.UG_PYQ_PAPERS;
import com.nayanjai.duhelper.R;

public class UG_EBK_COURSE_ADAPTER extends RecyclerView.Adapter<UG_EBK_COURSE_ADAPTER.CustomHolder> {

    Context ebkcontext;
    String[] ebkcoursestitle;

    public UG_EBK_COURSE_ADAPTER(Context ebkcontext, String[] ebkcoursestitle) {
        this.ebkcontext = ebkcontext;
        this.ebkcoursestitle = ebkcoursestitle;
    }



    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ebkcontext).inflate(R.layout.ug_ebk_courses_listitem,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {

        String ebkcoursestitle1 =ebkcoursestitle[position];

        holder.textView.setText(ebkcoursestitle1);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ebkcontext, UG_EBK_PAPERS.class);

                intent.putExtra("ebkcoursesclasses",ebkcoursestitle1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                ebkcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ebkcoursestitle.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_ebk_courses_title);
            cardView = itemView.findViewById(R.id.ug_ebk_courses_cardview);
        }
    }
}

