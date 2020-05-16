/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;
import java.util.Scanner;
public class Linear_search{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int num=sc.nextInt();
        int[]arr=new int[num];
        System.out.println("Enter the elements of array: ");
        int i;
        for(i=0;i<num;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        System.out.print("Enter the element to be searched: ");
        int item = sc.nextInt();
        int flag=0;
        for(i=0;i<num;i++)
        {
            if(item==arr[i])
            {
                System.out.print("Item found at "+i+" position.\n");
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.print("Item not found\n");
        }
    }
}
