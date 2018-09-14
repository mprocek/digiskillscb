package pl.marekprocek.digiskillscb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.marekprocek.digiskillscb.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "select t1.* from Employee t1 where id in (select employee_id from Employee_Skill where skill_id = (select id from Skill where skilldesc = :skill))", nativeQuery = true)
    List<Employee> findAllEmpWithSkill(@Param("skill") String skill);

}
