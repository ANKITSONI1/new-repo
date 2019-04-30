package com.c2t.jdbc;

public interface EmployeeDAO {

		public void insert(Employee employee);
		public Employee findById(int id);
}
