package com.hades.example.android.view_binding_example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.android.view_binding_example.databinding.ActivityMainBinding;
import com.hades.example.android.view_binding_example.dummy.DummyRecyclerViewFragment;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentRoot, new DummyRecyclerViewFragment()).commit();
    }
}