package com.collection.employeehandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Chirag
 */
public class ManageCollection {
        Scanner sc = new Scanner(System.in);
    public Employee addEmployee(){
                Employee e = new Employee();
                System.out.print("Enter EmpNo :- ");
                e.setEno(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter EmpName :- ");
                String name = sc.nextLine();
                e.setEname(name);
                System.out.print("Enter Salary :- ");
                e.setSalary(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter Designation :- ");
                e.setDesg(sc.next());
                sc.nextLine();
                System.out.print("Enter Department :- ");
                e.setDept(sc.next());
                sc.nextLine();
                return e;
    }
    public void showAllEmployee(ArrayList<Employee> emplist){
        for(Employee emp:emplist){
                    System.out.println(emp.toString());
                }
    }
    public void clearList(ArrayList<Employee> emplist){
        emplist.clear();
    }
    
    public ArrayList<Employee>  removeEmployee(ArrayList<Employee> emplist){
        System.out.println("Enter Employee Id :- ");
        int empno = sc.nextInt();
        Iterator<Employee> it = emplist.iterator();
        boolean employeefound = false;
        while(it.hasNext()){
            Employee e = it.next();
            if(empno == e.getEno())
            {
                emplist.remove(e);
                employeefound = true;
                break;
            }
        }
        if(employeefound){
            System.out.println("Employee removed from record");
        } 
        else{
            System.out.println("Employee not found in record");
        }
        return emplist;
    }
    
    public ArrayList<Employee> updateSalary(ArrayList<Employee> emplist){
        System.out.print("Enter Employee Id :- ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new salary :-");
        int sal = sc.nextInt();
        sc.nextLine();
        Iterator<Employee> it = emplist.iterator();
        boolean employeefound = false;
        
        while (it.hasNext()) {
            Employee next = it.next();
            if(empid == next.getEno()){
                next.setSalary(sal);
                employeefound = true;
                break;
            }
        }
        
        if (employeefound) {
            System.out.println("Salary Updated !");
        } else {
            System.out.println("Employee not found !");
        }
        return  emplist;
    }
    
    public int searchEmployee(ArrayList<Employee> emplist){
        System.out.println("Enter employee id");
        int empid = sc.nextInt();
        
        Iterator<Employee> it = emplist.iterator();
        int  employeefoundAt = -1;
        
        while (it.hasNext()) {
            Employee next = it.next();
            if(empid == next.getEno()){
                employeefoundAt = emplist.indexOf(next);
                break;
            }
        }
        return employeefoundAt;
    }
    
    public ArrayList<Employee> departmentWiseList(ArrayList<Employee> emplist){
        System.out.println("Which department?");
        String deptname = sc.next();
        sc.nextLine();
        ArrayList<Employee> deptWiseList = new ArrayList<>();
        Iterator<Employee> it = emplist.iterator();
        
        while (it.hasNext()) {
            Employee next = it.next();
            if(next.getDept().equals(deptname)){
                deptWiseList.add(next);
            }
        }
        return deptWiseList;
    }
}
