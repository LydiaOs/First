package account.service;
import java.util.List;

import account.dao.EmployeeDao;
import account.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao =empDao;
	}
	public Employee getEmployeeById1(int empId) {
		
		return null;
	}
	public List<Employee> getEmployees(){
		System.out.println("Service-In getEmployees");
		List<Employee> empList=empDao.getEmployees();
		return empList;
	}
	public List<Employee> getEmployeeByDept()
	{
		return null;
	}
	public void deleteEmployee(int empId) {
		
	}
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertEmployeeWithValues() {
		empDao.insertEmployeeWithValues();
	}

}
