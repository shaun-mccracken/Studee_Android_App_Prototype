package com.example.study;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ArrayList<String> option = new ArrayList<>();
        option.add("General");
        option.add("Account");
        option.add("Notifications");
        option.add("Accessibility");
        option.add("Display");
        option.add("Customization");

        ListView listView = (ListView) view.findViewById(R.id.options);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                option);
        listView.setAdapter(adapter);


        return view;
    }

}
