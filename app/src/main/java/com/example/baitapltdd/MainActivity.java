package com.example.baitapltdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// Đã loại bỏ EdgeToEdge khỏi các imports không cần thiết

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Bỏ EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // ********** CODE BỔ SUNG LOGIC CHUYỂN MÀN HÌNH **********

        // 1. Tìm nút "Create Account"
        Button btnGoToCreateAccount = findViewById(R.id.button_go_to_create_account);

        // 2. Thiết lập sự kiện click
        btnGoToCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo Intent để chuyển sang CreateAccountActivity
                Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        // *************************************************************

        // Đã XÓA hoàn toàn phần ViewCompat.setOnApplyWindowInsetsListener
        // (Phần này gây ra lỗi tìm kiếm ID 'main')
    }
}