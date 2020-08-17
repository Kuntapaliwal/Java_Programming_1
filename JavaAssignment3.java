/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;
import java.util.*;
/**
 *
 * @author User
 */
public class JavaAssignment3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Employee> list = new LinkedList<>();
      for(int i=0;i<10;i++)
      {
          Employee emp=new Employee();
          emp.setEmpId(sc.nextInt());
            emp.setEmpName(sc.nextLine());
            emp.setEmpDesignation(sc.nextLine());
            emp.setEmpLocation(sc.nextLine());
            emp.setEmpSalary(sc.nextInt());
      }
      System.out.println("name of all Employees :-");
      list.stream().forEach(ename->
      {
          System.out.println(ename.getEmpName());
      });
      System.out.println(" all Salaries of Employees greater than 50000 :-");
     list.stream().filter(salary->salary.getEmpSalary()>50000).forEach(salary->
     {
         System.out.println("name : salary : "+salary.getEmpName()+" "+salary.getEmpSalary());
     });
      System.out.println("Locations which starts with M :-");
      list.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->
      {
           System.out.println(e.getEmpLocation());

      });
      System.out.println("Designations which ends with E :-");
      list.stream().filter(e->e.getEmpDesignation().endsWith("E")).forEach(e->
      {
          System.out.println(e.getEmpDesignation());
      });
      //System.out.println("hello....");
        // TODO code application logic here
    }
    
}
class Employee
{
    int empId;
    String empName;
    String empDesignation;
    int empSalary;
    String empLocation;
    public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public int getEmpSalary() {
            return empSalary;
        }

        public void setEmpSalary(int empSalary) {
            this.empSalary = empSalary;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getEmpDesignation() {
            return empDesignation;
        }

        public void setEmpDesignation(String empDesignation) {
            this.empDesignation = empDesignation;
        }

        public String getEmpLocation() {
            return empLocation;
        }

        public void setEmpLocation(String empLocation) {
            this.empLocation = empLocation;
        }
}
