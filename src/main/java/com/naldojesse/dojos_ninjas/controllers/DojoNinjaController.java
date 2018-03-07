package com.naldojesse.dojos_ninjas.controllers;

import com.naldojesse.dojos_ninjas.models.Dojo;
import com.naldojesse.dojos_ninjas.models.Ninja;
import com.naldojesse.dojos_ninjas.services.DojoService;
import com.naldojesse.dojos_ninjas.services.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DojoNinjaController {

    private final DojoService dojoService;
    private final NinjaService ninjaService;
    public DojoNinjaController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
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

    @RequestMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "newNinja.jsp";
    }


    @RequestMapping("/ninjas/create")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "newNinja.jsp";
        } else {
            ninjaService.addNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }

//    @RequestMapping("/dojos/{id}")
//    public String viewDojo() {
//        return "viewDojo.jsp";
//    }
}
