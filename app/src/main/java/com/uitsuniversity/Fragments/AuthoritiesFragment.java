package com.uitsuniversity.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uitsuniversity.Fragments.Authorities.ChairmanAuthorityFragment;
import com.uitsuniversity.R;


public class AuthoritiesFragment extends Fragment {

    public AuthoritiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_authorities, container, false);

        TextView chairmanView = view.findViewById(R.id.chairman_text);
        TextView boardView = view.findViewById(R.id.board_text);
        TextView syndicateView = view.findViewById(R.id.syndicate_text);
        TextView councilView = view.findViewById(R.id.council_text);
        TextView chancellorView = view.findViewById(R.id.chancellor_text);
        TextView proChancellorView = view.findViewById(R.id.pro_chancellor_text);
        TextView treasurerView = view.findViewById(R.id.treasurer_text);

        //On click for chairman authority
        chairmanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChairmanAuthorityFragment()).commit();
            }
        });

        //On click for board authority
        boardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //On click for syndicate authority
        syndicateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //On click for council authority
        councilView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //On click for chancellor authority
        chancellorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //On click for prochancellor authority
        proChancellorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //On click for treasurer authority
        treasurerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }
}