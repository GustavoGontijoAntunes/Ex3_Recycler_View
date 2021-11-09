package com.example.ex03_recyclerview_gustavoantunes.Activities.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ex03_recyclerview_gustavoantunes.Activities.Model.Diretorio;
import com.example.ex03_recyclerview_gustavoantunes.R;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    private List<Diretorio> diretorios = new ArrayList<>();

    public Adaptador(List<Diretorio> diretorios) {
        this.diretorios = diretorios;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Diretorio dir = diretorios.get(position);
        holder.txtData.setText(dir.getDirModDescricao());
        holder.txtNome.setText(dir.getDirNome());
        holder.posicao = position;

        if(!dir.isDir()){
            holder.imgIcone.setImageResource(R.drawable.ic_baseline_insert_drive_file_24);
        }
        holder.posicao = position;
    }

    @Override
    public int getItemCount() {
        return diretorios.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtNome, txtData;
        ImageView imgIcone, imgMore;
        int posicao;

        public MyViewHolder(View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            txtData = itemView.findViewById(R.id.txtData);
            imgIcone = itemView.findViewById(R.id.imgIcon);
            imgMore = itemView.findViewById(R.id.imgMore);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Deseja abrir " + diretorios.get(posicao).getDirNome() + "?", Toast.LENGTH_SHORT).show();
                }
            });

            imgMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Mais informações.", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
