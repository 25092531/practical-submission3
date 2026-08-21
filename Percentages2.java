/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percentages;

/**
 *
 * @author mukwe
 */

import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        
        computePercent(num1, num2);
        
        computePercent(num2, num1);
    }
    
    public static void computePercent(double first, double second){
        
        double percentage = (first / second) * 100;
        
        System.out.println(first + " is " + percentage + " percent of " + second);
    
    }
    
}
