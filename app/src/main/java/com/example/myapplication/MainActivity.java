package com.example.myapplication;

import static android.graphics.Color.WHITE;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Button button ;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onCreate ", "OnStart  ");
        Toast toast = Toast.makeText(this, " onStart Called ",Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onCreate ", "OnDestroy ");
        Toast toast = Toast.makeText(this, " onDestroy Called ",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("onCreate ", "Resume ");
        Toast toast = Toast.makeText(this, " onResume Called ",Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onCreate ", "Pause ");
        Toast toast = Toast.makeText(this, " onPasue Called ",Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onCreate ", "Stop  ");
        Toast toast = Toast.makeText(this, " onStop Called ",Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onCreate ", "Restart  ");
        Toast toast = Toast.makeText(this, " Restart Called ",Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button myBtn = new Button( this);
        myBtn.setText(R.string.click);
        myBtn.setBackgroundColor(Color.BLUE);
        RelativeLayout myLayout =   new  RelativeLayout(this);
             myLayout.setBackgroundColor(WHITE);
             RelativeLayout.LayoutParams btnPrama = new RelativeLayout.LayoutParams(
                   RelativeLayout.LayoutParams.WRAP_CONTENT,
                   RelativeLayout.LayoutParams.WRAP_CONTENT
             );
     btnPrama.addRule(RelativeLayout.CENTER_HORIZONTAL);
     myLayout.addView(myBtn,btnPrama);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("hello", "onClick: Hi ");
            }
        });
        setContentView(myLayout);
        Log.d(" onCreate", "Called ");
        Toast toast = Toast.makeText(this, " onCreate Called ",Toast.LENGTH_SHORT);
        toast.show();

       // setContentView(R.layout.activity_main);
//        button = findViewById(R.id.btn);
//        button.setOnClickListener(new View.OnClickListener() {
//                 float rotVal = 0.9f ;
//                 @Override
//                 public void onClick(View v ) {
//                     findViewById(R.id.text).animate().scaleX( rotVal +=1 );
//            }
//        });

            //
    }
}