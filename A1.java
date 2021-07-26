package com.patilneeraj;
import java.util.*;

class employee{
    String e_name = null;
    int emp_id = 0;
}

public class Main {
    public static void main(String[] args) {
        Vector <employee> emp = new Vector<>();
        System.out.println("Enter the number of employees");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the names and id of employees");
        while(n!=0) {
            employee e = new employee();
            e.e_name = sc.next();
            e.emp_id = sc.nextInt();
            emp.add(e);
            n--;
        }
        for (int i = 0; i < emp.size(); i++) {
            System.out.println("Employee ID : "+emp.get(i).emp_id+" Employee Name : "+emp.get(i).e_name);
        }
        int cond = 1;
        System.out.print("What do you want to do? \n1. Insert a new value \n2. Insert value at index \n" +
                "3. Delete a value \n4. Get the first element \n5. Clear all values \n6. Check a name \n7. Print the vector\n");
        while(cond != 0) {
            cond = sc.nextInt();
            switch (cond)
            {
                case 1:
                    employee e1 = new employee();
                    System.out.println("Enter the name and id of employee");
                    e1.e_name = sc.next();
                    e1.emp_id = sc.nextInt();
                    emp.add(e1);
                    break;
                case 2:
                    employee e2 = new employee();
                    System.out.println("Enter the index at which you want to insert");
                    int index = sc.nextInt();
                    System.out.println("Enter the name and id of employee");
                    e2.e_name = sc.next();
                    e2.emp_id = sc.nextInt();
                    emp.insertElementAt(e2, index);
                    break;
                case 3:
                    System.out.println("Enter the index at which you want to delete");
                    int del = sc.nextInt();
                    emp.remove(del);
                    break;
                case 4:
                    System.out.println("The first element of vector is");
                    employee e3 = emp.firstElement();
                    System.out.println("Employee ID : "+e3.emp_id+" Employee Name : "+e3.e_name);
                    break;
                case 5:
                    emp.clear();
                    break;
                case 6:
                    System.out.println("Enter the name you want to check");
                    String nam = sc.next();
                    int t = 0;
                    for (; t < emp.size(); t++) {
                        if (emp.get(t).e_name.equals(nam)){
                            System.out.println("Employee present in the vector");
                            System.out.println("Employee ID : "+emp.get(t).emp_id+" Employee Name : "+emp.get(t).e_name);
                            break;
                        }
                    }
                    if(t >= emp.size()) {
                        System.out.println("Not found");
                    }
                    break;
                case 7:
                    for (int i = 0; i < emp.size(); i++) {
                        System.out.println("Employee ID : "+emp.get(i).emp_id+" Employee Name : "+emp.get(i).e_name);
                    }
                    break;
            }
        }
    }
}
