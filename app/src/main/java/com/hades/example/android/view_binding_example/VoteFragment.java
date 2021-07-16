package com.hades.example.android.view_binding_example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hades.example.android.view_binding_example.databinding.FragmentVoteBinding;

public class VoteFragment extends Fragment {
    public static final String TAG = "VoteFragment";
    private FragmentVoteBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_vote, container, false);
//        rootView.findViewById(R.id.voteTom).setOnClickListener(view -> clickVoteTom());
//        rootView.findViewById(R.id.voteJerry).setOnClickListener(view -> clickVoteJerry());


        // Way 1 : inflate() : pass the layout to be inflated
//        binding = FragmentVoteBinding.inflate(inflater,container,false);
//        binding.voteJerry.setOnClickListener(view -> clickVoteJerry());
//        binding.voteTom.setOnClickListener(view -> clickVoteTom());
//        View rootView = binding.getRoot();

        // Way 2 : inflate(): pass the layout that has already been inflated
        View rootView = inflater.inflate(R.layout.fragment_vote, container, false);
        binding = FragmentVoteBinding.bind(rootView);
        binding.voteJerry.setOnClickListener(view -> clickVoteJerry());
        binding.voteTom.setOnClickListener(view -> clickVoteTom());
        return rootView;
    }

    private void clickVoteTom() {
        Toast.makeText(getActivity(), "Click Vote Tom", Toast.LENGTH_SHORT).show();
    }

    private void clickVoteJerry() {
        Toast.makeText(getActivity(), "Click Vote Jerry", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Fragments outlive their views. Make sure you clean up any references to the binding class instance in the fragment's onDestroyView() method.
        binding = null;
    }
}
