package e1_manytoone_hibernet1.controller;


import e1_manytoone_hibernet1.dao.CompanyCrud;
import e1_manytoone_hibernet1.dao.EmployeeCrud;
import e1_manytoone_hibernet1.dto.Employee;
import e1_manytoone_hibernet1.dto.Company;

public class CompanyEmployeeMain {
	
       public static void main(String[] args) {
         
    	   CompanyCrud crud = new CompanyCrud();
    	   //saving company object
////    	   Company company=new Company("testyentra", "ty@gmail.com", "banglore", "girish");
////    	   
////    	   crud.saveCompany(company);
  	   
   	   EmployeeCrud crud2= new EmployeeCrud();
//   	   Employee e1=new Employee("helly","h@gmail.com", 45783, "1234","ank");
//
//  	   crud2.saveEmployee(2,e1);
    	   
         crud.deleteCompany(1);
         crud2.deleteEmployee(2);
}
}
