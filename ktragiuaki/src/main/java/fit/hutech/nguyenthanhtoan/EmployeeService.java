package fit.hutech.nguyenthanhtoan;

import java.util.List;



import fit.hutech.nguyenthanhtoan.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);

	Page<Employee> findPaginated(int pageNo, int pageSize);

	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
