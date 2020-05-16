/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;
public interface Abc {
    void set_val(int x,int y);
    void print();
}
class Xyz implements Abc{
    int a,b,c;
    public void set_val(int x,int y)
    {
        a=x;b=y;
    }
    public void print()
    {
       System.out.println("two numbers are: "+a+" and "+b); 
    }
    public static void main(String[] args) {
        Xyz obj1 =new Xyz();
        obj1.set_val(3,1);
        obj1.print();
    }
}
