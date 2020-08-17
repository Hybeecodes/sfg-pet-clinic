package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping("/vets")
    public String listVets() {
        System.out.println("Heererererer");
        return "vets/index";
    }
}
