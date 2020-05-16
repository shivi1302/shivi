/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;

/**
 *
 * @author DELL
 */
public class Polymorphism{
    void print()
    {
        System.out.println("This is parent class");
    }
}
class Sub_class extends Polymorphism
{
    void print()//overriding
    {
        System.out.println("This is sub_class");
    }
    public static void main(String[] args) {
        Sub_class obj1 =new Sub_class();
        obj1.print();
        Polymorphism obj2 = new Polymorphism();
        obj2.print();
    }
}
