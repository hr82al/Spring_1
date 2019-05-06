package ru.geekbrains.java.Spring_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Addition {

    //пример GET запроса
    //http://localhost:8189/sum?item1=23&item2=342
    @RequestMapping(path = "/sum", method = RequestMethod.GET)
    public String showSum(Model ui, @RequestParam int item1, @RequestParam int item2){
        int sum = item1 + item2;
        ui.addAttribute("item1", item1);
        ui.addAttribute("item2", item2);
        ui.addAttribute("sum", sum);
        return "index";
    }

}
