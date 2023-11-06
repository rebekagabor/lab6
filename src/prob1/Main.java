package prob1;

import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n=");
        int n=scanner.nextInt();
        ArrayList<Employee>employees=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("name:");
            String name=scanner.next();
            System.out.println("email:");
            String email=scanner.next();
            System.out.println("hourly rate:");
            int hourrate=scanner.nextInt();
            System.out.println("capacity work hours per day:");
            int capacity=scanner.nextInt();
            System.out.println("free days:");
            int freedays=scanner.nextInt();

            Employee employee=new Employee (name, email,hourrate,capacity,freedays);
                    employees.add(employee);
        }
        System.out.println("monthly salaries:");
        for(Employee employee:employees)
        {
            System.out.println("name:"+ employee.getName());
            System.out.println("monthly income:"+employee.calculateMonthlyIncome());
            System.out.println();
        }
    }
}