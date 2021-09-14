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

import com.nayanjai.duhelper.PYQ.UG.UG_PYQ_LINKS;
import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_LINKS;

import java.util.List;

public class UG_PYQ_PAPER_ADAPTER extends RecyclerView.Adapter<UG_PYQ_PAPER_ADAPTER.CHolder> {

    Context context;
    String [] pyqpaperstitle;

    public UG_PYQ_PAPER_ADAPTER(Context context, String[] pyqpaperstitle) {
        this.context = context;
        this.pyqpaperstitle = pyqpaperstitle;
    }

    @NonNull
    @Override
    public UG_PYQ_PAPER_ADAPTER.CHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.ug_pyq_papers_listitem,parent,false);
        return new CHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UG_PYQ_PAPER_ADAPTER.CHolder holder, int position) {

        String pyqpaperstitle1 = pyqpaperstitle[position];


       holder.textView.setText(pyqpaperstitle1);
        holder.cardView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( context, UG_PYQ_LINKS.class );

                intent.putExtra("pyqpapersclasses",pyqpaperstitle1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity ( intent );
            }
        } );

    }

    @Override
    public int getItemCount() {
        return pyqpaperstitle.length;
    }

    public class CHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public CHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_pyq_papers_title);
            cardView = itemView.findViewById(R.id.ug_pyq_papers_cardview);
        }
    }
}
