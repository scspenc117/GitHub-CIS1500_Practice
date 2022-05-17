/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter7_5;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Steven
 */
public class Chapter7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  double GROSSPAY;
         System.out.println("Please Enter hrs");
        
            help box = new help();
            
         Scanner payroll = new Scanner(System.in);
            String hrs = payroll.nextLine();
            int HOURS = Integer.parseInt(hrs);
         
                  System.out.println("Please Enter payrate");
                   String payrate = payroll.nextLine();
                   double PAYRATE = Double.parseDouble(payrate);
                   box.setGROSSPAY1(HOURS, PAYRATE);
           
       
         //String payroll1 = payroll.nextLine();
        //double GROSSPAY = Double.parseDouble(payroll1);
        
        
          System.out.println("Gross pay is " +  box.getGROSSPAY());
           
     
         
        // TODO code application logic here
    }
    
}
