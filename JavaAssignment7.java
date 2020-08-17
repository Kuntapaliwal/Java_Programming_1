/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment7;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaAssignment7 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        Triangle t1=new Triangle(a,b,c);
        System.out.println("Triangle area is "+t1.area());
        // TODO code application logic here
    }
    
}
class Triangle
{
    double a,b,c;
    Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area()
    {
        double area;
        double s=(a+b+c)/2.0;
        double ans=((s)*(s-a)*(s-b)*(s-c));
        area=Math.sqrt(ans);
        return (double)area;
    }
    
}
