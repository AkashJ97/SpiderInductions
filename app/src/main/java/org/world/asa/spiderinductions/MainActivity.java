package org.world.asa.spiderinductions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity  {


    CheckBox c1, c2, c3, c4;
    EditText name, rno;
    Spinner dep;
    int flag ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dep = (Spinner) findViewById(R.id.dept);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Department, R.layout.support_simple_spinner_dropdown_item);
        dep.setAdapter(adapter);


    }

    public void submit(View v) {

        flag=0;

        name = (EditText) findViewById(R.id.name);
        rno = (EditText) findViewById(R.id.rno);
        c1 = (CheckBox) findViewById(R.id.appdev);
        c2 = (CheckBox) findViewById(R.id.webdev);
        c3 = (CheckBox) findViewById(R.id.tronix);
        c4 = (CheckBox) findViewById(R.id.algos);
        if (name.getText().toString().trim().length() == 0) {
            flag = 1;
            Toast.makeText(this, "Please fill your name", Toast.LENGTH_SHORT).show();
        }
        if (rno.getText().toString().trim().length() == 0) {
            Toast.makeText(this, "Please fill your Roll No.", Toast.LENGTH_SHORT).show();
            flag = 1;
        }

        if ((c1.isChecked() == false) && (c2.isChecked() == false) && (c3.isChecked() == false)) {
            Toast.makeText(this, "Please select at least one profile", Toast.LENGTH_SHORT).show();
            flag = 1;
        }

        if (flag == 0) {
            Intent subact = new Intent(this, SubmitActivity.class);
            EditText nam=(EditText) findViewById(R.id.name);
            String s=nam.getText().toString();
            subact.putExtra("name",s);
            startActivity(subact);
        }

    }

}