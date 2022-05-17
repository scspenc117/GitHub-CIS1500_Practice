/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account_validation;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class Account_validation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String name;
        System.out.print("What is your test score ");
        Scanner keyboard = new Scanner(System.in);
           name = keyboard.nextLine();
           int count = Integer.parseInt(name);
           
           problemthree box = new problemthree();
           
           box.setaccountnumber(count);
           
           System.out.println("The value is " +
                 box.getaccountnumber());
    }
}
        /*int[] account_number = {5658845, 4520125, 7895122 , 877541, 8451277,
            
            8080152,4562555, 5552012, 5050552, 7825877, 1005231, 6345231, 3852085, 7576651, 7881200, 13028250, 1250255,4581002};
        Arrays.sort(account_number);
                
        
            int results = Arrays.binarySearch(account_number, count);
            System.out.println(results);
                
    }
   
 
        // TODO code application logic her
    
}
*/