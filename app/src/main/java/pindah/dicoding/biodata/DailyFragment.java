package pindah.dicoding.biodata;

/*28-April-2019
    10116416
        Riyan Bahar
            AKB-9*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DailyFragment extends Fragment  {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ricycle, container, false);

        id.clear();
        title.clear();
        description.clear();

        id.add("1");
        title.add("Eating");
        description.add("CodeCry is a Code Repository comprised of codes from C, C++");

        id.add("2");
        title.add("Sweeping");
        description.add("Read, Enjoy And Discover technology news & information");

        id.add("3");
        title.add("Mopping");
        description.add("Techlines brings you Tech News in one line.");

        id.add("4");
        title.add("Washing dishes");
        description.add("Dictionary for Hackers. Anyone can contribute.");

        id.add("5");
        title.add("Cleaning rooms");
        description.add("Cyberchoco is an upcoming release");

        id.add("6");
        title.add("learn");
        description.add("An Aroliant Training Initiative, android development");

        id.add("7");
        title.add("play");
        description.add("An Aroliant Training Initiative, android development");

        id.add("8");
        title.add("washing clothes");
        description.add("An Aroliant Training Initiative, android development");

        id.add("9");
        title.add("bath");
        description.add("An Aroliant Training Initiative, android development");

        id.add("10");
        title.add("ironing clothes");
        description.add("An Aroliant Training Initiative, android development");

        recyclerView = view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(getActivity().getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
