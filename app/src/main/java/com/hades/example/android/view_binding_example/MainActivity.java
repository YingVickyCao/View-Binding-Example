package com.hades.example.android.view_binding_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hades.example.android.view_binding_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        setContentView(rootView);

        binding.redBtn.setOnClickListener(view -> clickRedBtn());
        binding.redBtn.setText("Red Button");

        binding.greenBtn.setOnClickListener(view -> clickGreenBtn());
        binding.blueBtn.setOnClickListener(view -> clickBlueBtn());
        binding.pinkBtn.setOnClickListener(view -> clickPinkBtn());

        // ViewBing 和 findViewById 可以共存。因此，可以逐渐替换
        findViewById(R.id.yellowBtn).setOnClickListener(view -> clickYellowBtn());
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentRoot, new VoteFragment(), VoteFragment.TAG).commit();
    }

    private void clickRedBtn() {
        Toast.makeText(this, "Click Red Button", Toast.LENGTH_SHORT).show();
    }

    private void clickGreenBtn() {
        Toast.makeText(this, "Click Green Button", Toast.LENGTH_SHORT).show();
    }

    private void clickBlueBtn() {
        Toast.makeText(this, "Click Blue Button", Toast.LENGTH_SHORT).show();
    }

    private void clickPinkBtn() {
        Toast.makeText(this, "Click Pink Button", Toast.LENGTH_SHORT).show();
    }

    private void clickYellowBtn() {
        Toast.makeText(this, "Click Yellow Button", Toast.LENGTH_SHORT).show();
    }
}