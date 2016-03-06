package com.mycompany.app;

/**
 * Created by student on 2016/03/04.
 */
public class Student {
    int stdNum;
    float amount;

    Student(int x){
        stdNum = x;
        amount = 10;
    }

    public int studentNumber(){
        return stdNum;
    }

    public float studentAmount(){
        return amount;
    }

    public boolean hasMatric(char x){
        if (x == 'y')
            return true;
        else
            return false;
    }

    public int studentMarksTotal(int a, int b){
        int result = 0;
        try {
            result = a / b;
        }
        catch (ArithmeticException e){
            e.getMessage();
        }
        return result;
    }

}
