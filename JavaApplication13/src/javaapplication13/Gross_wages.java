/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Steven
 */
public class Gross_wages { 
    //private int [] intArray;
    private int[] total;
    private int total_amount;
    
    
 public Gross_wages(int[] into){
     
  
     for (int i = 0; i < into.length; i++) {
         
     
     total[i] = into[i];
      i++;       
          
     
    }
     
    
    }
 public  int getGross_wages(){
      
      int total_wages =0;
      
    /*  for (int index = 0; index < total.length; index++)
     total_wages += total[index];
        */
 // Return the total.
 
         for (int i = 0; i < total.length; i++)
             total_wages += total[i];
         return total_wages;
      
        }
    
    
    }
 

