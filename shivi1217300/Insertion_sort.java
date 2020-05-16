/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Insertion_sort {
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
        int key,j;
        for(i=1;i<num;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
            j--;
            }
        arr[j+1]=key;
        }
        System.out.println("Sorted array is: ");
        for(i=0;i<num;i++)
            System.out.println(arr[i]+" ");
    }
}
