package com.hades.example.android.view_binding_example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VoteFragment extends Fragment {
    public static final String TAG = "VoteFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_vote, container, false);
        rootView.findViewById(R.id.voteTom).setOnClickListener(view -> clickVoteTom());
        rootView.findViewById(R.id.voteJerry).setOnClickListener(view -> clickVoteJerry());
        return rootView;
    }

    private void clickVoteTom() {
        Toast.makeText(getActivity(), "Click Vote Tom", Toast.LENGTH_SHORT).show();
    }

    private void clickVoteJerry() {
        Toast.makeText(getActivity(), "Click Vote Jerry", Toast.LENGTH_SHORT).show();
    }
}
