package com.example.recyclerviewdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ArticleDetailActivity extends AppCompatActivity {
    public static final String EXTRA_TITLE = "article_title";
    public static final String EXTRA_CONTENT = "article_content";
    public static final String EXTRA_IMAGE = "article_image";
    public static final String EXTRA_VIEWS = "article_views";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        ImageView imgCourse = findViewById(R.id.imgDetailCourse);
        TextView tvTitle = findViewById(R.id.tvDetailTitle);
        TextView tvContent = findViewById(R.id.tvDetailContent);
        TextView tvViews = findViewById(R.id.tvDetailViews);
        Button btnBack = findViewById(R.id.btnBack);

        // Đọc dữ liệu được gửi từ bài viết vừa nhấn trong danh sách.
        tvTitle.setText(getIntent().getStringExtra(EXTRA_TITLE));
        tvContent.setText(getIntent().getStringExtra(EXTRA_CONTENT));
        tvViews.setText("Lượt xem: " + getIntent().getIntExtra(EXTRA_VIEWS, 0));
        imgCourse.setImageResource(getIntent().getIntExtra(EXTRA_IMAGE, 0));
        imgCourse.setContentDescription(tvTitle.getText());
        btnBack.setOnClickListener(view -> finish());
    }
}
