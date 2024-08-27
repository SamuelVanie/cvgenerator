package com.samelvanie.cvgenerator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavBar {
    @GetMapping("/navbar")
    public String navbar() {
        return "navbar";
    }
}
