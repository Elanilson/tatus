package com.apkdoandroid.osstatus.adapter;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apkdoandroid.osstatus.R;
import com.apkdoandroid.osstatus.helper.DaoFrases;
import com.apkdoandroid.osstatus.helper.FrasesDao;
import com.apkdoandroid.osstatus.model.Frases;


import java.util.ArrayList;
import java.util.List;

public class AdapterFrases  extends RecyclerView.Adapter<AdapterFrases.MyViewHolder>{
    List<Frases> frases;
    Context context;
    private Frases fra;
    private Frases frase = new Frases();

    public AdapterFrases(List<Frases> frases, Context context) {
        this.frases = frases;
        this.context = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View lista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_frases,parent,false);

        return  new MyViewHolder(lista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        fra = frases.get(position);
        holder.autor.setText(fra.getAutor());
        holder.texto.setText(fra.getTexto());
        holder.txtid.setText(fra.getId().toString()+"");
        holder.categoria.setText(fra.getCategoria()+"");
        holder.dataHora.setText(fra.getData_hora()+"");

        if(fra.getFavorito() == 0){ // sem estrela
            holder.star.setImageResource(R.drawable.ic_star_24);

        }else{
            holder.star.setImageResource(R.drawable.ic_estrela24);
        }
        //fraseID= fra.getId();


    }

    @Override
    public int getItemCount() {
        return frases.size();
    }

    public void compartilhar(String autor, String texto){

        Intent intent = new Intent(Intent.ACTION_SEND);


        intent.putExtra(Intent.EXTRA_SUBJECT,autor);
        intent.putExtra(Intent.EXTRA_TEXT,texto+"\n\n -"+autor);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, "Compartilhar: "+autor));

    }

    public String copiar(String texto, String autor){
        //ClipData copia = ClipData.newPlainText(texto, autor);
        //para cópia:
        ClipboardManager clipboar = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(texto,autor);
        clipboar.setPrimaryClip(clip);

        //E cole:
        String dados = "";
        // Se contiver dados, decida se você pode manipular os dados.
        if(!(clipboar.hasPrimaryClip())){

        }else if(!(clipboar.getPrimaryClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))){
        // visto que a área de transferência contém dados, mas não é um texto simples
        }else{

            // já que a área de transferência contém texto simples.
            ClipData.Item item=  clipboar.getPrimaryClip().getItemAt(0);


            // Obtém a área de transferência como texto.
            dados = item.getText().toString();
            Toast.makeText(context, "Copiado", Toast.LENGTH_SHORT).show();

        }
        return dados;
    }

//    public  Frases favorito(Long id){
//        FrasesDao dao = new FrasesDao(context);
//        Frases frase = new Frases();
//        for(Frases fra : dao.listar()){
//            if(fra.getId() == id){
//
//
//            }
//        }
//        return frase;
//    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView favorito;
        TextView txtid;
        TextView texto;
        TextView autor;
        TextView categoria;
        TextView dataHora;
        ImageView star;
        private TextView btnCompartilhar;
        private TextView texCopiar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             txtid = itemView.findViewById(R.id.textViewID);
             texto = itemView.findViewById(R.id.fraseTexto);
             autor = itemView.findViewById(R.id.fraseAutor);
             favorito = itemView.findViewById(R.id.textViewFavorito);
             categoria = itemView.findViewById(R.id.textViewCategoria);
             dataHora = itemView.findViewById(R.id.textViewDataHora);
             star = itemView.findViewById(R.id.imageViewStar);

            btnCompartilhar = itemView.findViewById(R.id.textViewCompartilhar);
            texCopiar = itemView.findViewById(R.id.textViewCopiar);
            btnCompartilhar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    compartilhar(autor.getText().toString(),texto.getText().toString());
                }
            });
            texCopiar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    copiar(autor.getText().toString(),texto.getText().toString());
                }
            });

            favorito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Long id = Long.parseLong( txtid.getText().toString());
                    frase.setId(id);
                    frase.setAutor(autor.getText().toString());
                    frase.setTexto(texto.getText().toString());
                    frase.setData_hora(dataHora.toString());
                    frase.setCategoria(categoria.getText().toString());

//                    Toast.makeText(context, "ID :"+txtid.getText().toString(), Toast.LENGTH_SHORT).show();

                    FrasesDao dao = new FrasesDao(context);

                    if(frase.getFavorito() == 0){

                            frase.setFavorito(1);
                        if(dao.atualizar(frase)){

                            star.setImageResource(R.drawable.ic_estrela24);
                        }

                    }else{
                        frase.setFavorito(0);
                        if(dao.atualizar(frase)){
                        star.setImageResource(R.drawable.ic_star_24);
                        }
                    }


                }
            });


        }



    }



}
