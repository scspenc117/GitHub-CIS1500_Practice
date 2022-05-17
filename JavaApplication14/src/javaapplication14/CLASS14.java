/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author Steven
 */
public class CLASS14 {
    
    /*int[][] numbers = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} }; */
    private int[][] account_number = {  {5658845,4520125, 7895122, 8777541, 8451277, 1302850},
                                        {8080152, 4562555, 5552012, 5050552, 7825877, 1250255},
                                        {1005231, 6545231, 3852085, 7576651, 7881200, 4581002}};  
    
    
    
   // public int check_number(int search_number)
    
    public boolean search_for_number (int search_number) {
        int index;
        
        int element;
        boolean found;
        index = 0;
        
        element = -1;
        found = false;
        
        while (!found && index < account_number.length) {
            if (account_number[index] != int[][] account_number = {  {5658845,4520125, 7895122, 8777541, 8451277, 1302850},
                                        {8080152, 4562555, 5552012, 5050552, 7825877, 1250255},
                                        {1005231, 6545231, 3852085, 7576651, 7881200, 4581002}};  ) {
                found =true;
               // element = index;
            }
            index++;
          }
        return found;
        
    /*    for (int i = 0; i < account_number.length; i++) {
            
        } */
    }
}
