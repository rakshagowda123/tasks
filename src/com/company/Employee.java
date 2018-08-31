package com.company;

import java.util.Date;

public class Employee {
    String name;
    String email;
    Date d;
    int Id;

    Employee(){}
    Employee(String n, String e, Date d , int i){

        this.name=n;
        this.email=e;
        this.d=d;
        this.Id=i;

    }

    public void setName(String n){this.name=n;}
    public void setEmail(String e){this.email=e;}
    public void setD(Date d){this.d=d;}
    public void setId(int i){this.Id=i;}

    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    public Date getD(){return this.d;}
    public int getId(){return this.Id;}

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Employee)
        {
            Employee temp = (Employee) obj;
            if(this.Id == temp.Id)
               return true;
           // return email.equals(temp.email);
        }
        else {
             System.out.println("duplicates present");

        }
        return false;
    }

    @Override
    public int hashCode(){return Id;}
}
