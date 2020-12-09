package com.example.Lab4_Sheptuhin_Android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Lab4_Sheptuhin_Android.R;

public class phone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);
        Button button5;
        button5 = (Button) findViewById(R.id.button5);
        final EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone2);
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str;
                        str = editTextPhone.getText().toString();
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+str));
                        startActivity(intent);
                    }
                }
        );
    }
}