package com.nayanjai.duhelper.SYLLABUS.CustomAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_LINKS;

public class CustomAdapterPapers extends RecyclerView.Adapter<CustomAdapterPapers.CustomHolder> {

    Context context;
    String [] paperstitle;


    public CustomAdapterPapers(Context context, String[] paperstitle) {
        this.context = context;
        this.paperstitle = paperstitle;

    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.ug_syl_papers_listitem,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder customHolder, int position) {

        String paperstitle1 = paperstitle[position];


        customHolder.textView.setText(paperstitle1);
        customHolder.cardView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( context, UG_SYL_LINKS.class );

                intent.putExtra("papersclasses",paperstitle1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity ( intent );
            }
        } );


    }

    @Override
    public int getItemCount() {
        return paperstitle.length;
    }


    class CustomHolder extends  RecyclerView.ViewHolder{
        TextView textView;
        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_syl_papers_title);
            cardView = itemView.findViewById(R.id.ug_syl_papers_cardview);
        }
    }
}



