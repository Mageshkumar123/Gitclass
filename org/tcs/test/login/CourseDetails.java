package org.tcs.test.login;



import java.util.HashMap;
import java.util.Map;


public class CourseDetails {
public static void main(String[] args) {
  Map<Integer,String> m =new HashMap<>();
  
  m.put(10, "java");
  m.put(20, "python");
  m.put(30, "sql");
  m.put(40, "selenium");
  m.put(20,  "framework");
  System.out.println(m);
  
  
 int e = m.size();
 System.out.println(e);
 boolean w = m.containsKey(10);
 System.out.println(w);
   
   
   
}
}