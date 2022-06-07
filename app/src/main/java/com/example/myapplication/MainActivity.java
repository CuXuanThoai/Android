package com.example.myapplication;

import static android.graphics.Color.WHITE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.model.CounterViewModel;

public class MainActivity extends AppCompatActivity {
     Button btn ;
     TextView textView ;
      private CounterViewModel  viewModel ;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
       super.onSaveInstanceState(outState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setup viewmodel

        viewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        //displayCounter(viewModel.getCounter()); place here will be throw execption
        textView = findViewById(R.id.text);
        btn = findViewById(R.id.btn2);
             btn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     incrementCounter (view);
                 }
             });
        displayCounter(viewModel.getCounter());
        }

        private  void  incrementCounter ( View v ) {
        viewModel.setCounter(viewModel.getCounter() +1 );
        displayCounter(viewModel.getCounter());
        }

    private void displayCounter(int counter) {
        textView.setText(String.valueOf( counter));
    }
}




