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

import com.nayanjai.duhelper.FullView;
import com.nayanjai.duhelper.R;

public class UG_PYQ_LINKS_ADAPTER extends RecyclerView.Adapter<UG_PYQ_LINKS_ADAPTER.CustomHolder> {

    Context context;
    String[] title;
    String[] urlLink;

    public UG_PYQ_LINKS_ADAPTER(Context context, String[] title, String[] urlLink) {
        this.context = context;
        this.title = title;
        this.urlLink = urlLink;
    }



    @NonNull
    @Override
    public UG_PYQ_LINKS_ADAPTER.CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ug_pyq_links_listitem,parent,false);

        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UG_PYQ_LINKS_ADAPTER.CustomHolder holder, int position) {

        String title1= title[position];
        String urls = urlLink[position];

        holder.textView.setText(title1);

        holder.cardView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( context, FullView.class );

                intent.putExtra("url",urls);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity ( intent );
            }
        } );
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {

        TextView textView;
        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            cardView =  itemView.findViewById(R.id.ug_pyq_content_cardview);
            textView =  itemView.findViewById(R.id.pyq_title_links_body);
        }
    }
}
