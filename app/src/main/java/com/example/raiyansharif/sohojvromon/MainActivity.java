package com.example.raiyansharif.sohojvromon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String output="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void editText1(View view){
        EditText clear = (EditText) findViewById(R.id.editText);
        clear.setText("");

    }
    public void editText_2(View view){
        EditText clear = (EditText) findViewById(R.id.editText2);
        clear.setText("");

    }
    public void submitBtn(View view){
        EditText dataSource = (EditText) findViewById(R.id.editText);
        String datasource="";
        datasource=dataSource.getText().toString();
        EditText dataDestination = (EditText) findViewById(R.id.editText2);
        String destination=dataDestination.getText().toString();
        if(datasource.equals("Uttara") && destination.equals("Mirpur")){

            TextView text = (TextView) findViewById(R.id.Output);
            text.setText("Cost 30 taka");
        }
        else
        {
            TextView text = (TextView) findViewById(R.id.Output);
            text.setText("Cost 100 taka");
        }
    }

}
