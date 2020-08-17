/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram1_1;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaProgram1_1 
{
    interface add
    {
        public float add(float a,float b);
    }
    interface difference
    {
        public float difference(float a,float b);
    }
    interface product
    {
        public float product(float a,float b);
    }
    interface division
    {
        public float division(float a,float b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
   
        add add=(float a, float b)->a+b;
       difference difference=(float a, float b)->a-b;
       product product=(float a, float b)->a*b;
       division division=(float a, float b)->
       {
           try
           {
               if(b==0)
               {
                   throw new ArithmeticException();
               }
               return a/b;
           }
           catch(ArithmeticException e)
           {
               System.out.println("Denominator can not be zero");
           }
           return 0;
       };
       System.out.println("addition of two numbers is "+add.add(5f,15f));
       System.out.println("difference of two numbers is "+difference.difference(5f,15f));
       System.out.println("product of two numbers is "+product.product(5f,15f));
       System.out.println("division of two numbers is "+division.division(5f,15f));


        // TODO code application logic here
    
    }
    
}
