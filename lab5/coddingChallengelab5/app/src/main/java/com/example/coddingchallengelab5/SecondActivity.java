package com.example.coddingchallengelab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "ca.nbcc.shoppinglist.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void addItem(View view) {
        Intent replyIntent=new Intent();
        String message=((Button)view).getText().toString();
        replyIntent.putExtra(EXTRA_MESSAGE, message);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}