package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;

    TextView v1, v2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
//        getSupportActionBar().hide();

        img = findViewById(R.id.img);
        v1 = findViewById(R.id.Name);
        v2 = findViewById(R.id.NIM);

        Intent intent = getIntent();
        String name = Objects.requireNonNull(intent.getExtras()).getString("Nama");
        String NIM = Objects.requireNonNull(intent.getExtras()).getString("NIM");
        int image = Objects.requireNonNull(intent.getExtras()).getInt("image");

        img.setImageResource(image);
        v1.setText(name);
        v2.setText(NIM);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
