package com.shinhan.mcourt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LitigantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litigant);
    }

    public void onClick(View view) {
        Intent intent = new Intent(LitigantActivity.this, IssueActivity.class);
        startActivity(intent);
    }
}
