package com.hades.example.android.view_binding_example.dummy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hades.example.android.view_binding_example.R;
import com.hades.example.android.view_binding_example.databinding.RecyclerviewDummyBinding;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link IItemClickAction}
 * interface.
 */
public class DummyRecyclerViewFragment extends Fragment implements IItemClickAction {
    private static final String TAG = DummyRecyclerViewFragment.class.getSimpleName();

    RecyclerviewDummyBinding binding;
    private DummyRecyclerViewAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;

    public DummyRecyclerViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclerview_dummy, container, false);
        binding = RecyclerviewDummyBinding.bind(view);
        initList();
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void initList() {
        binding.list.setHasFixedSize(false);
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.list.setLayoutManager(mLinearLayoutManager);
        binding.list.addItemDecoration(new SimpleDividerItemDecoration(getContext(), R.drawable.drawable_shape_4_divider_vertical));
        mAdapter = new DummyRecyclerViewAdapter(DummyItems.ITEMS(), this);
        binding.list.setAdapter(mAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        mAdapter.setListener(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        mAdapter.setListener(null);
    }

    @Override
    public void onItemClickListener(DummyItem item) {
        Toast.makeText(getContext(), item.colo2, Toast.LENGTH_SHORT).show();
    }
}