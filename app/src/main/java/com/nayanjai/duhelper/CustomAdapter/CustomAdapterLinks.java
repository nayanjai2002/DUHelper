package com.nayanjai.duhelper.CustomAdapter;

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

public class CustomAdapterLinks extends RecyclerView.Adapter<CustomAdapterLinks.CustomHolder> {

    Context context;
    String[] title;
    String[] urlLink;

    public CustomAdapterLinks(Context context, String[] title, String[] urlLink) {
        this.context = context;
        this.title = title;
        this.urlLink = urlLink;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ug_syl_links_listitem,viewGroup,false);

        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder customHolder, int i) {
        String title1= title[i];
        String urls = urlLink[i];

        customHolder.textView.setText(title1);

          customHolder.cardView.setOnClickListener ( new View.OnClickListener () {
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

    static class CustomHolder extends RecyclerView.ViewHolder {

        TextView textView;

        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.ug_content_cardview);
            textView = (TextView) itemView.findViewById(R.id.title_links_body);
        }
    }
}
