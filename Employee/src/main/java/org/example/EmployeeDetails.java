package org.example;

public class EmployeeDetails
{
    public static void main(String[] args)
    {
        Employee1 e=new Employee1();
        e.setFirstname("Ramesh");
        e.setLastName("N");
        e.setGender("Male");
        e.setJobTitle("Quality Analyst");
        e.setId(101);
        e.setSalary(20000.0);

        Bank B=new Bank();
        B.setAccountNum(1564531652);
        B.setAccountType("Current Account");
        B.setBankName("Union Bank Of India");
        B.setAccountBalance(50000.0);
        System.out.println("Employee Firstname:"+ e.getFirstname());
        System.out.println("Employee Lastname:"+ e.getLastName());
        System.out.println("Employee id:" +e.getId());
        System.out.println("Employee Salary:" +e.getSalary());
        System.out.println("Employee Bank Details");
        System.out.println("Employee Bank Account Number:" +B.getAccountNum());
        System.out.println("Employee Bank Account Type:"+B.getAccountType());
        System.out.println("Employee Bank Name:" +B.getBankName());
        System.out.println("Employee Bank Account Balance:"+B.getAccountBalance());
    }
}
