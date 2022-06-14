package com.ahmad;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 13 Jun 2022
 * @author Bashir Ahmad
 */
class Employee {

    private String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ":" + salary;
    }
}

public class EmployeeIncrementSalarycom {

    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        populate(l);

        System.out.println("Before Increment:");
        System.out.println(l);

        Predicate<Employee> p = e -> e.salary < 3500;
        Function <Employee, Employee> f = e -> {
            e.salary = e.salary + 477;
            return e;
        };

        System.out.println("After Increment:");
        ArrayList<Employee> l2 = new ArrayList<Employee>();
        for (Employee e : l) {
            if (p.test(e)) {
                l2.add(f.apply(e));
            }
        }
        System.out.println(l);
        System.out.println("Employees with incremented salary:");
        System.out.println(l2);
    }

    public static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Sunny", 1000));
        l.add(new Employee("Bunny", 2000));
        l.add(new Employee("Chinny", 3000));
        l.add(new Employee("Pinny", 4000));
        l.add(new Employee("Vinny", 5000));
        l.add(new Employee("Durga", 10000));
    }
}
