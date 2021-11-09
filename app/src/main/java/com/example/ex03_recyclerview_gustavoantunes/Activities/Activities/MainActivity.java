package com.example.ex03_recyclerview_gustavoantunes.Activities.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.ex03_recyclerview_gustavoantunes.Activities.Adapters.Adaptador;
import com.example.ex03_recyclerview_gustavoantunes.Activities.Model.Diretorio;
import com.example.ex03_recyclerview_gustavoantunes.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Diretorio> pastas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        criarObjetos();
        Adaptador adaptador = new Adaptador(pastas);
        recyclerView.setAdapter(adaptador);
    }

    private void criarObjetos(){
        Diretorio dir;

        dir = new Diretorio("Músicas", "Criado em 11/06/2020", true);
        pastas.add(dir);
        dir = new Diretorio("Filmes", "Criado em 11/06/2020", true);
        pastas.add(dir);
        dir = new Diretorio("Documentos", "Criado em 11/06/2020", true);
        pastas.add(dir);
        dir = new Diretorio("Tutoriais", "Criado em 11/06/2020", true);
        pastas.add(dir);
        dir = new Diretorio("Jogos", "Criado em 11/06/2020", false);
        pastas.add(dir);
        dir = new Diretorio("Dados", "Criado em 11/06/2020", false);
        pastas.add(dir);
        dir = new Diretorio("Clientes", "Criado em 11/06/2020", true);
        pastas.add(dir);
        dir = new Diretorio("Planilhas", "Criado em 11/06/2020", true);
        pastas.add(dir);
    }
}