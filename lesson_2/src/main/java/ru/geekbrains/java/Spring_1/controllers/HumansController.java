package ru.geekbrains.java.Spring_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.java.Spring_1.entities.Human;
import ru.geekbrains.java.Spring_1.services.HumansService;

import java.util.List;

@Controller
@RequestMapping("/human")
public class HumansController {
    private HumansService humansService;

    @Autowired
    public void setHumansService(HumansService humansService) {
        this.humansService = humansService;
    }

    @RequestMapping(path = "/newHuman")
    public String showForm(Model ui) {
        Human human = new Human();
        ui.addAttribute("human", human);
        return "human-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("human") Human human) {
        return "human-form-result";
    }

    @RequestMapping("/humansList")
    public String humansList(Model ui){
        List<Human> humans = humansService.getHumansList();
        ui.addAttribute("humans", humans);
        return "humans-list";
    }
}
