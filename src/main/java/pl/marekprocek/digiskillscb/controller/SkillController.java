package pl.marekprocek.digiskillscb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.marekprocek.digiskillscb.model.Skill;
import pl.marekprocek.digiskillscb.repository.SkillRepository;

import java.util.List;

@Controller
public class SkillController {

    private SkillRepository skillRepository;

    public SkillController(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @GetMapping("/findEmployee")
    public String findSkill(Model model,
                            @RequestParam Integer id,
                            @RequestParam String firstName,
                            @RequestParam String lastName){

        List<Skill> skills;
        skills = skillRepository.findAllSkillOfEmp(id);
//        skills = skillRepository.findAll();

        model.addAttribute("skills",skills);
        model.addAttribute("firstName",firstName);
        model.addAttribute("lastName",lastName);


        return "skill";
    }
}
