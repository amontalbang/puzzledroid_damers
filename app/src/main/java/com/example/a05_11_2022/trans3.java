package com.example.a05_11_2022;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class trans3 extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_trans3, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Juego completado");

        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_trans3_to_FirstFragment);
            }

            ConexionSQLite conn = new ConexionSQLite(this, "Puntuaciones", null, 1);

        });
        return view;
    }

}