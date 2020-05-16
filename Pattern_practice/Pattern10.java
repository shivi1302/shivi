/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
public class Pattern10 {
    public static void main(String[] args) {
        int row,col,space=8;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=6-row;col++)
            {
                System.out.print("*");
            }
            for(col=1;col<=2*row-2;col++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=6-row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(row=6;row<=10;row++)
        {
            for(col=1;col<=row-5;col++)
            {
                System.out.print("*");
            }
            for(col=1;col<=space;col++)
            {
                System.out.print(" ");
            }space=space-2;
            for(col=1;col<=row-5;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
