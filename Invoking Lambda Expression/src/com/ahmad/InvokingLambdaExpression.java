package com.ahmad;
/**
 * 09 Jun 2022
 * @author Bashir Ahmad
 */
interface Addition{
    public int add(int a,int b);
}
public class InvokingLambdaExpression {

    public static void main(String[] args) {
        Addition sum = (a,b)-> a+b;
        System.out.println("The Sum 45 and 67 is: "+sum.add(45, 67));
    }
    
}
