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
 class Building {
    int age;
    float bill;
    String name;
    public Building(String x,int y)//constructor of super class
    {
        name=x;
        age=y;
    }
    public void set_bill(float a)
    {
        bill=a;
    } 
}
class Food extends Building
{
    float bill;
    public Food()
    {
        super("Taniv",20);//invoking constructor of super class
        System.out.println(name+" "+age);
        System.out.print("Total bill of the customer is : ");
    }
    public void setBill(float z) {
        this.bill = z;
    }
    public float totalbill()
    {
        float tbill=super.bill+this.bill;
        return tbill;
    }
    public static void main(String[] args) {
        Food obj1=new Food();
        obj1.set_bill(1000);
        obj1.setBill(500);
       System.out.println( obj1.totalbill());
    }
}

        