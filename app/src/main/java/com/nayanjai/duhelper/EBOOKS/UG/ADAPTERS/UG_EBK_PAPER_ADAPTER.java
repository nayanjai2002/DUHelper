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

import com.nayanjai.duhelper.EBOOKS.UG.UG_EBK_LINKS;
import com.nayanjai.duhelper.PYQ.UG.UG_PYQ_LINKS;
import com.nayanjai.duhelper.R;

public class UG_EBK_PAPER_ADAPTER extends RecyclerView.Adapter<UG_EBK_PAPER_ADAPTER.CHolder> {

    Context context;
    String [] ebkpaperstitle;

    public UG_EBK_PAPER_ADAPTER(Context context, String[] ebkpaperstitle) {
        this.context = context;
        this.ebkpaperstitle = ebkpaperstitle;
    }

    @NonNull
    @Override
    public CHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.ug_ebk_papers_listitem,parent,false);
        return new CHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CHolder holder, int position) {

        String ebkpaperstitle1 = ebkpaperstitle[position];


       holder.textView.setText(ebkpaperstitle1);
        holder.cardView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( context, UG_EBK_LINKS.class );

                intent.putExtra("ebkpapersclasses",ebkpaperstitle1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity ( intent );
            }
        } );

    }

    @Override
    public int getItemCount() {
        return ebkpaperstitle.length;
    }

    public class CHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public CHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_ebk_papers_title);
            cardView = itemView.findViewById(R.id.ug_ebk_papers_cardview);
        }
    }
}
