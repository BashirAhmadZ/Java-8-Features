package com.ahmad;
/**
 * 09 Jun 2022
 * @author Bashir Ahmad
 */
public class ThreadsUsingLambda {
    public static void main(String[] args) {
        //Withouut Using Lambda expression we should implement Runnable interface and Override the run();
        // Using Lambda Expression Directly can access Rannable interface
        Runnable r = () -> { 
            for(int i=0; i<10; i++) { 
                System.out.println("Child Thread"); 
            }}; 
        Thread t = new Thread(r); 
        t.start(); 
        for(int i=0; i<10; i++) { 
            System.out.println("Main Thread"); 
        } 
    }
}
