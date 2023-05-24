package e1_manytoone_hibernet1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_manytoone_hibernet1.dto.Company;



public class CompanyCrud {

	
	
	public EntityManager getManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("helly");
		EntityManager manager=factory.createEntityManager();
		return manager;
	}
	
	public void saveCompany(Company company) {
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	public void deleteCompany(int id) {
		EntityManager manager=getManager();
		Company company=manager.find(Company.class,id);
		if(company!=null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(company);
			transaction.commit();
		}
	}
	
	
	
	
	
	
	
}
