package com.example.random;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView; // Thêm import cho ImageView
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy View chính của màn hình
        View view = this.getWindow().getDecorView();

        // Tạo màu ngẫu nhiên
        Random random = new Random();
        int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Đặt màu nền cho View
        view.setBackgroundColor(color);

        // Lấy ImageView từ layout
        ImageView imageView = findViewById(R.id.myImageView);

        // Mảng chứa các icon drawable id
        int[] icons = {
                R.drawable.icon1,
                R.drawable.icon2,
                R.drawable.icon3,

        };

        // Tạo một số ngẫu nhiên để chọn icon
        int randomIcon = icons[random.nextInt(icons.length)];

        // Đặt icon ngẫu nhiên cho ImageView
        imageView.setImageResource(randomIcon);
    }
}
