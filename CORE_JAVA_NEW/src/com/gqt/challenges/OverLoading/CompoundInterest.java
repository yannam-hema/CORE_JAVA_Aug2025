package com.gqt.challenges.OverLoading;

class CI {
    void calculate(int p, int r, int n) {
        double amount = p * Math.pow((1 + (r / 100.0)), n);
        double ci = amount - p;
        System.out.println("CI = " + ci);
    }
    void calculate(int p, float r, int n) {
        double amount = p * Math.pow((1 + (r / 100.0)), n);
        double ci = amount - p;
        System.out.println("CI = " + ci);
    }
}
public class CompoundInterest {
    public static void main(String[] args) {
        CI obj = new CI();
        obj.calculate(4500, 3, 10);     
        obj.calculate(4500, (float)3.5, 5); 
    }
}
