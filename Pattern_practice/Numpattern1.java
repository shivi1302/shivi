/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_practice;
/*
10101
01010
10101
01010
10101
*/

public class Numpattern1 {
    public static void main(String[] args) {
        int row,col;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=5;col++)
            {
                if(row%2==0)
                {
                    if(col%2==0)
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
                else
                {
                    if(col%2==0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
