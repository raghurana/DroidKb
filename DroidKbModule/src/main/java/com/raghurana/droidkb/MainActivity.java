package com.raghurana.droidkb;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.raghurana.droidkb.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(this);
    }

    public void onMaterialDesignSurfaceClick() {
        Intent intent = new Intent(this, MaterialFabButtons.class);
        startActivity(intent);
    }

}
