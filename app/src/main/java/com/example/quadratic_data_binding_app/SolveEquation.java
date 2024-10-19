package com.example.quadratic_data_binding_app;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadratic_data_binding_app.databinding.ActivityMainBinding;

public class SolveEquation extends BaseObservable {

    String a,b,c;
    ActivityMainBinding activityMainBinding;

    public SolveEquation(ActivityMainBinding activityMainBinding) {
        this.activityMainBinding = activityMainBinding;
    }

    public SolveEquation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEq(View view){
        int a=Integer.parseInt(getA());
        int b=Integer.parseInt(getB());
        int c=Integer.parseInt(getC());
        double x1;
        double x2;
        int d=(b*b)-(4*a*c);
        if(d>=0){
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b-Math.sqrt(d))/2*a;

            activityMainBinding.textView2.setText("Factors ::\nX1= "+x1+" , X2= "+x2);
        }
        else {
            activityMainBinding.textView2.setText("No Real Roots");
        }
    }
}
