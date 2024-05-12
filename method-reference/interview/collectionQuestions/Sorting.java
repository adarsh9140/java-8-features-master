package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {


        List<Employee> emp = new ArrayList<Employee>();

        setEmplyeeData(emp);

       emp.sort(Comparator.comparing((Employee::getName)));
       emp.sort(Comparator.comparing((Employee::getName)).reversed());


       emp.forEach(e-> System.out.println("name  :: " + e.getName() + "city  :: " + e.getCity()));
    }

    public static void setEmplyeeData(List<Employee> emplList){

        Employee employee1 = new Employee();

        employee1.setId(1);
        employee1.setName("Akash");
        employee1.setCity("kanpur");

        Employee employee2 = new Employee();

        employee2.setId(2);
        employee2.setName("Bkash");
        employee2.setCity("kanpur");

        Employee employee3 = new Employee();

        employee3.setId(3);
        employee3.setName("Ckash");
        employee3.setCity("kanpur2");

        Employee employee4 = new Employee();

        employee4.setId(4);
        employee4.setName("Dkash");
        employee4.setCity("Delhi");

        emplList.add(employee1);
        emplList.add(employee2);
        emplList.add(employee3);
        emplList.add(employee4);

    }

}
