package pl.marekprocek.digiskillscb.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skilldesc;

    @ManyToMany(mappedBy = "skills")
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkilldesc() {
        return skilldesc;
    }

    public void setSkilldesc(String skilldesc) {
        this.skilldesc = skilldesc;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
