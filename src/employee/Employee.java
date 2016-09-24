/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author mac
 */
public class Employee {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    //a first name (type String), a last name (type String) and a monthly salary (double).
    
    
    private String first_name = null;
    
    private String last_name = null;
    
    private double monthly_salary = 0.0;
    
    
    public void setFirstName(String name)
    {
        first_name = name;
    }
    
    public String getFirstName()
    {
        return first_name;
    }
            
    public void setLastName(String name)
    {
        last_name = name;
    }
            
    public String getLastName()
    {
        return last_name;
    }
    
    public void setMonthlySalary(double sal)
    {   
        if !(sal >= 0)
                {
                    System.out.println("Sorry. This Salary Is Too Low.");
                }
        
        else
            monthly_salary = sal;
    }
    
    public double getMonthlySalary()
    {
        return monthly_salary;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
