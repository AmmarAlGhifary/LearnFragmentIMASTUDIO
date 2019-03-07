package com.blogspot.yourfavoritekaisar.learnfragmentimastudio.ui.recycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.yourfavoritekaisar.learnfragmentimastudio.R;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {


    ImageView imgDetail;
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgDetail = findViewById(R.id.img_DetailNegara);
        txtDetail = findViewById(R.id.txt_DetailNegara);

        // TODO 1 TERIMA DATA
        Intent terimaData = getIntent();
        Integer gambar = terimaData.getIntExtra("GAMBAR",0);
        String text = terimaData.getStringExtra("TEXT");

        // TODO 2 TAMPIL DATA

        imgDetail.setImageResource(gambar);
        txtDetail.setText(text);



    }
}




