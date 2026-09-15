package com.example.recyclerviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    public final TextView tvTitle;
    public final TextView tvContent;
    public final TextView tvViews;
    public final ImageView imgCourse;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvContent = itemView.findViewById(R.id.tvContent);
        tvViews = itemView.findViewById(R.id.tvViews);
        imgCourse = itemView.findViewById(R.id.imgCourse);
        // Lấy tiêu đề đang hiển thị để đúng khi ViewHolder được tái sử dụng.
        itemView.setOnClickListener(view ->
                Toast.makeText(view.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show());
    }
}
