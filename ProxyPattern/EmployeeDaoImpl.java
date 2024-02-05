package com.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void create(String id, String name, String currentRole) {
		System.out.println("Created " + name + "Employee with id "+ id);
	}

	@Override
	public void delete(String id, String currentRole) {
		System.out.println("Deleted Employee with id "+ id);
		
	}

	@Override
	public Employee get(String id, String currentRole) {
		System.out.println("Here is the data for the Employee id" + id );
		return new Employee();
	}

}
