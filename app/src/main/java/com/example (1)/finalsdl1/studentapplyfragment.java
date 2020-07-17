package com.example.finalsdl1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class studentapplyfragment extends Fragment {

    private EditText Activity_id;
    private Button Button_apply;
    public studentapplyfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_studentapplyfragment, container, false);
        Activity_id=view.findViewById(R.id.student_apply_for_internship);
        Button_apply=view.findViewById(R.id.student_apply_for_internship);
        Button_apply.setOnClickListener(view)


        return view;
    }

}
