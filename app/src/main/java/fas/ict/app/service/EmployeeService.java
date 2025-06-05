package fas.ict.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import fas.ict.app.model.Department;
import fas.ict.app.model.Employee;
import fas.ict.app.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee>searchSalary(int s,int e) {
		if(repo.findSalaryRange(s, e).isEmpty()) {
			throw new EntityNotFoundException("Employee Not Found");
		}
		return repo.findSalaryRange(s, e);
	}
}