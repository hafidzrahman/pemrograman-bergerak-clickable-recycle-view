package com.example.recyclerview.MyAdapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.MainActivity2;
import com.example.recyclerview.R;
import com.example.recyclerview.appDesign.appDesign;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    ArrayList<appDesign> listMhs;

    public MyAdapter(ArrayList<appDesign> listMhs, Context context) {
        this.listMhs = listMhs;
        this.context = context;
    }

    Context context;
    ImageView imageView;
    TextView textView;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        appDesign appdesign = listMhs.get(position);
        holder.imageView.setImageResource(appdesign.getProfileImage());
        holder.imageView.setImageResource(appdesign.getProfileImage());
        holder.textView.setText(appdesign.getProfileName());
        holder.textView1.setText(appdesign.getProfileNIM());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Student Number : "+position,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("image", listMhs.get(position).getProfileImage());
                intent.putExtra("Nama", listMhs.get(position).getProfileName());
                intent.putExtra("NIM", listMhs.get(position).getProfileNIM());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMhs.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView, textView1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.profileImage);
            textView = itemView.findViewById(R.id.profileName);
            textView1 = itemView.findViewById(R.id.profileNIM);
        }
    }

}
