package com.company;

import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    protected static Map<String,Employee> concurrentHashMap = new ConcurrentHashMap<>();
    public static void main(String[] args) {

       InputFile i = new InputFile();
       Timer timer = new Timer();
        timer.schedule(i, 0,1);
       	// write your code hi.sere
    }
}
