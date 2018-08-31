package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckDateFormat extends Thread {

   private String [] array;
    CheckDateFormat(String []  a){this.array=a;}
    public void run(){

     String date =array[2];

     boolean t= validateDate(date);

    //System.out.print(date);

     if(t){

         System.out.println("Date is in proper format");
         SaveDb Db = new SaveDb(array);
         Db.start();
     }
     else{
         //System.out.println("The date you provided is in an " +"invalid date format.");
     }
    }
    public boolean validateDate(String date)
    {
      try{
         SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
         format.setLenient(false);
         Date javaDate=format.parse(date);
          System.out.println("Date after validation: " + javaDate);
        }
          catch (ParseException e)
        {
            System.out.println("The date you provided is in an " +"invalid date format.");
            return false;
        }
        /* Return 'true' - since date is in valid format */
        return true;

    }

}
