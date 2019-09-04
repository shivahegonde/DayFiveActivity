package com.example.timepass;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Test extends Fragment {
    View view;
    Button firstbutton;
    Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_simple, container, false);
        firstbutton = view.findViewById(R.id.button);
        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(view.getContext(),Main2Activity.class);
                //view.getContext() method is used for the go fragment to activity
                startActivity(intent);
                //Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}