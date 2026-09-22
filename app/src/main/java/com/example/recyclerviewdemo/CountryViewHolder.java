package com.example.recyclerviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    public interface OnArticleClickListener {
        void onArticleClick(int position);
    }

    public final TextView tvTitle;
    public final TextView tvContent;
    public final TextView tvViews;
    public final ImageView imgCourse;

    public CountryViewHolder(@NonNull View itemView,
                             @NonNull OnArticleClickListener clickListener) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvContent = itemView.findViewById(R.id.tvContent);
        tvViews = itemView.findViewById(R.id.tvViews);
        imgCourse = itemView.findViewById(R.id.imgCourse);
        // Lấy vị trí hiện tại vì ViewHolder có thể được tái sử dụng.
        itemView.setOnClickListener(view -> {
            int position = getBindingAdapterPosition();
            if (position == RecyclerView.NO_POSITION) {
                return;
            }
            clickListener.onArticleClick(position);
        });
    }
}
