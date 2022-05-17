/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Steven
 */
public class help { 
   // private String name;
    private int IDnumber;
    //private double payrate;
    //private  int hours_worked;
    private double  grosspay;
    
  /*  public help(String name1, int ID1)
    {  name = name1;
         IDnumber = ID1;
              
        }
    
    */
     public void setGROSSPAY1(int hrs, double payrate)
     {
       grosspay = (double)hrs*payrate;
       
    }
    
     
    public double getGROSSPAY()
     {
     return grosspay;
            }
}
