/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityexpense;

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;

abstract class Student {
    
    abstract void calculate();
   
    
    Scanner sc= new Scanner(System.in);
   
    int tutionfee;
    int extrafee; 
    int credit;
    public Student(){
        System.out.println("Enter your name: ");
        String f=sc.nextLine();
        System.out.println("Enter your id: ");
        int id=sc.nextInt();
    }
    
}
