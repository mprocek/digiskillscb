package pl.marekprocek.digiskillscb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.marekprocek.digiskillscb.model.Skill;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill,Long> {

    @Query(value = "select * from Skill where id in (select skill_id from Employee_Skill where employee_id = :idSkill)", nativeQuery = true)
    List<Skill> findAllSkillOfEmp(@Param("idSkill") Integer idSkill);
}
