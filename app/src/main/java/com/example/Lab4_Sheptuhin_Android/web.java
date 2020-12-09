package com.example.Lab4_Sheptuhin_Android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Lab4_Sheptuhin_Android.R;

public class web extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        Button button4;
        button4 = (Button) findViewById(R.id.button4);
        final EditText editTextWeb = (EditText) findViewById(R.id.editTextTextPersonName1);
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str = editTextWeb.getText().toString();
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                        startActivity(intent);
                    }
                }
        );
    }
}