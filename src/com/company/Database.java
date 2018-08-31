package com.company;

import java.io.*;
import java.sql.*;

public class Database extends Thread {
 Employee e;


    Database(Employee e){this.e=e;
    Cipher c = new Cipher();
    c.start();}

    public void run()
    {
        String str;
        String[] array = null;
        try{

         File f1 = new  File("decrypted-text.txt");
         BufferedReader b = new BufferedReader(new FileReader(f1));
         while ((str = b.readLine()) != null) {

            array = str.split(" ");
            System.out.print(array[0]);

         }
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
         final String DB_URL = "jdbc:mysql://localhost:3306/college";
            //  Database credentials
         final String USER = array[0];
         final String PASS = array[1];
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        System.out.println("Connecting to database...");

        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();

        String fname = e.getName();
        String email=e.getEmail();
        java.sql.Date  sqlDate = new Date(e.getD().getTime());
        int i = e.getId();
        System.out.println("inserted into database");

            stmt.executeUpdate("INSERT INTO `employee`(name,email,dob,id) VALUE ('"+fname+"','"+email+"','"+sqlDate+"','"+i+"')");

           stmt = conn.createStatement();
            String sql_stmt = "create table temp like employee";


           // stmt = conn.createStatement();

//            statement.executeUpdate(sql_stmt);

            stmt.executeUpdate(sql_stmt);
            //stmt = conn.prepareStatement(str);
           // stmt.executeUpdate(str);
            stmt.executeUpdate("insert into temp select * from employee group by id  ");
            stmt.executeUpdate("drop table employee");
           stmt.executeUpdate("alter table temp rename to employee ");

        conn.close();
        }catch(ClassNotFoundException |SQLException |IOException  e){ System.out.println("exception found"+e);}


    }
}
