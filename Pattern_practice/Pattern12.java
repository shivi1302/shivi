/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *
    +
    +
    +
    +
+++++++++
    +
    +
    +
    +
 */
public class Pattern12 {
    public static void main(String[] args) {
       
        int row,col;
        for(row=1;row<=9;row++)
        {
            for(col=1;col<=9;col++)
            {
                if(row==col||row+col==10)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        for(row=1;row<=9;row++)
        {
            for(col=1;col<=9;col++)
            {
                if(row==5||col==5)
                {
                    System.out.print("+");
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
