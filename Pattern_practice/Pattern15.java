/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
  *****     *****
 *******   *******
********* *********
****codeforwin****
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *        
 */
public class Pattern15 {
     public static void main(String[] args) {
        int row,star=5,space=5,col,i=10;
        for(row=1;row<=3;row++)
        {
            for(col=1;col<=3-row;col++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=star;col++)
            {
                System.out.print("*");
            }
            for(col=1;col<=space;col++)
            {
                System.out.print(" ");
            }space=space-2;
            for(col=1;col<=star;col++)
            {
                System.out.print("*");
            }star=star+2;
            System.out.println();
        }
        for(row=4;row<=4;row++)
        {
            for(col=1;col<=row+1;col++)
            {
                System.out.print("*");
            }
            System.out.print("codeforwin");
            for(col=1;col<=row+1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(row=5;row<=15;row++)
        {
            for(col=1;col<=row-4;col++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=i*2-1;col++)
            {
                System.out.print("*");
            }i--;
            System.out.println();
        }
    }
}
