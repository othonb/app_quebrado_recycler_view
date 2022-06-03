package br.com.othonbatista.listofproducts;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private List<Pessoa> pessoasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adicionaPessoas();

        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        PessoaAdapter adapter = new PessoaAdapter(pessoasList);
        rv.setAdapter(adapter);
    }

    private void adicionaPessoas() {

        pessoasList = new ArrayList<>();

        pessoasList.add(new Pessoa(
                "Fulano de Tal",
                "30",
                R.drawable.ic_launcher_foreground
        ));

        pessoasList.add(new Pessoa(
                "Sicrano",
                "32",
                R.drawable.ic_launcher_background
        ));

        pessoasList.add(new Pessoa(
                "Beltrano",
                "19",
                R.drawable.ic_launcher_foreground
        ));

    }
}