package com.collections.pratise;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("hello Nitish !!!!!");
        List<String> str = new ArrayList<>();
        str.add("nitish");
        str.add("rashu");
        str.add("navneet");
        Iterator it = str.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("for each loop");

        for (String string : str) {
            System.out.println(string);    
        }
        
    }
}
