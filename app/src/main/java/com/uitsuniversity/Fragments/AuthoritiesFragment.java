package com.uitsuniversity.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.uitsuniversity.databinding.FragmentAuthoritiesBinding;
import com.uitsuniversity.databinding.FragmentAuthoritiesBinding;

public class AuthoritiesFragment extends Fragment {

    private FragmentAuthoritiesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAuthoritiesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}