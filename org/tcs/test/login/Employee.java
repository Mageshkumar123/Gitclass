package org.tcs.test.login;

public class Employee {
	
public static int a;
public void add() {
a=20;
System.out.println(a);
}
public static void main(String[] args) {
	Employee e = new Employee();
    System.out.println("before initialization:"+a);
    
    e.add();
    System.out.println("after initialization:"+a);
    
    Employee e1 = new Employee();
    System.out.println(a);
	
}
}
