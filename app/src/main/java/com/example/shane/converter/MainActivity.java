package com.example.shane.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static Button distBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DistanceBtnClicked(View view){

    Intent nxt = new Intent(MainActivity.this,DistanceActivity.class);
    startActivity(nxt);
}
   /* public void OnClickButtonListener (){

        distBtn = (Button)findViewById(R.id.distBtn);

    }
    */

   public void LiquidBtnClicked(View view){

       Intent intent = new Intent(MainActivity.this,LiquidActivity.class);
       startActivity(intent);
   }

   public void DecimalBtnClicked(View view){

       Intent intent = new Intent(MainActivity.this,DecimalActivity.class);
       startActivity(intent);

   }

   public void AboutUsBtnClicked(View view){

       Intent intent = new Intent(MainActivity.this,AboutUsActivity.class);
       startActivity(intent);
   }









   public void onButtonClick(View view){

        Toast toast = Toast.makeText(getApplicationContext()," Hello User!",Toast.LENGTH_LONG);
        toast.show();


    }

    public void onButtonTap(View view){

        Toast toast = Toast.makeText(getApplicationContext()," Hello User!",Toast.LENGTH_LONG);
        toast.show();


    }

}
