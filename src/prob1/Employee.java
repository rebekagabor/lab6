package prob1;

import java.util.ArrayList;
import java.util.Scanner;
class Employee
{
    private String name;
    private String email;
    private int hourrate;
    private int capacity;
    private int freedays;

    public Employee(String name,String email,int hourrate,int capacity,int freedays)
    {
        this.name=name;
        this.email=email;
        this.hourrate=hourrate;
        this.capacity=capacity;
        this.freedays=freedays;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }

    public int getHourrate()
    {
        return hourrate;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public  int getFreedays()
    {
        return freedays;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public void setemail(String email)
    {
        this.email=email;
    }

    public void sethourrate(int hourrate)
    {
        this.hourrate=hourrate;
    }

    public void setcapacity(int capacity)
    {
        this.capacity=capacity;
    }

    public void setfreedays(int freedays)
    {
        this.freedays=freedays;
    }

    public int calculateDailyIncome() {
        return hourrate * capacity;
    }

    public int calculateMonthlyIncome()
    {int dailyincome=calculateDailyIncome();
        return dailyincome*(30-freedays);

    }

}

