package com.hades.example.android.view_binding_example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.android.view_binding_example.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

//    ActivityMainBinding2 binding2;  // 因为设置了tools:viewBindingIgnore="true"，所以binding2不存在
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}