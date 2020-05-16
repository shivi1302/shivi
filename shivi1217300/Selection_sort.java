/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Selection_sort {
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
        int min,j,pos,temp;
        for(i=0;i<num;i++)
        {
            min=arr[i];
            pos=i;
            for(j=0;j<num-i-1;j++)
            {
                if(min>arr[i+j+1])
                {
                    min=arr[i+j+1];
                    pos=i+j+1;
                }
            }
            if(pos!=i)
            {
                temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
        }
        System.out.print("Sorted array: ");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
