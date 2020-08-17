/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment4;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaAssignment4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("enter radius ");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        Circle c=new Circle();
        System.out.println("Radius = "+c.getRadius()+" Area = "+c.getArea());        
        Circle c1=new Circle(r);
        System.out.println("Radius = "+c1.getRadius()+" Area = "+c1.getArea());
        
        // TODO code application logic here
    }
    
}
class Circle
{
   private double radius;
   private String color;
   Circle()
   {
     this.radius=1.0;
     this.color="red";
   }
   Circle(double radius)
   {
       this.radius=radius;
       
   }
   public double getRadius()
   {
       return this.radius;
   }
   public double getArea()
   {
       double area=3.14*this.radius*this.radius;
       return area;
   }
}
