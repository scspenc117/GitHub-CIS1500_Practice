/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;
import java.util.Scanner; 

/**
 *
 * @author Steven
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] employeeid = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
            7580489};
        
        //Hours enter into array
        final int size =7;
        int [] hours = new int [size];
        int count = 0;
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number of hours with no negative numbers : ");
        //number = keyboard.nextInt();
           
        do {
            number = keyboard.nextInt();
             hours[count] = number;
             count++;
              
        } while(count<hours.length && number>=0);
        
        /*while (number >=0 && count < 7)
                {
                    hours[count] = number;
                     
                    count++;
                    if(count>7){
                        break;
                    }
                    number = keyboard.nextInt();
                    
                    //System.out.print("Enter a number or -1 to quit: ");
                   
                    
                }*/
        //payrate enter into array
        
         final int size1 =7;
        double [] payrate = new double[size1];
        int count1 = 0;
        double number1 ;
        Scanner payy = new Scanner(System.in);
        System.out.print("Enter amount of payrate with no negative values and no less than $6.00: ");
       // number1 = payy.nextDouble();
       
       do {  number1 = payy.nextDouble();
             payrate[count1] = number1;
             count++;
              
        } while(count<payrate.length &&  number1>=6.00 );
        
          /* while (number1 >=0 && count1 < 7)
                {
                    payrate[count1] = number1;
                    number1 = payy.nextDouble();
                    count1++;
                    //System.out.print("Enter a number or -1 to quit: "); */
                    
        
    
    
           
          Gross_wages this_is_total = new Gross_wages(employeeid);
                System.out.println("This is total GROSS WAGES " + 
                        this_is_total.getGross_wages());
                
                for (int i = 0; i < 7; i++) {
                    System.out.println("Enter index value: " );
                    System.out.println("Hours[] is " + hours[i] +
                            " Payrate " + payrate[i] );
            
        }
           //Gross_wages week = new Gross_wages(employeeid);
        
           //Gross_wages.setGross_wages()
           //public static void getGross_wages(int[] array)
         /*   int ref_des;
           for ( int index =0; index< employeeid.length; index++)
               ref_des = employeeid[index];
               Gross_wages box = new Gross_wages(ref_des);
           */  
           // Gross_wages(employeeid[in9dex]);
        //Gross_wages box = new Gross_wages(employeeid);
           
        /*final double size2 =7;
        double [] wages = new double[7];
        int count2 = 0;
        double number2;
        Scanner wagess = new Scanner(System.in);
        System.out.print("Enter amount of wages and no negative values: ");
        number2 = wagess.nextDouble();
           while (number2 >=0 && count2 < hours.length)
                {
                    wages[count2] = number2;
                    count2++;
                    //System.out.print("Enter a number or -1 to quit: ");
                    number2 = wagess.nextDouble();  
                        */
   }
}

