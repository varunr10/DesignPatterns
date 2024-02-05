package com.structural.proxy;

public interface EmployeeDao {

	public void create(String id, String name, String currentRole);
	public void delete(String id, String currentRole);
	public Employee get(String id, String currentRole);
}
