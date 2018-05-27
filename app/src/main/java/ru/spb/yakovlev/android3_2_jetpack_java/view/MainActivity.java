package ru.spb.yakovlev.android3_2_jetpack_java.view;


import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.spb.yakovlev.android3_2_jetpack_java.R;
import ru.spb.yakovlev.android3_2_jetpack_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MainViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        model = ViewModelProviders.of(this).get(MainViewModel.class);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(model);
        binding.setLifecycleOwner(this);
    }
}
