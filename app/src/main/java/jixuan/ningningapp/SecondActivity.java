package jixuan.ningningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by jixuan on 14/12/15.
 */
public class SecondActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        Log.i("Second Activity", "onCreate excute");
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        final String data = intent.getStringExtra("extra_data");
        Log.i("SecondActivity ",data);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,data,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

