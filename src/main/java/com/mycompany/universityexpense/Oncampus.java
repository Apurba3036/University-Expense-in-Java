/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityexpense;

/**
 *
 * @author Apurba
 */
import java.util.Scanner;

public class Oncampus extends Student implements ProfessionalCourse {
    
   Scanner sc=new Scanner(System.in) ;
   public Oncampus(){
       
       super();
   }
  
   @Override
    public void calculate(){
        extrafee=2000;
        tutionfee=30000;
        
        System.out.println("How many credits you have taken:");
        int r=sc.nextInt();
        System.out.println("Per credit fee is 3500");
        int totalcreditfee=(r*3500);
        System.out.println("Total credits fee:"+totalcreditfee);
        int course=professionalcourse();
        System.out.println("Extra fee:Library,Bus: "+extrafee);
        int total=tutionfee+course+extrafee+totalcreditfee;
        System.out.println("..........................................");
        System.out.println("The total cost is: "+total);
        
    }
    
    
    
   @Override
   public int professionalcourse() {
        int meow;

        System.out.println("Which course do you do: 1. Networking 2. Software developing");
        int o = sc.nextInt();

        // Consume the newline character
        sc.nextLine();

        switch (o) {
            case 1:
                meow = 5000;
                System.out.println("The networking course fee is " + meow);
                break;
            case 2:
                meow = 4500;
                System.out.println("The software development course fee is " + meow);
                break;
            default:
                System.out.println("Enter the correct option");
                return 0; 
        }

        return meow;
    }
   
   

    
}
