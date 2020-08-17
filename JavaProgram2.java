/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram2;
import java.util.*;
/**
 *
 * @author User
 */
 class Rectangle
{
    int width;
    int height;
    public Rectangle()
            {
              this.width=0;
              this.height=0;
            }
    public void display()
    {
        System.out.println("width = "+width+" "+ "height = "+height);
    }
}
 class RectangleArea extends Rectangle
{
    Scanner sc=new Scanner(System.in);
    
   public void read_input()
   {
       height=sc.nextInt();
       width=sc.nextInt();
       
   }
   public void display()
    {
        long area=width*height;
        System.out.println("Area = "+area);
    }
    
}
public class JavaProgram2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        RectangleArea RA=new RectangleArea();
        RA.read_input();
        RA.display();
        // TODO code application logic here
    }
    
}
