package com.example.profitez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Produit_Populaire_Adapter extends RecyclerView.Adapter<Produit_Populaire_Adapter.ProduitViewHolder> {

    Context context;
    ArrayList<Produit_Populaires> ProductPopulaireList=new ArrayList();
   

    public Produit_Populaire_Adapter(Context context,ArrayList<Produit_Populaires> list )
    {
        this.context=context;
        this.ProductPopulaireList=list;
    }

    @NonNull
    @Override
    public Produit_Populaire_Adapter.ProduitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.activity_product,parent,false);
        return new ProduitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Produit_Populaire_Adapter.ProduitViewHolder holder, final int position) {
        holder.ProductImage.setImageResource(ProductPopulaireList.get(position).getImageUrl());
        holder.price_old.setText(ProductPopulaireList.get(position).getPrice_ancien());
        holder.price_new.setText(ProductPopulaireList.get(position).getPrice_nouveau());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ProductPopulaireList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
       return ProductPopulaireList.size();
    }
    public static final class ProduitViewHolder extends RecyclerView.ViewHolder {
        ImageView ProductImage;
        TextView price_old,price_new,name,rating;
        CardView parent;

        public ProduitViewHolder(@NonNull View itemView) {
            super(itemView);
            ProductImage=itemView.findViewById(R.id.image_produit);
            price_old=itemView.findViewById(R.id.AncienPrix);
            price_new=itemView.findViewById(R.id.NouveauPrix);
            name=itemView.findViewById(R.id.Name);
            parent=itemView.findViewById(R.id.parent);



        }
}




}
