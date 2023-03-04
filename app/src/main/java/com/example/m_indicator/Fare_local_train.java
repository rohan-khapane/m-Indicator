package com.example.m_indicator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fare_local_train#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fare_local_train extends Fragment {
    Spinner spinner_a_to_b;
    Spinner Spinner_a_to_b2;
    ArrayList<String> allstations=new ArrayList<>();
    ArrayList<String> allstations1=new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fare_local_train() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fare_local_train.
     */
    // TODO: Rename and change types and number of parameters
    public static Fare_local_train newInstance(String param1, String param2) {
        Fare_local_train fragment = new Fare_local_train();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fare_local_train, container, false);
//        View v= inflater.inflate(R.layout.fragment_a_to__b_local, container, false);

        Spinner spinner_a_to_b=(Spinner) v.findViewById(R.id.spinner_fare_source);
        Spinner spinner_a_to_b2=(Spinner) v.findViewById(R.id.spinner_destination_fare);
        ;
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        ArrayAdapter<String> spinner_adapter=new ArrayAdapter<>(getActivity(), android.R.layout.simple_dropdown_item_1line,allstations);
        spinner_a_to_b.setAdapter(spinner_adapter);

        allstations1.add("Panvel");
        allstations1.add("csmt");
        allstations1.add("Panvel");
        allstations1.add("csmt");
        allstations1.add("Panvel");
        allstations1.add("csmt");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations1.add("Panvel");
        allstations1.add("csmt");
        ArrayAdapter<String> spinner_adapter1=new ArrayAdapter<>(getActivity(), android.R.layout.simple_dropdown_item_1line,allstations1);
        spinner_a_to_b2.setAdapter(spinner_adapter1);
        return v;
    }
}