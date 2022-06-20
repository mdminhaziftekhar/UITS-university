package com.uitsuniversity.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.uitsuniversity.Fragments.Authorities.CouncilAuthorityFragment;
import com.uitsuniversity.Fragments.admission.ApplyOnlineFragment;
import com.uitsuniversity.Fragments.admission.FaqsFragment;
import com.uitsuniversity.Fragments.admission.GraduateProgramFragment;
import com.uitsuniversity.Fragments.admission.TuitionFeesCalculatorFragment;
import com.uitsuniversity.Fragments.admission.TuitionFeesFragment;
import com.uitsuniversity.Fragments.admission.UndergraduateProgramFragment;
import com.uitsuniversity.R;

public class AdmissionFragment extends Fragment {


    public AdmissionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_admission, container, false);

        LinearLayout undergrad = (LinearLayout) view.findViewById(R.id.undergrad_program);
        LinearLayout grad = (LinearLayout) view.findViewById(R.id.graduation_prog);
        LinearLayout tuitionFee = (LinearLayout) view.findViewById(R.id.tuition_fees);
        LinearLayout tuitionFeeCalculator = (LinearLayout) view.findViewById(R.id.tuition_fees_calculator);
        LinearLayout applyOnline = (LinearLayout) view.findViewById(R.id.apply_online);
        LinearLayout faqs = (LinearLayout) view.findViewById(R.id.faqs);

        undergrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_admission, new UndergraduateProgramFragment()).commit();
            }
        });

        grad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_admission, new GraduateProgramFragment()).commit();
            }
        });

        tuitionFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_admission, new TuitionFeesFragment()).commit();
            }
        });

        tuitionFeeCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_admission, new TuitionFeesCalculatorFragment()).commit();
            }
        });

        applyOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_admission, new ApplyOnlineFragment()).commit();
            }
        });

        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_admission, new FaqsFragment()).commit();
            }
        });

        return view;
    }
}