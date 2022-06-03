package br.com.othonbatista.listofproducts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.PessoaViewHolder>{

    private List<Pessoa> pessoas;

    PessoaAdapter(List<Pessoa> pessoas){
        this.pessoas = pessoas;
    }

    public static class PessoaViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeView;
        private TextView idadeView;
        private ImageView fotoView;

        PessoaViewHolder(View itemView) {
            super(itemView);
            nomeView = (TextView)itemView.findViewById(R.id.person_name);
            idadeView = (TextView)itemView.findViewById(R.id.person_age);
            fotoView = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    @Override
    public PessoaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        PessoaViewHolder pvh = new PessoaViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PessoaViewHolder viewHolder, int i) {
        viewHolder.nomeVIew.setText(persons.get(i).name);
        viewHolder.idadeView.setText(persons.get(i).age);
        viewHolder.fotoView.setImageResource(persons.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }
}
