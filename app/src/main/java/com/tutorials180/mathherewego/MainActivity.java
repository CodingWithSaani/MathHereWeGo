package com.tutorials180.mathherewego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numberOneET,numberTwoET;
    TextView resultTV;

    int varOne,varTwo,resultVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectJavaViewsWithXMLViews();
    }

    private void connectJavaViewsWithXMLViews()
    {
        numberOneET=findViewById(R.id.numberOneET);
        numberTwoET=findViewById(R.id.numberTwoET);

        resultTV=findViewById(R.id.resultTV);
    }

    public void addValues(View objView)
    {
        if(!numberOneET.getText().toString().isEmpty()
        && !numberTwoET.getText().toString().isEmpty())
        {
            varOne=Integer.parseInt(numberOneET.getText().toString());

            varTwo=Integer.parseInt(numberTwoET.getText().toString());
            resultVar=varOne+varTwo;

            String resultInStringFormat="Result is:"+(resultVar);
            resultTV.setText(resultInStringFormat);

            numberOneET.setText("");
            numberTwoET.setText("");
        }
        else if(numberOneET.getText().toString().isEmpty())
        {
            Toast.makeText(this, R.string.plz_enter_value_one, Toast.LENGTH_SHORT).show();
        }
        else if(numberTwoET.getText().toString().isEmpty())
        {
            Toast.makeText(this, R.string.plz_enter_value_two, Toast.LENGTH_SHORT).show();
        }

    }
}
