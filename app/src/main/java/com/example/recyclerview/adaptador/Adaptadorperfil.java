package com.example.recyclerview.adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.classVO.perrosVO;

import java.util.ArrayList;

public class Adaptadorperfil extends RecyclerView.Adapter<Adaptadorperfil.ViewHolderperfil> {

    ArrayList<perrosVO> listaperfil;
    View view;
    Activity activity;

    public Adaptadorperfil(ArrayList<perrosVO> listaperfil, Activity activity) {
        this.listaperfil = listaperfil;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolderperfil onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.perfil_perro, null);

        ViewHolderperfil viewHolderperfil = new ViewHolderperfil(view);

        return viewHolderperfil;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderperfil holder, int position) {

        holder.tv_ranking.setText(Integer.valueOf(listaperfil.get(position).getRanking()).toString());


    }


    @Override
    public int getItemCount() {
        return listaperfil.size();
    }

    public class ViewHolderperfil extends RecyclerView.ViewHolder {
        ImageView iv_perfil;
        ImageView iv_hueso;
        TextView tv_ranking;
        public ViewHolderperfil(@NonNull View itemView) {

            super(itemView);

            iv_perfil = (ImageView) itemView.findViewById(R.id.imageView);
            iv_hueso = (ImageView) itemView.findViewById(R.id.iv_hueso);
            tv_ranking = (TextView) itemView.findViewById(R.id.tv_ranking);
        }
    }
}
