/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;
class Outer
{
    int outer_x = 100;
    void test()
    {
        Inner inner = new Inner();inner.display();
        
    }
    static int count = 0;
    Outer()
    {
        count++;
        System.out.println(count);
    }

class Inner
{
    void display()
    {
        System.out.println("display:outer_x = " + outer_x);
        
    }
}
}



/**
 *
 * @author IMRD
 */
public class Assignment_3
{
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.test();
        
        Outer o1 = new Outer();
        Outer o2 = new Outer();
        Outer o3 = new Outer();
    }
}