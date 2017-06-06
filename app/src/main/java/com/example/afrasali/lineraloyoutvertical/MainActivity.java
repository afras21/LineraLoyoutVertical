package com.example.afrasali.lineraloyoutvertical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneclick(View view){
        Toast.makeText(this, " 1 clicked", Toast.LENGTH_SHORT).show();
    }


    public void twoclick(View view){
        Toast.makeText(this, " 2 clicked", Toast.LENGTH_SHORT).show();
    }


    public void threeclick(View view){
        Toast.makeText(this, " 3 clicked", Toast.LENGTH_SHORT).show();
    }
}
