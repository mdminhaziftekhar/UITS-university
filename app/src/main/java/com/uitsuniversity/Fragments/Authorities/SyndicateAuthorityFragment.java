package com.uitsuniversity.Fragments.Authorities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uitsuniversity.R;

public class SyndicateAuthorityFragment extends Fragment {


    public SyndicateAuthorityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_syndicate_authority, container, false);

        return view;
    }
}