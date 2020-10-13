package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student4{  
	   int id;     
	   String name;    
	   int age;         
	   public Student4(int id, String name, int age) {  
	        this.id = id;    
	        this.name = name;         
	        this.age = age;     
	   } 
	} 

public class Test2 {
	public static void main(String[] args) { 
	  List<Student4> studentlist = new ArrayList<Student4>();   
      //Adding Students      
      studentlist.add(new Student4(11,"Jon",22));      
      studentlist.add(new Student4(22,"Steve",18)); 
      List<String> names1 =  studentlist.stream().map(n ->n.name).collect(Collectors.toList());
      List<String> names = studentlist.stream().map(n->n.name).collect(Collectors.toList());
      
       Double ageavg = studentlist.stream().map(n ->n.age).collect(Collectors.averagingInt(s->s.age));
	}
}
