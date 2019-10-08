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
public class GroupsFragment extends Fragment {


    public GroupsFragment() {
        // Required empty public constructor
    }


    ImageButton send;
    EditText txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_groups, container, false);

        txt = (EditText) view.findViewById(R.id.findPerson);
        ListView listView = (ListView) view.findViewById(R.id.contacts);
        send = (ImageButton) view.findViewById(R.id.search);

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Matt J");
        contacts.add("Madi G");
        contacts.add("Shaun M");
        contacts.add("Taylor B");
        contacts.add("Cedric H");
        contacts.add("Adam B");
        contacts.add("Maddy K");
        contacts.add("Sam S");
        contacts.add("Drake H");
        contacts.add("Nick P");
        contacts.add("Christian M");
        contacts.add("John G");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                contacts);
        listView.setAdapter(adapter);

        return view;
    }
}