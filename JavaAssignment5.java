/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment5;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaAssignment5 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter complex value   ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Complex c1=new Complex(5,5);
        Complex c=new Complex(a,b);
         System.out.println("Addition of two numbers is = "+c.add(c1));
        System.out.println("Difference of two numbers is = "+c.difference(c1));
        System.out.println("Product of two numbers is = "+c.product(c1));

        // TODO code application logic here
    }
    
}
class Complex
{
    int real;
    int imaginary;
    Complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    
    public Complex add(Complex a)
    {
        return new Complex(this.real+a.real,this.imaginary+a.imaginary);
    }
    public Complex difference(Complex a)
    {
        return new Complex(this.real-a.real,this.imaginary-a.imaginary);
    }
    public Complex product(Complex a)
    {
        return new Complex(this.real*a.real,this.imaginary*a.imaginary);
    }
    
}
