package com.blogspot.yourfavoritekaisar.learnfragmentimastudio.ui.recycler;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.yourfavoritekaisar.learnfragmentimastudio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {

    RecyclerView recyclerView;


    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_Negara);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//      recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
