/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 * 
12345
23456
34567
45678
56789
 */
public class Numpattern4 {
    public static void main(String[] args) {
        int row,col,num=1;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=5;col++)
            {
                if(num<=9)
                {
                    System.out.print(num+"  "); 
                }
                else
                    System.out.print(num+" ");
                num++;
            }
            System.out.println();       
        }
        /*for(row=1;row<=5;row++)
        {num=row;
            for(col=1;col<=5;col++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }*/
    }
}
