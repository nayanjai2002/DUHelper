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
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_LINKS;

public class CustomAdapterCourse extends RecyclerView.Adapter<CustomAdapterCourse.CustomHolder> {

    Context context;
    String [] coursetitle;
    String [] courseclass;

    public CustomAdapterCourse(Context context, String[] coursetitle, String[] courseclass) {
        this.context = context;
        this.coursetitle = coursetitle;
        this.courseclass = courseclass;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.ug_courses_listitem,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder customHolder, int position) {

        String coursetitle1 = coursetitle[position];
        String courseclass1 = courseclass[position];

        customHolder.textView.setText(coursetitle1);
        customHolder.cardView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( context, UG_SYL_LINKS.class );

                intent.putExtra("courseclasses",courseclass1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity ( intent );
            }
        } );


    }

    @Override
    public int getItemCount() {
        return coursetitle.length;
    }


    class CustomHolder extends  RecyclerView.ViewHolder{
        TextView textView;
        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_syl_course_title);
            cardView = (CardView) itemView.findViewById(R.id.ug_syl_course_cardview);
        }
    }
}



