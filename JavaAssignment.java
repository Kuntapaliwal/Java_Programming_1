/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaAssignment 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        genericMethod generic=new genericMethod();
        generic.genericMethod(10,9,8,7,6,5,123);
        generic.genericMethod(10,9,"hello",6,5,"abc",123,"ghy");
        // TODO code application logic here
    }
    
}
class CustomException extends Exception
{
    @Override
    public String getMessage()
    {
      return "Strings are not allowed in this generic function \n ";   
    }    
}
class genericMethod
{
   public <T> void genericMethod(T... args)
   {
       int printableItem=(args.length * 2)/3;
       try
       {
           for(T i:args)
           {
               if(i instanceof String)
               {
                   throw new CustomException();
               }
           }
           for(int i=0;i<printableItem;i++)
           {
               System.out.println(args[i]);
           }
       }
       catch(CustomException e)
       {
           System.out.println(e.getMessage());
       }
   }
}
       
