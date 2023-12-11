/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityexpense;

/**
 *
 * @author ADMIN
 */
public class Online extends Student {
    
    
      public Online(){
          
          super();
          
      }
      
    @Override
    public void calculate(){
        extrafee=0;
        tutionfee=24000;
        System.out.println("How many credits you have taken:");
        int r=sc.nextInt();
        System.out.println("Per credit fee is 3500");
        int totalcreditfee=(r*3500);
        System.out.println("Total credits fee:"+totalcreditfee);
        System.out.println("No extra fee");
        int total=tutionfee+extrafee+totalcreditfee;
        System.out.println(".....................................");
        System.out.println("The total cost is: "+total);
        
    }
    
}