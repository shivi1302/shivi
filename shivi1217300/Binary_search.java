/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int beg,mid,end;
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
        beg=0;
        end=num-1;
        mid=(int)(beg+end)/2;
        while(beg<=end)
        {
            if(arr[mid]==item)
            {
                System.out.println("Item found at "+mid+" position");
                break;
            }
            else if(arr[mid]>item)
            {
                end=mid-1;
            }
            else
                beg=mid+1;
            mid=(int)(beg+end)/2;
        }
        if(beg>end)
        {
            System.out.println("Item not found ");
        }
    }
}
