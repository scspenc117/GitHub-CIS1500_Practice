/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter7_problem5;

import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class Chapter7_problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter a value");   

         String name;
         String enteredvalu;
        //System.out.print("What is your test score ");
        Scanner keyboard = new Scanner(System.in);
           name = keyboard.nextLine();
           int count = Integer.parseInt(name);
           int[] array = new int[count];
           
           
           while (count != -1) {            
            
        
           
                   System.out.println("Please enter values until pressed -1");
                   enteredvalu =keyboard.nextLine();
                     int count = Integer.parseInt(name);
                     if(count <0)
                         break;
                     
                        else
                         array = += count;
           
           sequentialSearch(array,  count);
    }
         
           
           
    public static int sequentialSearch(int[] array,int value)
     {
     int index; // Loop control variable
     int element; // Element the value is found at
     boolean found; // Flag indicating search results

 // Element 0 is the starting point of the search.
     index = 0;

 // Store the default values element and found.
     element = -1;
     found = false;

     // Search the array.
    while (!found && index < array.length)
     {
     if (array[index] == value)
     {
     found = true;
        element = index;
     }
     index++;
     }

     return element;
         }
     }
// TODO code application logic here
            
            

    
    
