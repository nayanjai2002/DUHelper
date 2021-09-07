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
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_PAPERS;

public class CustomAdapterCourses extends RecyclerView.Adapter<CustomAdapterCourses.CustomHolder> {

    Context context;
    String[] coursestitle;

    public CustomAdapterCourses(Context context, String[] coursestitle) {
        this.context = context;
        this.coursestitle = coursestitle;
    }

    @NonNull
    @Override
    public CustomAdapterCourses.CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ug_syl_courses_listitem,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapterCourses.CustomHolder customHolder, int position) {

        String coursestitle1 =coursestitle[position];

        customHolder.textView.setText(coursestitle1);
        customHolder.cardView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( context, UG_SYL_PAPERS.class );

                intent.putExtra("coursesclasses",coursestitle1);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity ( intent );
            }
        } );
    }

    @Override
    public int getItemCount() {
        return coursestitle.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ug_syl_courses_title);
            cardView = itemView.findViewById(R.id.ug_syl_courses_cardview);
        }
    }
}
