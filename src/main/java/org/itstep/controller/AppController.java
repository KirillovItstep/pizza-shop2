package org.itstep.controller;

import org.itstep.client.Client;
import org.itstep.client.ClientDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/signin")
    public String signin(Model model) {
        model.addAttribute("client", new Client());
        return "signin";
    }
}
