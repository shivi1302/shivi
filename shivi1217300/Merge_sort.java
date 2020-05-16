/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Merge_sort {
    void merge(int arr[],int beg,int mid,int end)
    {
        int l=mid-beg+1;
        int r=end-mid;
        int[]leftarr= new int[l];
        int[]rightarr=new int[r];
        for(int i=0;i<l;i++)
        {
            leftarr[i]=arr[beg+i];
        }
        for(int j=0;j<r;j++)
        {
            rightarr[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=beg;
        while(i<l&&j<r)
        {
            if(leftarr[i]<=rightarr[j])
            {
                arr[k]=leftarr[i];
                i++;
            }else
            {
                arr[k]=rightarr[j];
                j++;
            }k++;
        }
        while(i<l)
        {
            arr[k]=leftarr[i];
            i++;
            k++;
        }
        while(j<r)
        {
            arr[k]=rightarr[j];
            j++;
            k++;
        }
    }
    void sort(int arr[],int beg,int end)
    {
        if(beg<end)
        {
            int mid=(beg+end)/2;
            sort(arr,beg,mid);
            sort(arr,mid+1,end);
            merge(arr,beg,mid,end);
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
        Merge_sort obj =new Merge_sort();
        obj.sort(arr,0,num+1);
        System.out.println("Sorted array: ");
        for(i=0;i<num;i++)
        {
           System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
