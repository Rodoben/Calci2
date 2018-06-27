package com.example.ronald.calci2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void doadd(View view){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2 =(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.parseDouble(e1.getText().toString());
        Double num2= Double.parseDouble(e2.getText().toString());

        Double sum= num1+num2;
        t1.setText(Double.toString(sum));
        Toast.makeText(getApplicationContext(),"Addition:" +sum ,Toast.LENGTH_SHORT).show();

    }
    public void dosub(View view){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2 =(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.parseDouble(e1.getText().toString());
        Double num2= Double.parseDouble(e2.getText().toString());
        Double sum= num1-num2;
        t1.setText(Double.toString(sum));
        Toast.makeText(getApplicationContext(),"Subtraction:" +sum ,Toast.LENGTH_SHORT).show();

    }
    public void dodiv(View view){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2 =(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.parseDouble(e1.getText().toString());
        Double num2= Double.parseDouble(e2.getText().toString());
        Double sum= num1/num2;
        t1.setText(Double.toString(sum));
        Toast.makeText(getApplicationContext(),"Division:" +sum ,Toast.LENGTH_SHORT).show();


    }
    public void domul(View view){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2 =(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.parseDouble(e1.getText().toString());
        Double num2= Double.parseDouble(e2.getText().toString());
        Double sum= num1*num2;
        t1.setText(Double.toString(sum));
        Toast.makeText(getApplicationContext(),"Product:" +sum ,Toast.LENGTH_SHORT).show();

    }

}
