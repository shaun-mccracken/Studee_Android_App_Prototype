package com.example.study;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private static final String TAG = "HomeFragment";

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<String> hmwk = new ArrayList<>();
        hmwk.add("Final Pitch Material(s)");
        hmwk.add("Design 28 - Presentations (1)");
        hmwk.add("Solidworks 8 -'16' PROJECT");
        hmwk.add("Design 29 - Presentations (2)");
        hmwk.add("26:27 - Presentation Professionalism");

        ListView listView = (ListView) view.findViewById(R.id.theList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                hmwk);
        listView.setAdapter(adapter);

        return view;
    }


}
