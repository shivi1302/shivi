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
public class Example {
    static String college="JMIT";//Static member
    private int roll,age;
    private String name;
    public void getdata(int x,int y,String z)
    {
        roll=x;
        age=y;
        name=z;
    }
    public static void getcollege()//Static function
    {
       college="Seth jai parkash mukand lal institute of engineering and technology"; 
    }
    public void display()
    {
        System.out.println(name+" "+roll+" "+age+" "+college);
    }
    public static void main(String[] args) {
        Example obj1 =new Example();
        obj1.getdata(1217300,21,"Shivi");//instance methood call
        obj1.display();
        Example obj2 =new Example();
        obj2.getdata(1217300,21,"Shivi");
        Example.getcollege();//Static method call
        obj2.display();
    }
}
