package com.example.nagesh.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        inti();
        Log.d("ActivityLifeCycle","Create1");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("ActivityLifeCycle","Start1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle","Resume1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle","Pause1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle","Stop1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle","Restart1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle","Destroy1");
    }


    public void inti(){
        button=(Button)findViewById(R.id.button2);
    }
}
