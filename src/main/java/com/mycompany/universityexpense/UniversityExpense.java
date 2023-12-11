/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universityexpense;

/**
 *
 * @author Apurba
 */
import java.util.Scanner;


public class UniversityExpense {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Category: 1.Resident 2.Non-resident: ");
      
        int b= sc.nextInt();
        switch (b) {
            case 1:
                System.out.println( "Your Tution fee will be "+30000);
                Oncampus z=new Oncampus();
                z.calculate();
                break;
            case 2:
                System.out.println("Your Tution fee will be "+24000);
                Online off=new Online();
                off.calculate();
                break;
            default:
                System.out.println("Select the category pls");
                break;
        }
    
         
          
    }
}
