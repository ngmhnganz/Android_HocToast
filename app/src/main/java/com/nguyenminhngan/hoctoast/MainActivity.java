package com.nguyenminhngan.hoctoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nguyenminhngan.hoctoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        addEvents();
    }

    private void addEvents() {
        binding.btnToastLong.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int a=1;
                xuLyToastLong();
            }
        });
        binding.btnToastShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyToastShort();
            }
        });
    }

    private void xuLyToastLong() {
        Toast.makeText(MainActivity.this,"Xin chào ban",Toast.LENGTH_LONG).show();
    }

    private void xuLyToastShort() {
        Toast.makeText(MainActivity.this,"Xin chào bạn",Toast.LENGTH_SHORT).show();
    }
}
