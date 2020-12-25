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
    private Long fraseID =0L;
    private RecyclerView recyclerView;
    private Frases fra;
    private String favoritoRec = "";


    public AdapterFrases(List<Frases> frases, Context context) {
        this.frases = frases;
        this.context = context;

    }

//    public AdapterFrases(List<Frases> frases, Context context, Long fraseID, RecyclerView recyclerView) {
//        this.frases = frases;
//        this.context = context;
//        this.fraseID = fraseID;
//        this.recyclerView = recyclerView;
//    }

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
        if(fra.getFavorito() == 0){
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

    public  Frases favorito(Long id){
        FrasesDao dao = new FrasesDao(context);
        Frases frase = new Frases();
        for(Frases fra : dao.listar()){
            if(fra.getId() == id){
             frase.setId(fra.getId());
             frase.setAutor(fra.getAutor());
             frase.setTexto(fra.getTexto());
             frase.setTitulo(fra.getTitulo());
             frase.setFavorito(fra.getFavorito());
             frase.setData_hora(fra.getData_hora());
             frase.setCategoria(fra.getCategoria());

            }
        }
        return frase;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView favorito;
        TextView txtid;
        TextView texto;
        TextView autor;
        ImageView star;
        private TextView btnCompartilhar;
        private TextView texCopiar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             txtid = itemView.findViewById(R.id.textViewID);
             texto = itemView.findViewById(R.id.fraseTexto);
             autor = itemView.findViewById(R.id.fraseAutor);
             favorito = itemView.findViewById(R.id.textViewFavorito);
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


                      Long id = Long.parseLong(txtid.getText().toString());
                    FrasesDao dao = new FrasesDao(context);
                    Frases fra = new Frases();
                    fra = ( favorito(id));
                    if(fra.getFavorito() == 0){
                       
                        fra.setFavorito(1);
                        if(dao.atualizar(fra)){

                         star.setImageResource(R.drawable.ic_estrela24);
                        }

                    }else{
                        fra.setFavorito(0);
                        if(dao.atualizar(fra)){

                        star.setImageResource(R.drawable.ic_star_24);
                        }
                    }


                }
            });


        }


    }



}
