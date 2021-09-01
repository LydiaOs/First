package account.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import account.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee> empList=new ArrayList<Employee>();


public List <Employee> getEmployees(){
	System.out.println("dao-in getemployees");
	Employee employee=new Employee();
	employee.setEmpNo(1);
	employee.setEmpName("hemanth");
	employee.setHireDate(LocalDate.of(2018, 11, 22));
	employee.setSalary(8000);
	employee.setJob("developer");
	empList.add(employee);
	return empList;
			
}


@Override
public Employee findEmployeeById(int empId) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public List<Employee> findEmployeesByDept() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void deleteEmployee(Employee emp) {
	// TODO Auto-generated method stub
	
}}
