package com.example.timepass;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SecondFragment extends Fragment {
    View view;
    Button buttonsec;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_simple_sec,container,false);
        //get refrence of button
        buttonsec=view.findViewById(R.id.button);
        //perform setOnClickListener on first Button
        buttonsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(view.getContext(),Main2Activity.class);
                startActivity(intent);*/
               Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
