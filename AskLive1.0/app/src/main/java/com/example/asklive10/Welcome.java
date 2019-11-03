package com.example.asklive10;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.example.asklive10.ui.login.LoginActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
import android.content.Intent;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick1(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        //final EditText welcomeScreenInput = (EditText)findViewById(R.id.welcomeScreenInput);
        String userMessage = "1";
        i.putExtra("welcomeMessage", userMessage);

        /*on receiving end:
        Bundle welcomeMessageData = getIntent().getExtras();
        if (welcomeMessageData == null) {
              return;
        }
        String welcomeMessage = welcomeMessageData.getString("welcomeMessage");
        final TextView loginText = (TextView) findViewById(R.id.loginText);
        loginText.setText(welcomeMessage);
         */

        startActivity(i);

    }

    public void onClick2(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        //final EditText welcomeScreenInput = (EditText)findViewById(R.id.welcomeScreenInput);
        String userMessage = "2";
        i.putExtra("welcomeMessage", userMessage);

        /*on receiving end:
        Bundle welcomeMessageData = getIntent().getExtras();
        if (welcomeMessageData == null) {
              return;
        }
        String welcomeMessage = welcomeMessageData.getString("welcomeMessage");
        final TextView loginText = (TextView) findViewById(R.id.loginText);
        loginText.setText(welcomeMessage);
         */

        startActivity(i);

    }

    public void onClick3(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        //final EditText welcomeScreenInput = (EditText)findViewById(R.id.welcomeScreenInput);
        String userMessage = "3";
        i.putExtra("welcomeMessage", userMessage);

        /*on receiving end:
        Bundle welcomeMessageData = getIntent().getExtras();
        if (welcomeMessageData == null) {
              return;
        }
        String welcomeMessage = welcomeMessageData.getString("welcomeMessage");
        final TextView loginText = (TextView) findViewById(R.id.loginText);
        loginText.setText(welcomeMessage);
         */

        startActivity(i);

    }

    public void onClick4(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        //final EditText welcomeScreenInput = (EditText)findViewById(R.id.welcomeScreenInput);
        String userMessage = "4";
        i.putExtra("welcomeMessage", userMessage);

        /*on receiving end:
        Bundle welcomeMessageData = getIntent().getExtras();
        if (welcomeMessageData == null) {
              return;
        }
        String welcomeMessage = welcomeMessageData.getString("welcomeMessage");
        final TextView loginText = (TextView) findViewById(R.id.loginText);
        loginText.setText(welcomeMessage);
         */

        startActivity(i);

    }

}
