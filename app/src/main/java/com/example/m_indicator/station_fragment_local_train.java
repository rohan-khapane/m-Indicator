package com.example.m_indicator;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link station_fragment_local_train#newInstance} factory method to
 * create an instance of this fragment.
 */
public class station_fragment_local_train extends Fragment {
    ListView lv_local_train;
    Button btn_all_stations;
    ArrayList<String> allstations=new ArrayList<>();
//    MainActivity Map;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public station_fragment_local_train() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment station_fragment_local_train.
     */
    // TODO: Rename and change types and number of parameters
    public static station_fragment_local_train newInstance(String param1, String param2) {
        station_fragment_local_train fragment = new station_fragment_local_train();
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

        View v = inflater.inflate(R.layout.fragment_station_local_train, container, false);
        ListView lv_local_train=(ListView) v.findViewById(R.id.lv_local_train);
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");
        allstations.add("Panvel");
        allstations.add("csmt");

        ArrayAdapter adapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,allstations);
        lv_local_train.setAdapter(adapter);

//        Button btn_all_stations=(Button)v.findViewById(R.id.btn_all_stations);
//        Map=(MainActivity) getActivity();
//        btn_all_stations.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getActivity(),Map.class);
//                startActivity(intent);
//            }
//        });

        return v;



    }

    private void getApplicationContext() {
    }



}