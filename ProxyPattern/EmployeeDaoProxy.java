package com.structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao{

	private EmployeeDao realDaoObject = new EmployeeDaoImpl();
	
	@Override
	public void create(String id, String name, String currentRole) {
		
		if(currentRole.equals("ADMIN")) {
			realDaoObject.create(id, name, currentRole);
		} else {
			System.out.println("ACCESS DENIED");
		}
			
	}

	@Override
	public void delete(String id, String currentRole) {
		if(currentRole.equals("ADMIN")) {
			realDaoObject.delete(id, currentRole);
		} else {
			System.out.println("ACCESS DENIED");
		}		
	}

	@Override
	public Employee get(String id, String currentRole) {
		if(currentRole.equals("ADMIN") || currentRole.equals("USER")) {
			return realDaoObject.get(id, currentRole);
		} else {
			System.out.println("ACCESS DENIED");
			return null;
		}
	}

}
