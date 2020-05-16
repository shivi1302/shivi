/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Quick_sort {
    int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i= (low-1);
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            return i+1;
    }
    void sort(int arr[],int low,int high)
    {
      if(low<high)
      {
          int pi=partition(arr,low,high);
          sort(arr,low,pi-1);
          sort(arr,pi+1,high);
      }
    }
    static void print_array(int arr[])
    {
        int num=arr.length;
        for(int i=0;i<num;i++)
        {
           System.out.print(arr[i]+" ");
        }
    }
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
        Quick_sort obj = new Quick_sort();
        obj.sort(arr,0,num-1);
        System.out.println("Sorted array: ");
        print_array(arr);
    }     
 }
