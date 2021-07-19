package com.hades.example.android.view_binding_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hades.example.android.view_binding_example.databinding.ActivityMainBinding;
import com.hades.example.android.view_binding_example.databinding.MergedLayout2Binding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MergedLayout2Binding mergedLayout2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        setContentView(rootView);

        binding.redBtn.setOnClickListener(view -> clickRedBtn());
        binding.redBtn.setText("Red Button");

        // Include
        binding.includes.greenBtn.setOnClickListener(view -> clickGreenBtn());

        // Merge Way 1
        binding.merge1.blueBtn.setOnClickListener(view -> clickBlueBtn());

        // Merge Way 2
        mergedLayout2Binding = mergedLayout2Binding.bind(rootView);
        mergedLayout2Binding.pinkBtn.setOnClickListener(view -> clickPinkBtn());

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

    @Override
    protected void onDestroy() {
        super.onDestroy();

        binding = null;
    }
}