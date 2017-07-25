package com.reversecoder.automation.androidstudio.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.reversecoder.automation.androidstudio.R;

/*
* @author Md. Rashadul Alam
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        initAction();

    }

    private void initUI() {
    }

    private void initAction() {
    }
}
