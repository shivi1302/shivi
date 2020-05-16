/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
*****
 *  *
  * *
   **
    *
 */
public class Pattern6 {
    public static void main(String[] args) {
        int row,col,star=5,space=1;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=space;col++)
            {
                System.out.print(" ");
            }space++;
            for(col=1;col<=star;col++)
            {
                if(row==1||row==5||col==1||col==star)
                System.out.print("*");
                else
                    System.out.print(" ");
            }star--;
            System.out.println();
        }
    }
}
