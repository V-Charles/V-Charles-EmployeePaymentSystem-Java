
package employeepaymentsystem;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePaymentSystem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of employee: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Employee> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(additionalCharge, name, hours, valuePerHour);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        
        System.out.println();
        System.out.println("Payments: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f%", emp.payment()));
        }
        
        sc.close();
    }
}
