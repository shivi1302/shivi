/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

import java.util.Scanner;
public class Stack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []stack=new int[100];
        int top=-1;
        int counter=0;
        while(true)
        {
            if(counter==1)
                break;
            System.out.println("Enter the action you want to perform: ");
             System.out.println("1.Insert an element\n2.Delete an element\n3.Print the elements of stack\n4.Exit");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    int value= sc.nextInt();
                    top=top+1;
                    stack[top]=value;
                    System.out.println("***"+value+" is inserted at the top of the stack***");
                    break;
                case 2:
                    int del;
                    if(top<0)
                    {
                        System.out.println("***The stack is underflow*** ");
                    }else{
                    del=stack[top];
                    top=top-1;
                    System.out.println("***"+del+" is deleted from the top of the stack***");
                    }break;
                case 3:
                    if(top<0)
                    {
                        System.out.println("***The stack is empty***");
                    }
                    int i=top;
                    while(i>-1)
                    {
                        System.out.println(stack[i]+" ");
                        i--;
                    }break;
                case 4:
                    counter=1;
                    break;
                default:
                    System.out.println("###Entered choice is wrong!enter again.###");
                    break;
            }
        }
        System.out.println();
    }
}
