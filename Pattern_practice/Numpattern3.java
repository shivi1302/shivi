/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;

/**
11111
22222
33333
44444
55555
* 
01110
10001
10001
10001
01110
 */
public class Numpattern3 {
    public static void main(String[] args) {
        int row,col;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=5;col++)
            {
                System.out.print(col);
                /*if(row==1||row==5)
                {
                    if(col==1||col==5)
                    {
                        System.out.print("0");
                    }else
                        System.out.print("1");
                }else
                {
                    if(col==1||col==5)
                    {
                        System.out.print("1");
                    }else
                        System.out.print("0");
                }*/
            }
            System.out.println();
        }
    }
}
