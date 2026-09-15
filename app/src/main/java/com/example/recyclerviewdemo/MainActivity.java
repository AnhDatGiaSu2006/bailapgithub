package com.example.recyclerviewdemo;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button btLoad;
    private final List<Article> articleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        btLoad = findViewById(R.id.btLoad);

        // Ảnh hệ thống dùng để chạy thử; thay bằng R.drawable.ten_anh khi có ảnh thật.
        int sampleImage = android.R.drawable.ic_menu_gallery;
        articleList.add(new Article("Java cơ bản", "Làm quen với biến và kiểu dữ liệu.", sampleImage, 120));
        articleList.add(new Article("Lập trình Android", "Tạo giao diện đầu tiên với XML.", sampleImage, 95));
        articleList.add(new Article("RecyclerView", "Hiển thị danh sách có thể cuộn.", sampleImage, 210));
        articleList.add(new Article("ViewHolder", "Tái sử dụng View để cuộn mượt hơn.", sampleImage, 84));
        articleList.add(new Article("Xử lý sự kiện", "Bắt sự kiện nhấn vào từng bài viết.", sampleImage, 63));

        btLoad.setOnClickListener(view -> {
            MyAdapter adapter = new MyAdapter(articleList);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        });
    }
}
