package com.abhishekchoksi.calculatorfragmentapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_1, container, false);

        Button plus = view.findViewById(R.id.plus);
        Button minus = view.findViewById(R.id.minus);
        Button mul = view.findViewById(R.id.multiply);
        Button div = view.findViewById(R.id.division);
        EditText no1 = view.findViewById(R.id.txtno1);
        EditText no2 = view.findViewById(R.id.txtno2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                int n1 = Integer.parseInt(no1.getText().toString());
                int n2 = Integer.parseInt(no2.getText().toString());
                int sum = n1+n2;
                result.putString("df1", String.valueOf(sum));
                getParentFragmentManager().setFragmentResult("dataframe1",result);
                no1.setText("");
                no2.setText("");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                int n1 = Integer.parseInt(no1.getText().toString());
                int n2 = Integer.parseInt(no2.getText().toString());
                int sub = n1-n2;
                result.putString("df1", String.valueOf(sub));
                getParentFragmentManager().setFragmentResult("dataframe1",result);
                no1.setText("");
                no2.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                int n1 = Integer.parseInt(no1.getText().toString());
                int n2 = Integer.parseInt(no2.getText().toString());
                int mul = n1*n2;
                result.putString("df1", String.valueOf(mul));
                getParentFragmentManager().setFragmentResult("dataframe1",result);
                no1.setText("");
                no2.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                int n1 = Integer.parseInt(no1.getText().toString());
                int n2 = Integer.parseInt(no2.getText().toString());
                int div = n1/n2;
                result.putString("df1", String.valueOf(div));
                getParentFragmentManager().setFragmentResult("dataframe1",result);
                no1.setText("");
                no2.setText("");
            }
        });
        return view;
    }
}