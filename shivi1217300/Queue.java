/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Queue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]queue= new int[100];
        int front=0,back=0,counter=0;
        while(true)
        {
            if(counter==1)
                break;
            System.out.println("1.Insert an element\n2.Delete an element\n3.Print the elements of queue\n4.Exit");
            System.out.print("Enter the choice you want to perform: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    int value=sc.nextInt();
                    queue[front]=value;
                    front++;
                    System.out.println("\nElement "+value+" is inserted to the queue");
                    break;
                case 2:
                    int del;
                    if(front==back&&back!=100)
                    {
                        System.out.println("Queue is empty");
                    }
                    del=queue[back];
                    back++;
                    System.out.println("Element"+del+" is deleted from queue");
                    break;
                case 3:
                    if(front==back&&back!=100)
                    {
                        System.out.println("Queue is empty");
                    }else{
                    System.out.println("Elements of queue are: ");
                    for(int i=back;i<front;i++)
                    {
                        System.out.print(queue[i]+" ");
                    }System.out.println("");
                    }
                    break;
                case 4:
                    counter=1;
                    break;
                default:
                    System.out.println("You entered the wrong choice!!");
            }
        }
    }
}
