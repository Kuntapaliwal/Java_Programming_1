/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment6;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaAssignment6 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LinkedList infoList=new LinkedList<>();
        infoList.add(new Information("Robert","64C-WallStreet",1994));
        infoList.add(new Information("Sam","68D-WallStreet",200));
        infoList.add(new Information("John","26B-WallStreet",1999));
        System.out.println("Name         Year Of Joining           Address");
        infoList.stream().forEach(e->
        {
           System.out.println(e); 
        });
// TODO code application logic here
    }
    
}
class Information
{
    String name;
    String adress;
    int joiningYear;
    Information( String name, String adress,int joiningYear)
    {
        this.name=name;
        this.adress=adress;
        this.joiningYear=joiningYear;
    }
    public String toString() 
    {
        return name + "           " + joiningYear + "               " + adress;
    }
    
}
