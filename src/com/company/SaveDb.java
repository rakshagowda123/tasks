package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Integer.parseInt;

public class SaveDb extends Thread {
    protected Employee employee;
    String[] array;

    SaveDb(String[] a) {
        this.array = a;
    }

    public void run() {

        Employee e = new Employee();
        e.setName(array[0]);
        e.setEmail(array[1]);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        format.setLenient(false);
        try {
            Date javaDate = format.parse(array[2]);
            e.setD(javaDate);
        } catch (java.text.ParseException e1) {
            System.out.println(e1);
        }
        e.setId(parseInt(array[3]));

        // CheckDuplicates cd = new CheckDuplicates(e);
        // cd.start();

        List<Employee> list = new ArrayList<>();
        list.add(e);
        Set<Employee> s= new HashSet<Employee>();
        s.addAll(list);
        list = new ArrayList<Employee>();
        list.addAll(s);
        // final Iterator itr = hashSet.iterator();
        //if (!Main.concurrentHashMap.containsKey(employee.getEmail())) {
         //   Main.concurrentHashMap.put(employee.getEmail(), employee);


        for(Employee em:s) {
            Database db = new Database(em);
            db.start();
        }


    }
}







