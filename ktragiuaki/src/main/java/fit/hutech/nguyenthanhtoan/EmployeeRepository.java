package fit.hutech.nguyenthanhtoan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.hutech.nguyenthanhtoan.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}