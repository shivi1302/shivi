/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
*********
 *     *
  *   *
   * *   
    *
 */
public class Pattern7 {
    public static void main(String[] args) {
        int row,col,space=1,star=5;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=space;col++)
            {
                System.out.print(" ");
            }space++;
            for(col=1;col<=2*star-1;col++)
            {
                if(row==1||row==5||col==1||col==2*star-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }star--;
            System.out.println();
        }
    }
 
}
