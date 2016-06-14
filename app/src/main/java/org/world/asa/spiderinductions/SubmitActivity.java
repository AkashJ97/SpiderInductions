package org.world.asa.spiderinductions;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubmitActivity extends Activity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        Intent subact=getIntent();
        if(subact.hasExtra("name")){
            TextView t=(TextView)findViewById(R.id.thank);
            t.setText("Thank you "+subact.getStringExtra("Name")+" for your response");
        }
    }

    public void backtomain(View v) {
        finish();

    }
}
