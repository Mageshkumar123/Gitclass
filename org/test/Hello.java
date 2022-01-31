package org.test;

import org.tcs.test.login.Employee;

public class Hello {
	public int a;
	private void add() {
    a=70;
    System.out.println(a);
	}
	 public static void main(String[] args) {
		 
		 Employee e = new Employee();
		 System.out.println("before initialization:"+e.a);
		 e.add();
		 System.out.println(("after initialization:"+e.a));
		 
		 Employee e1 = new Employee();
		 System.out.println(e1.a);
		 System.out.println(e.a);
	
	}
    
  
	}


