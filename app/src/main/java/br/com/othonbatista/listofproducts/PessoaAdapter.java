package br.com.othonbatista.listofproducts;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.PessoaViewHolder>{

    private final List<Pessoa> pessoas;

    PessoaAdapter(List<Pessoa> pessoas){
        this.pessoas = pessoas;
    }

    public static class PessoaViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomeView;
        private final TextView idadeView;
        private final ImageView fotoView;

        PessoaViewHolder(View itemView) {
            super(itemView);
            nomeView = itemView.findViewById(R.id.person_name);
            idadeView = itemView.findViewById(R.id.person_age);
            fotoView = itemView.findViewById(R.id.person_photo);
        }
    }

    @NonNull
    @Override
    public PessoaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new PessoaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PessoaViewHolder viewHolder, int i) {
        viewHolder.nomeView.setText(pessoas.get(i).getNome());
        viewHolder.idadeView.setText(pessoas.get(i).getIdade());
        viewHolder.fotoView.setImageResource(pessoas.get(i).getFotoId());
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }
}
