package com.example.shane.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DecimalActivity extends AppCompatActivity {
    private static EditText et_number;
    private static Button b_convert;
    private static TextView result_bin;
    private static TextView result_oct;
    private static TextView result_hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);
        decimalConvert();
    }

    public void decimalConvert() {
        result_bin = (TextView) findViewById(R.id.result_bin);
        result_oct = (TextView) findViewById(R.id.result_oct);
        et_number = (EditText) findViewById(R.id.te1);
        b_convert = (Button) findViewById(R.id.button);

        result_hex = (TextView) findViewById(R.id.result_hex);


        b_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dec = Integer.parseInt(et_number.getText().toString());
                String bin = Integer.toBinaryString(dec);
                String oct = Integer.toOctalString(dec);
                String hex = Integer.toHexString(dec);

                result_hex.setText(hex);
                result_bin.setText(bin);
                result_oct.setText(oct);


            }
        });


    }
}
