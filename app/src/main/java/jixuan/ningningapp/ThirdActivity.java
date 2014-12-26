package jixuan.ningningapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Window;

/**
 * Created by jixuan on 14/12/16.
 */
public class ThirdActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        Log.i("Third Activity", "onCreate excute");
        setContentView(R.layout.third_layout);
    }
}
