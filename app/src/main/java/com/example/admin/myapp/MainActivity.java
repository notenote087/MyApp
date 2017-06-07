package com.example.admin.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  // grgrgr system.out.print;
        setContentView(R.layout.activity_main);
    }

    public  void showText(View view) {
        String msg = "Hello Teacher Tar I'm Handsome !";
        Toast toast  = Toast.makeText(this, msg, Toast.LENGTH_SHORT); // toast is Alert
        toast.show();
    }
}
