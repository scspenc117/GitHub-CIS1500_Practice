/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account_validation;
import java.util.Arrays;
/**
 *
 * @author Steven
 */
public class problemthree {
    
   
   
    int index;
    
       int[] a = {5658845,4520125, 7895122 , 877541, 8451277, 
           8080152,4562555, 5552012, 5050552,
        7825877, 1005231, 6345231, 3852085, 7576651, 7881200, 13028250, 
        1250255,4581002};

        public void setaccountnumber(int w)
        {    
         Arrays.sort(a); 
         
         index =Arrays.binarySearch(a, w);
                }
        
        public int getaccountnumber(){
            return index;
        }

   

      
}
