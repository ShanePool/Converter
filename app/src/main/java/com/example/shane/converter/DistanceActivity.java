package com.example.shane.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DistanceActivity extends AppCompatActivity {
    private static RadioGroup rad_gr;
    private static RadioButton rad_btn;
    private static Button con_btn;
    private static TextView distC;
    private static TextView dShow1;
    private static TextView dShow2;
    private static TextView test;
    private static TextView dist1;
    private static TextView dist2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        onClickListenerConvertButton();
    }

    public void onClickListenerConvertButton(){

        rad_gr = (RadioGroup)findViewById(R.id.dist_grp);
        con_btn = (Button)findViewById(R.id.con_btn);
        distC = (TextView)findViewById(R.id.distC);
        dShow1 = (TextView)findViewById(R.id.dShow1);
        dShow2 = (TextView)findViewById(R.id.dShow2);

        con_btn.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {


                        int selected_id = rad_gr.getCheckedRadioButtonId();
                        rad_btn = (RadioButton)findViewById(selected_id);

                        Toast.makeText(DistanceActivity.this,rad_btn.getText().toString(),Toast.LENGTH_SHORT).show();

                        converterMeth();

                    }
                }
        );
    }

    public void converterMeth(){


        dist1 = (TextView)findViewById(R.id.dist1);
        dist2 = (TextView)findViewById(R.id.dist2);


        String value = distC.getText().toString();
        double amount = Double.parseDouble(value);

        String cat = rad_btn.getText().toString();

        String cm = "Centimeteres";
        String m = "Meters";
        String km = "Kilo Meters";



     if(cat.equals(cm)){


         dist1.setText("In Meteres..");
         dist2.setText("In Kilo Meteres..");
         //in metres
         double ms = amount/1000;
         String metres = String.valueOf(ms);

         //in km
         double kms = amount/1000000;
         String kmtres = String.valueOf(kms);


         dShow1.setText(metres);
         dShow2.setText(kmtres);


     }else if (cat.equals(m)){

         dist1.setText("In Centimeteres..");
         dist2.setText("In Kilo Kilo Meteres..");

         //in centi metres
         double ms = amount*1000;
         String metres = String.valueOf(ms);

         //in km
         double kms = amount/1000;
         String kmtres = String.valueOf(kms);


         dShow1.setText(metres);
         dShow2.setText(kmtres);


     }else if (cat.equals(km)){

         dist1.setText("In CentiMeteres..");
         dist2.setText("In Meteres..");

         //in centi metres
         double ms = amount*1000000;
         String metres = String.valueOf(ms);

         //in m
         double kms = amount*1000;
         String kmtres = String.valueOf(kms);


         dShow1.setText(metres);
         dShow2.setText(kmtres);


     }else{

         Toast.makeText(DistanceActivity.this,"Error Converting Distance",Toast.LENGTH_SHORT).show();

     }







    }
}
