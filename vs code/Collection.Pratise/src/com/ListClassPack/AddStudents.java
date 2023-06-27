package com.ListClassPack;

import java.util.*;


public class AddStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> stdList = new ArrayList<>();
        boolean c = true;
        do{
            
            Student s = new Student(0, null, null, 0);
            System.out.println("enter the roll no");
            int r = sc.nextInt();
            s.setRollNo(r);

            System.out.println("enter the name");
            String nam = sc.next();
            s.setName(nam);

            System.out.println("entre the course");
            String cour = sc.next();
            s.setCourse(cour);

            System.out.println("entre the fees");
            float fe = sc.nextFloat();
            s.setFees(fe);
            stdList.add(s);

            String choice = sc.next();
            if(choice.equalsIgnoreCase("yes"))
                c = true;
            else
                c=false;    

        }while(c);

        
        Iterator it = stdList.iterator();
        while (it.hasNext()) {
            Student a = (Student) it.next();
            System.out.println(a.getRollNo() + " " + a.getName() + " " + a.getCourse() + " " + a.getFees());
        }
        
    }
}
