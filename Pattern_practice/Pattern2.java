/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

import java.awt.BorderLayout;

/*
*****
*   *
*   *
*   *
*****
 */
public class Pattern2 {
    public static void main(String[] args) {
        int row,col,star=5;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=star;col++)
            {
               if(col==1||col==star||row==1||row==star)
               {
                   System.out.print("*");
               }
               else
               {
                  System.out.print(" "); 
               }
            }
            System.out.println();
        }
    }
    
}
