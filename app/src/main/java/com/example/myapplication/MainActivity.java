package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText (this, msg, Toast.LENGTH_LONG);
        toast.show();
    }


    public void onClick(View view) {
        startActivity(new Intent)( MainActivity.this,MainActivity2.class));
        toastMsg("going to page 2");

        EditText editPassword = findViewById(R.id.editTextPassword);
        TextView textPassword = findViewById(R.id.TextViewPassword);
        String context = editPassword.getText().toString(); //gets you the contents of edit text

        if (content.equals("Password")) {
            startAcvivity(new.Intent( ))
    }
}
//hello stranger