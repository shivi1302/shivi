/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
 ***
*   *
*   *
*   *
 ***
*   *
*   *
*   *
 ***
 */
public class Pattern13 {
    public static void main(String[] args) {
        int row,col;
        for(row=1;row<=9;row++)
        {
            for(col=1;col<=5;col++)
            {
                if(row==1||row==5||row==9)
                {
                   if(col==1||col==5)
                   {
                       System.out.print(" ");
                   }else
                   {
                       System.out.print("*");
                   }
                }else
                {
                    if(col==1||col==5)
                   {
                       System.out.print("*");
                   }else
                   {
                       System.out.print(" ");
                   }
                }
            }
            System.out.println();
        }
    }
}
