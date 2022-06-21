package com.brunofaustino.locationapp;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.brunofaustino.locationapp.appvm.AppViewModel;
import com.brunofaustino.locationapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Button move;
    TextView longTextView, latTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
         activityMainBinding.setViewmodel(new AppViewModel());
         activityMainBinding.executePendingBindings();
         move = findViewById(R.id.moveButton);
        longTextView = findViewById(R.id.longTextView);
        latTextView = findViewById(R.id.latTextView);
    }

}