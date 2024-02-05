package com.structural.proxy;

public class ProxyDesignPattern {
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoProxy();
		dao.create("1", "Varun", "ADMIN"); // Creates it
		dao.create("2", "John Doe", "USER"); // Access denied as current user is not admin
		
		dao.delete("1", "ADMIN"); // Deletes it
		dao.delete("2", "USER"); // Access denied as current user is not admin
		
		dao.get("1", "ADMIN"); // Gets it
		dao.get("2", "USER"); // Gets it
		dao.get("3", "GUEST"); // Access denied as current user is neither admin nor user
	}
}
