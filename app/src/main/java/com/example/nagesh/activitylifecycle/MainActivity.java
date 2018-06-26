package com.example.nagesh.activitylifecycle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();
        Log.d("ActivityLifeCycle","Create");
        Log.e("ActivityLifeCycle","Create");
        Log.w("ActivityLifeCycle","Create");
        Log.v("ActivityLifeCycle","Create");
        Log.i("ActivityLifeCycle","Create");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("ActivityLifeCycle","Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle","Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle","Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle","Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle","Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle","Destroy");
    }

    public void inti(){
        button=(Button)findViewById(R.id.button2);
    }
}
