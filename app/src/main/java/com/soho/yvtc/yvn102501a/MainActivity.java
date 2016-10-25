package com.soho.yvtc.yvn102501a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2= (Button) findViewById(R.id.button2);
        MyListener ll = new MyListener();
        btn2.setOnClickListener(ll);

    }
    class MyListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Log.d("MYLOG", "This is Click in MyListener");
        }
    }
    public void click1(View v){
        Log.d("MYLOG","This is click1");
    }
}
