package pl.marekprocek.digiskillscb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.marekprocek.digiskillscb.model.Employee;
import pl.marekprocek.digiskillscb.model.Skill;
import pl.marekprocek.digiskillscb.repository.EmployeeRepository;
import pl.marekprocek.digiskillscb.repository.SkillRepository;

import java.util.List;

@Controller
public class MainController {

    private EmployeeRepository employeeRepository;

    public MainController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/")
    public String home(Model model){
        return "start";
    }

    @PostMapping("/findEmployee")
    public String findEmployee(@RequestParam String skillName, Model model){

        List<Employee> employees;
        employees = employeeRepository.findAllEmpWithSkill(skillName);

        model.addAttribute("employees",employees);
        model.addAttribute("skillName",skillName);

        return "start";
    }


}
