/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
10001
01010
00100
01010
10001
* 
11011
11011
00000
11011
11011
 */
public class Numpattern2 {
    public static void main(String[] args) {
        int row,col;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=5;col++)
            {
               if(row==col||row+col==6)
               {
                   System.out.print("1");
               }else
                   System.out.print("0");
               /* if(row==3||col==3)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }*/
            }
            System.out.println();
        }
    }
}
