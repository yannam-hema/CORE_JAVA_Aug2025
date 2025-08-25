package com.gqt.challenges.OverLoading;

class FactorialCalc {
    void fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Factorial of " + n + " = " + f);
    }
    void fact(float n) {
        int n1 = (int) n; 
        fact(n1);         
    }
    void fact(double n) {
        int n2 = (int) n; 
        fact(n2);         
    }
}
public class Factorial {
    public static void main(String[] args) {
        FactorialCalc obj = new FactorialCalc();
        obj.fact(9);        
        obj.fact(9.8f);     
        obj.fact(3.456);    
    }
}
