/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
     *****
    *****
   *****
  *****
 *****
 */
public class Pattern4 {
    public static void main(String[] args) {
        int row,col,star=5,space=5;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=space;col++)
            {
                System.out.print(" ");
            }space--;
            for(col=1;col<=star;col++)
            {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
