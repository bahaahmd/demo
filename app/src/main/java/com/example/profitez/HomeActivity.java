package com.example.profitez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView,recyclerView2;

    Produit_Populaire_Adapter adapter;
    Produit_Nouveautés_Adapter adapter_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ArrayList<Produit_Populaires>list=new ArrayList<>();
        list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        setPopularRecycler(list);
        ArrayList<Produit_Populaires>news_list=new ArrayList<>();
        news_list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        news_list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        news_list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        news_list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        news_list.add(new Produit_Populaires("Sneakers",R.drawable.sneakers,"7000 DA","4000 DA","Jusqu'au 25 Mai","Good"));
        setNouveautéRecycler(news_list);


    }
    private void setPopularRecycler(ArrayList<Produit_Populaires> list)
    {
        recyclerView=findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Produit_Populaire_Adapter(this,list);
        recyclerView.setAdapter(adapter);

    }
    private void setNouveautéRecycler(ArrayList<Produit_Populaires> news_list)
    {
        recyclerView2=findViewById(R.id.recyclerView_2);
        GridLayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),2);
        recyclerView2.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter_new=new Produit_Nouveautés_Adapter(this,news_list);
        recyclerView2.setAdapter(adapter_new);

    }

}