/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;
public class Area {
    private int l,b,r;
    public Area()//default constructor
    {
        System.out.println("This is default constructor");
    }
    public double getarea(int x)
    {
       r=x;
       double area =3.14*r*r;
       return area;
    }
    public Area(int x,int y)//Parametrized constructor
    {System.out.println("This is parametrized constructor");
        l=x;b=y;}
    public int rect_area()
    {
        return l*b;
    }
    public static void main(String[] args) {
        Area obj1=new Area();
        System.out.println("Area of circle: "+obj1.getarea(2));
        Area obj2 =new Area(5,3);
        System.out.println("Area of rectangle: "+obj2.rect_area());
    }
}
