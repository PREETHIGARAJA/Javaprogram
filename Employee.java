import java.util.*;
public class Employee 
{
     public static void main(String args[])
     {
        Scanner S=new Scanner(System.in);
        int i;
        String EmpName[]=new String[10];
        String EmpID[]=new String[10];
        String EmpDesig[]=new String[10];
        String EmpExp[]=new String[10];
        String EmpSalary[]=new String[10];
        for(i=0;i<10;i++)
        {
            System.out.print("\nEnter Employee "+(i+1)+" Name:");
            EmpName[i]=S.next();
            System.out.print("Enter Employee "+(i+1)+" ID:");
            EmpID[i]=S.next();
            System.out.print("Enter Employee "+(i+1)+" Designation:");
            EmpDesig[i]=S.next();
            System.out.print("Enter Employee "+(i+1)+" Experience:");
            EmpExp[i]=S.next();
            System.out.print("Enter Employee "+(i+1)+" Salary:");
            EmpSalary[i]=S.next();
        }
        System.out.println("\n\t\t\t Employee Details");
        System.out.println("\t\t\t ****************");
        System.out.println("Employee ID   Employee Name   Employee Designation   Employee Experience  Employee salary");
        for(i=0;i<10;i++)
        {
            System.out.println(EmpID[i]+"\t"+EmpName[i]+"\t"+EmpDesig[i]+"\t"+EmpExp[i]+"\t"+EmpSalary[i]);
        }
        S.close();
     }   
}
