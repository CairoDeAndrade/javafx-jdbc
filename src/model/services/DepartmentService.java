package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> mockList = new ArrayList<>();
		mockList.add(new Department(1, "Books"));
		mockList.add(new Department(2, "Computers"));
		mockList.add(new Department(3, "Eletronics"));
		return mockList;
	}
}
