package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.MyAdapter.MyAdapter;
import com.example.recyclerview.appDesign.appDesign;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<appDesign> listMhs = new ArrayList<>();
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        recyclerView = findViewById(R.id.recyclerView);
        listMhs.add(new appDesign(R.drawable.amiii, "Abmi Sukma Edri", "12250120341"));
        listMhs.add(new appDesign(R.drawable.ahmed, "Ahmad Kurniawan", "12250111514"));
        listMhs.add(new appDesign(R.drawable.aufa, "Aufa Hajati", "12250120338"));
        listMhs.add(new appDesign(R.drawable.dapin, "Daffa Finanda", "12250111603"));
        listMhs.add(new appDesign(R.drawable.dafuq, "Daffa Ikhwan Nurfauzan", "12250110979"));
        listMhs.add(new appDesign(R.drawable.jelita, "Dwi Jelita Adliyah", "12250120331"));
        listMhs.add(new appDesign(R.drawable.dwik, "Dwi Mahdini", "12250111298"));
        listMhs.add(new appDesign(R.drawable.fajri, "Fajri", "12250110382"));
        listMhs.add(new appDesign(R.drawable.fakhri, "Fakhri", "12250111381"));
        listMhs.add(new appDesign(R.drawable.farras, "Farras Lathief", "12250111328"));
        listMhs.add(new appDesign(R.drawable.gilang, "Gilang Ramadhan I", "12250111323"));
        listMhs.add(new appDesign(R.drawable.hafidz, "Hafidz A. Rahman", "12250111794"));
        listMhs.add(new appDesign(R.drawable.aldy, "Haritsah Naufaldy", "12250110361"));
        listMhs.add(new appDesign(R.drawable.nabil, "M. Nabil Dawami", "12250111527"));
        listMhs.add(new appDesign(R.drawable.zaki, "Muh. Zaki Erbai S", "12250111134"));
        listMhs.add(new appDesign(R.drawable.adit, "M. Aditya Rinaldi", "12250111048"));
        listMhs.add(new appDesign(R.drawable.dms, "M. Dhimas Hadid F", "12250111231"));
        listMhs.add(new appDesign(R.drawable.faruqhz, "Muhammad Faruq", "12250111791"));
        listMhs.add(new appDesign(R.drawable.rafly, "M. Rafly Wirayudha", "12250111489"));
        listMhs.add(new appDesign(R.drawable.nurika, "Nurika Dwi Wahyuni", "12250120360"));
        listMhs.add(new appDesign(R.drawable.ogi, "Ogya Secio Noegroho S", "12250111346"));
        listMhs.add(new appDesign(R.drawable.rahma, "Rahma Laksita", "12250124357"));
        listMhs.add(new appDesign(R.drawable.srya, "Surya Hidayatullah F", "12250111759"));

        MyAdapter myAdapter = new MyAdapter(listMhs, this);
        recyclerView.setAdapter(myAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
