package com.naldojesse.dojos_ninjas.controllers;

import com.naldojesse.dojos_ninjas.models.Dojo;
import com.naldojesse.dojos_ninjas.services.DojoService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class DojoNinjaController {

    private final DojoService dojoService;
    public DojoNinjaController(DojoService dojoService) {
        this.dojoService = dojoService;
    }


    @RequestMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "newDojo.jsp";
    }

    @PostMapping("/dojos/create")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "newDojo.jsp";
        } else {
            dojoService.addDojo(dojo);
            return "redirect:/dojos/new";
        }
    }

//    @RequestMapping("/ninjas/new")
//    public String newNinja() {
//        return "newNinja.jsp";
//    }

//    @RequestMapping("/dojos/{id}")
//    public String viewDojo() {
//        return "viewDojo.jsp";
//    }
}
