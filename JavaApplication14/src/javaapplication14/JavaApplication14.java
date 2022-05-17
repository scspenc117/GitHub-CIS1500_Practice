/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean  output;
        
        System.out.println("Please enter a number to search for: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int search_number =Integer.parseInt(input);
           CLASS14 var = new CLASS14();
          // output = CLASS14.search_for_number(search_number);
           output = var.search_for_number(search_number);
           
           System.out.println("The value is " + output );
        /*while( search_number.hasnext()) {
            
        }*/
    }
}
    

