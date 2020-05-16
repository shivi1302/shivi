/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivi1217300;
public class Demo {
  private int a,b,c;
  public void get_values(int x,int y)
  {
      a=x;b=y;
  }
  public int get_sum()
  {
      c=a+b;
      return c;
  }
  public void print()
  {
      System.out.println("Sum of two number is: "+c);
  }
}
