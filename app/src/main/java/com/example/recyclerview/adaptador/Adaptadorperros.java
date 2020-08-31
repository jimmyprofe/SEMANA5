package com.example.recyclerview.adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.classVO.perrosVO;

import java.util.ArrayList;

public class Adaptadorperros extends RecyclerView.Adapter<Adaptadorperros.ViewHolderperros> {

    ArrayList<perrosVO> listaperros;
    View view;
    Activity activity;

    public Adaptadorperros(ArrayList<perrosVO> listaperros, Activity activity) {
        this.listaperros = listaperros;
        this.activity = activity;
    }


    @NonNull
    @Override
    public ViewHolderperros onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coleccion_perros, null, false);

        ViewHolderperros viewHolderperros = new ViewHolderperros(view);


        return viewHolderperros;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderperros holder, final int position) {

        holder.iv_foto.setImageResource(listaperros.get(position).getFoto());
        holder.tv_nombre.setText(listaperros.get(position).getNombre().toString());
        holder.tv_ranking.setText(Integer.valueOf(listaperros.get(position).getRanking()).toString());

        holder.iv_huesoblanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Soy tu favorito, me llamo " + listaperros.get(position).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.iv_huesoamarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Mi raiting es " + listaperros.get(position).getRanking(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaperros.size();
    }

    public class ViewHolderperros extends RecyclerView.ViewHolder {

        private ImageView iv_foto;
        private TextView tv_nombre;
        private TextView tv_ranking;
        private ImageView iv_huesoblanco, iv_huesoamarillo;


        public ViewHolderperros(@NonNull View itemView) {
            super(itemView);

            iv_foto = (ImageView) itemView.findViewById(R.id.iv_foto);
            tv_nombre = (TextView) itemView.findViewById(R.id.tv_nombre);
            tv_ranking = (TextView) itemView.findViewById(R.id.tv_ranking);
            iv_huesoblanco = (ImageView) itemView.findViewById(R.id.iv_huesoblanco);
            iv_huesoamarillo = (ImageView) itemView.findViewById(R.id.iv_huesoamarillo);


        }
    }
}
