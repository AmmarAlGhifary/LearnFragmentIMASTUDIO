package com.blogspot.yourfavoritekaisar.learnfragmentimastudio.ui.recycler;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.yourfavoritekaisar.learnfragmentimastudio.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    int [] gambar = {R.drawable.kingdomitaly,
                     R.drawable.thirdreich,
                     R.drawable.ussr};

    String [] negara = {"Kingdom Of Italy",
                        "Third Reich",
                        "Soviets"};

    Context context;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
    }


    // TODO Onreate view holder berguna untuk menampilkan view yg bakal di tampilkan
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_recycle, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.img.setImageResource(gambar[i]);
        viewHolder.txt.setText(negara[i]);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,DetailActivity.class);
                pindah.putExtra("GAMBAR", gambar[i]);
                pindah.putExtra("TEXT", negara[i]);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return negara.length;
    }


    // TODO deklarasi widget yang ada di layout list yg di xml
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Memanggil id dengan paramente
            img = itemView.findViewById(R.id.img_Negara);
            txt = itemView.findViewById(R.id.txt_Negara);
        }
    }
}
