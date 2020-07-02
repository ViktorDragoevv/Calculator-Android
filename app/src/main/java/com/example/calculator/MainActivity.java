package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,equalBTN,plusBTN,subtractionBTN,multiplicationBTN,divisionBTN,sqrtBTN,percentBTN,DeleteBTN,onOfBTN,btnDot;
TextView in , out,first,operation,res;
String value ="";
boolean on=false;
    float mValueOne,mValueTwo;
    boolean mAddition=false ,mDivision=false,mSubtract=false,mMultiplication=false,mPercentage=false,mSqrt=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in=findViewById(R.id.in);
        out=findViewById(R.id.out);

        btn0=findViewById(R.id.charBTN0);
        btn1=findViewById(R.id.charBTN1);
        btn2=findViewById(R.id.charBTN2);
        btn3=findViewById(R.id.charBTN3);
        btn4=findViewById(R.id.charBTN4);
        btn5=findViewById(R.id.charBTN5);
        btn6=findViewById(R.id.charBTN6);
        btn7=findViewById(R.id.charBTN7);
        btn8=findViewById(R.id.charBTN8);
        btn9=findViewById(R.id.charBTN9);
        btnDot=findViewById(R.id.charBTNdot);
        DeleteBTN=findViewById(R.id.DeleteBTN);
        plusBTN=findViewById(R.id.plusBTN);
        equalBTN=findViewById(R.id.charBTNequal);
        onOfBTN=findViewById(R.id.onOfBTN);
        first=findViewById(R.id.first);
        operation=findViewById(R.id.operatiron);
        divisionBTN=findViewById(R.id.divisionBTN);
        res=findViewById(R.id.res);
        subtractionBTN=findViewById(R.id.subtractionBTN);
        multiplicationBTN=findViewById(R.id.multiplicationBTN);
        percentBTN=findViewById(R.id.percentBTN);
        sqrtBTN=findViewById(R.id.sqrtBTN);

        DeleteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            in.setText("");
            out.setText("");
            value="";
            first.setText("");
            operation.setText("");
               mValueOne=0;
               mValueTwo=0;

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                value = in.getText().toString();
                in.setText(value + "0");



            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "4");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = in.getText().toString();
                in.setText(value + ".");
            }
        });
        onOfBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(on==false) {

                    first.setText("Calculator ");
                    operation.setText("is");
                    in.setText("OFF");
                    out.setText(" On");
                    res.setText("Press");
                    value = "";

                    onOfBTN.setBackgroundColor(getResources().getColor(R.color.green));
                    btn0.setEnabled(false);
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                    btnDot.setEnabled(false);
                    equalBTN.setEnabled(false);
                    subtractionBTN.setEnabled(false);
                    plusBTN.setEnabled(false);
                    multiplicationBTN.setEnabled(false);
                    divisionBTN.setEnabled(false);
                    percentBTN.setEnabled(false);

                    DeleteBTN.setEnabled(false);
                    sqrtBTN.setEnabled(false);


                    onOfBTN.setText("ON");
                    on=true;
                }
                else {
                    onOfBTN.setBackgroundColor(getResources().getColor(R.color.red));
                    out.setText(value);
                    on=false;
                    in.setText("");
                    res.setText("Result:");
                    operation.setText("");
                    first.setText("");
                    btn0.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    sqrtBTN.setEnabled(true);
                    DeleteBTN.setEnabled(true);
                    btnDot.setEnabled(true);
                    equalBTN.setEnabled(true);
                    subtractionBTN.setEnabled(true);
                    plusBTN.setEnabled(true);
                    multiplicationBTN.setEnabled(true);
                    divisionBTN.setEnabled(true);
                    percentBTN.setEnabled(true);
                    onOfBTN.setText("OF");
                }
            }
        });
        plusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //value = in.getText().toString();
                //in.setText(value + "+");
                value= (String) in.getText();
                if(!(value.isEmpty())) {
                    mValueOne = Float.parseFloat(in.getText() + "");
                    mAddition = true;
                    first.setText(in.getText());
                    operation.setText("+");
                    in.setText(null);
                    value="";
                }

            }
        });
        divisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value= (String) in.getText();
                if(!(value.isEmpty())) {
                    mValueOne = Float.parseFloat(in.getText() + "");
                    mDivision = true;
                    first.setText(in.getText());
                    operation.setText("/");
                    in.setText(null);
                    value="";
                }
            }
        });
        subtractionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value= (String) in.getText();
                if(!(value.isEmpty())) {
                mValueOne = Float.parseFloat(in.getText() + "");
                mSubtract = true ;
                first.setText(in.getText());
                operation.setText("-");
                in.setText(null);
                value="";}
            }
        });
        multiplicationBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value= (String) in.getText();
                if(!(value.isEmpty())) {
                mValueOne = Float.parseFloat(in.getText() + "");
                mMultiplication = true ;
                first.setText(in.getText());
                operation.setText("X");
                in.setText(null);
                value="";}
            }
        });
        percentBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value= (String) in.getText();
                if(!(value.isEmpty())) {
                    mValueOne = Float.parseFloat(in.getText() + "");
                    mPercentage = true;
                    first.setText(in.getText());
                    operation.setText("%");
                    in.setText(null);
                    value = "";

                }
            }
        });
        sqrtBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // value= (String) in.getText();
               // if(!(value.isEmpty())) {

                    operation.setText("√");
                    //mValueOne = Float.parseFloat(in.getText() + "");
                    mSqrt = true;
                   // first.setText(in.getText());
                    in.setText(null);
                    value = "";

               // }
            }
        });

        equalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(in.getText() + "");

                if (mAddition == true ){

                    out.setText(mValueOne + mValueTwo +"");
                    mAddition=false;

                }
                if (mDivision == true){
                    out.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
                if (mSubtract == true){
                    out.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }
                if (mMultiplication == true){
                    out.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }
                if (mPercentage == true){
                    //float cal =  Math.round((mValueOne *100)/ mValueTwo);
                   // float cal= (float)((mValueOne/mValueTwo)*100);
                    float cal = (float)((mValueOne*mValueTwo)/100);
                    out.setText(cal +"");
                    mPercentage=false;
                }
                if (mSqrt == true){
                    double cal =  Math.sqrt(Double.parseDouble(in.getText().toString()));
                    out.setText(cal +"");
                    mPercentage=false;
                }

            }
        });


    }

}
