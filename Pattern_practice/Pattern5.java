/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
 *
 * @author DELL
    *
   **
  * *
 *  *
*****
 */
public class Pattern5 {
    public static void main(String[] args) {
        int row,col,space=5;
        for(row=0;row<=5;row++)
        {
            for(col=1;col<=space;col++)
            {
                System.out.print(" ");
            }space--;
            for(col=1;col<=row;col++)
            {
                if(row==1||row==5||col==1||col==row)
                System.out.print("*");
                else
                  System.out.print(" ");  
            }
            System.out.println();
        }
    }
}
