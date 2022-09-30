package com.example.quiz;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   final EditText et1=(EditText)findViewById(R.id.et1);
   final EditText et2=(EditText)findViewById(R.id.et2);
   final TextView tt =(TextView)findViewById(R.id.tvw);
   final Button bt=(Button)findViewById(R.id.button1);
   bt.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	int num1=Integer.parseInt(et1.getText().toString());
	int num2=Integer.parseInt(et2.getText().toString());
	int a=num1+num2;
    Toast.makeText(getApplicationContext(), "the sum is"+a, Toast.LENGTH_LONG).show();
    tt.setText(String.valueOf(a));
	}
});
    }


   
}
