package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OtherFunctions {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		
		setEmplyeeData(emp);
		
		Employee em = emp.stream().max(Comparator.comparing(Employee::getId)).get();
		
		Employee employee =
				emp.stream().max(Comparator.comparing(Employee::getId)).get();
		
		System.err.println(employee.getName());
		
		System.out.println(em.getName());
		
		emp.stream().filter(e -> e.getName().equals("akash")).collect(Collectors.toList()).forEach(e -> System.out.println("ds " + e.getId()));
		
	}
	
	
	public static void setEmplyeeData(List<Employee> emplList) {
		
		Employee employee1 = new Employee();
		
		employee1.setId(1);
		employee1.setName("akash");
		employee1.setCity("kanpur");
		
		Employee employee2 = new Employee();
		
		employee2.setId(2);
		employee2.setName("akash1");
		employee2.setCity("kanpur");
		
		Employee employee3 = new Employee();
		
		employee3.setId(33);
		employee3.setName("akash3");
		employee3.setCity("kanpur2");
		
		Employee employee4 = new Employee();
		
		employee4.setId(4);
		employee4.setName("akash4");
		employee4.setCity("Delhi");
		
		emplList.add(employee1);
		emplList.add(employee2);
		emplList.add(employee3);
		emplList.add(employee4);
		
	}
}
