package com.example.progressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgressBar mProgressBarHorizontal,mProgressBarCircular;

    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        mProgressBarCircular = findViewById(R.id.progressBarCercular);

        mProgressBarCircular.setVisibility(View.GONE);
    }

    public void loadingProgressBar(View view) {
        this.progress = progress + 1;
        mProgressBarHorizontal.setProgress(this.progress);
        mProgressBarCircular.setVisibility(View.VISIBLE);

        if (this.progress == 10) {
            mProgressBarCircular.setVisibility(View.GONE);
        }

    }
}