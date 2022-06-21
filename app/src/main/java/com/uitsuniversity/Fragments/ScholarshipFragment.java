package com.uitsuniversity.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.uitsuniversity.Fragments.Authorities.CouncilAuthorityFragment;
import com.uitsuniversity.Fragments.scholarships.RegularScholarshipsFragment;
import com.uitsuniversity.Fragments.scholarships.SpecialWaiverFragment;
import com.uitsuniversity.R;



public class ScholarshipFragment extends Fragment {

    public ScholarshipFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scholarship, container, false);

        LinearLayout regular = (LinearLayout) view.findViewById(R.id.regular_waiver);
        LinearLayout special = (LinearLayout) view.findViewById(R.id.special_waiver);

        regular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_scholarship, new RegularScholarshipsFragment()).commit();
            }
        });

        special.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_scholarship, new SpecialWaiverFragment()).commit();
            }
        });

        return view;
    }
}