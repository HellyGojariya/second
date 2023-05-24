package e1_manytoone_hibernet1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import e1_manytoone_hibernet1.dto.Company;

import e1_manytoone_hibernet1.dto.Employee;

public class EmployeeCrud {

	
		public EntityManager getManager() {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("helly");
			EntityManager manager=factory.createEntityManager();
			return manager;
		}
		
		public void saveEmployee(int id, Employee employee) {
			EntityManager manager=getManager();
			EntityTransaction entityTransaction=manager.getTransaction();
			Company company=manager.find(Company.class,id);
			if(company!=null) {
				employee.setCompany(company);
				entityTransaction.begin();
				manager.persist(employee);
				entityTransaction.commit();
			
				
				
			}else
				System.out.println("compnay object is not exist with the id");
		}
		
		public void deleteEmployee(int id) {
			EntityManager manager=getManager();
			Company company=manager.find(Company.class,id);
			if(company!=null) {
				EntityTransaction transaction=manager.getTransaction();
				transaction.begin();
				manager.persist(company);
				transaction.commit();
			}
			else
				System.out.println("company object is deleted");
		}
		
		
		
		
		
		
		
	}

