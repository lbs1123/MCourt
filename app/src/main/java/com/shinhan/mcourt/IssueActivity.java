package com.shinhan.mcourt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IssueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue);
    }

    public void onClick(View view) {
        Intent intent = new Intent(IssueActivity.this, MainActivity.class);
        startActivity(intent);

    }
}
