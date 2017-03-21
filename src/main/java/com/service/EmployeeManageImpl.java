package com.service;

import java.util.ArrayList;
import java.util.List;




import com.DTO.EmployeeDTO;


public class EmployeeManageImpl implements EmployeeManager {

	@Override
	public EmployeeDTO getEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		System.out.println("Method getEmployeeById() called");
        return new EmployeeDTO();
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Method getAllEmployee() called");
        return new ArrayList<EmployeeDTO>();
	}

	@Override
	public void createEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		System.out.println("Method createEmployee() called");
		
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		System.out.println("Method deleteEmployee() called");
		
	}

	@Override
	public void updateEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		System.out.println("Method updateEmployee() called");
		
	}

}
