package com.company;

public class Complex {
    private double a;
    private double b;


    //first constructor
    public Complex(double x){
        a = x;
        b = 0.0;
    }
    //Second constructor
    public Complex(double x,double y){
        a = x;
        b = y ;
    }
    // abs method
    public double abs(){
        double x = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        x = Math.abs(x);
        return x;
    }
    //add method
    public Complex add(Complex other){
        double n = a+other.a;
        double m = b+other.b;
        Complex result = new Complex(n,m);
        return result;
    }
    //toString
    public String toString(){
        String str = a+"+"+b+"i";
        return str;
    }
    //multiply
    public Complex multiply(Complex other){
        // (a*other.a- b*other.b)+(b*other.a+a*other.b)i
        double m1 = (a*other.a - b*other.b);
        double m2 = (b*other.a + a*other.b);

        Complex result = new Complex(m1,m2);
        return result;
    }


    public static void main(String[] args) {
        // write your code here
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(4,1);
        Complex c3 = new Complex(0,6);
        Complex c4 = new Complex(5,0);
        //abs
        System.out.println(c1.abs());
        //add
        System.out.println(c2.add(c3));
        //toString
        System.out.println(c4.toString());
        //multiply
        System.out.println(c2.multiply(c1));

    }
}

