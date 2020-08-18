package com.example.intentsproj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = null;
    public static final String EXTRA_MESSAGE2 = null;

    EditText edittext;
    EditText edittext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText edittext;
        EditText edittext1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendmassage1(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        edittext = findViewById(R.id.num1);
        edittext1 = findViewById(R.id.txt1);
        String massage1 = edittext.getText().toString();
        String massage2 = edittext1.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1, massage1);
        startActivity(intent);
        intent.putExtra(EXTRA_MESSAGE2, massage2);
        startActivity(intent);
        Context context = getApplicationContext();

        CharSequence message = "clicked the OK button";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

    }
}
