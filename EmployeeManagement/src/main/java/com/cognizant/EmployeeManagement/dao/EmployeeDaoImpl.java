package com.cognizant.EmployeeManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.EmployeeManagement.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
	@Autowired
	private SessionFactory factory;
	@Override
	public List<Employee> getAllEmployees() {
		Session session=factory.getCurrentSession();
		Query<Employee>query=session.createQuery("from Employee",Employee.class);
		List<Employee>listofEmployees=query.getResultList();
		System.out.println("***");
		listofEmployees.forEach(c->System.out.println(c));
		System.out.println("***");
			return listofEmployees;
}
	@Override
	public void saveEmployee(Employee theEmployee) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(theEmployee);
	}
	@Override
	public Employee getEmployee(int theId) {
		
			Session session=factory.getCurrentSession();
			Employee employee=session.get(Employee.class,theId);
			return employee;
		}
	
	
	
	
	
	
	@Override
	public void deleteEmployee(int theId) {
		Session session=factory.getCurrentSession();
Query theQuery=session.createQuery
("delete from Employee where id=:theEmployeeId");
theQuery.setParameter("theEmployeeId", theId);
theQuery.executeUpdate();
System.out.println("delete method called");
	}
	
	
		
	}
	



