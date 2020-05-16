/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
*
**
***
****
*****
****
***
**
*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
public class Pattern8 {
    public static void main(String[] args) {
       int row,col,star=4,space=4;
       for(row=1;row<=5;row++)
       {
           for(col=1;col<=space;col++)
           {
               System.out.print(" ");
           }space--;
           for(col=1;col<=row;col++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
       for(row=6;row<=9;row++)
       {
          for(col=1;col<=row-5;col++)
          {
              System.out.print(" ");
          }space++;
          for(col=1;col<=star;col++)
          {
              System.out.print("*");
          }star--;
           System.out.println();
       }
       
        /*int row,col,star=4;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(row=6;row<=9;row++)
        {
            for(col=1;col<=star;col++)
            {
                System.out.print("*");
            }star--;
            System.out.println();
        }*/
        
    }
}
