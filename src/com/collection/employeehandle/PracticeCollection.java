package com.collection.employeehandle;
import java.util.*;
import com.collection.employeehandle.ManageCollection;
/**
 *
 * @author Chirag
 */
public class PracticeCollection {
    public static void main(String[] args) {
        
        ArrayList<Employee> emplist = new ArrayList<>();
        ManageCollection mng = new ManageCollection();
        int optionno = 0;
        Scanner sc = new Scanner(System.in);
        
        while(optionno != 8){
        System.out.println("-----------------------------");
        System.out.println("Welcome To Dashboard");
        System.err.println("1. Add Employee");
        System.out.println("2. View All Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Clear Data");
        System.out.println("5. Change Salary");
        System.out.println("6. Search Employee");
        System.out.println("7. View dept-wise-list");
        System.out.println("8. Exit");
        System.out.println("-----------------------------");
        System.out.print("Enter Your Choice :- ");
        
        optionno = sc.nextInt();
        
        switch(optionno){
            case 1:
            {
                emplist.add(mng.addEmployee());
                break;
            }
            case 2:
            {
                mng.showAllEmployee(emplist);
                break;
            }
            case 3:
            {
                emplist = mng.removeEmployee(emplist);
                break;
            }
            case 4:
            {
                mng.clearList(emplist);
                break;
            }
            case 5:
            {
                emplist = mng.updateSalary(emplist);
                break;
            }
            case 6:
            {
                int index = mng.searchEmployee(emplist);
                if ( index != -1) {
                    System.out.println(emplist.get(index));
                } else {
                    System.out.println("Employee not found in record!");
                }
                break;
            }
            case 7:
            {
                for(Employee e:mng.departmentWiseList(emplist)){
                    System.out.println(e);
                }
                break;
            }
            default:
            {
                    break;
                            
            }
        }
        } 
    }
}
