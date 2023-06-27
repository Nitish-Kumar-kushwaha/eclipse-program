package PrototypePettern;

public class Employee {
    private int empno;
    private String name;
    private String course;
    private double fee;

    public Employee() {
        System.out.println("EMp\t EMP name\t Course\t fee\n");
        System.out.println("______________");

    }

    public Employee(int empno, String name, String course, double fee) {
        this.empno = empno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public void ShowEmpDetails() {
        System.out.println(empno + " " + name + " " + course + " " + fee);
    } 

    
}
