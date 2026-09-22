package com.example.recyclerviewdemo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private final List<Article> articleList;

    public MyAdapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.country_layout, parent, false);
        return new CountryViewHolder(itemView, position -> {
            Article article = articleList.get(position);
            article.setViews(article.getViews() + 1);
            // Báo RecyclerView vẽ lại bài viết vừa được nhấn.
            notifyItemChanged(position);

            // Gửi dữ liệu bài viết sang màn hình chi tiết sau khi tăng lượt xem.
            Intent intent = new Intent(itemView.getContext(), ArticleDetailActivity.class);
            intent.putExtra(ArticleDetailActivity.EXTRA_TITLE, article.getTitle());
            intent.putExtra(ArticleDetailActivity.EXTRA_CONTENT, article.getContent());
            intent.putExtra(ArticleDetailActivity.EXTRA_IMAGE, article.getImgCourse());
            intent.putExtra(ArticleDetailActivity.EXTRA_VIEWS, article.getViews());
            itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Article article = articleList.get(position);
        holder.tvTitle.setText(article.getTitle());
        holder.tvContent.setText(article.getContent());
        holder.tvViews.setText("Lượt xem: " + article.getViews());
        holder.imgCourse.setImageResource(article.getImgCourse());
        holder.imgCourse.setContentDescription(article.getTitle());
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }
}
