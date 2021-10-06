package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {
        startActivity(new Intent( MainActivity2.this,MainActivity.class));
        toastMsg("going back");
        EditText num1TxtBox = findViewById(R.id.editTextNum1);
        EditText num2TxtBox = findViewById(R.id.editTextNum2);
        EditText operatorBox = findViewById(R.id.editTextOper);

        TexView answer = findViewById(R.idtextViewAnswer);

        String num1String = num1TxtBox.getText().toString();
        int inNum1 = Interger.parseInt(num1String);

        string num1String = oporatorBox.getText().toString();

        String num2String = num2TxtBox.getText().toString();
        int inNum2 = Interger.parseInt(num2String);

        int answerNumber = 0;

        if (operator.equals("+"))operator.equals("plus"); {
            answerNumber = inNum1 + inNum2;
        }
        else if() {
        }
        answer.setText(Interger.toString(aswerNuber));


    }
}