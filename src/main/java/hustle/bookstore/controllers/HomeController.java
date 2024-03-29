package hustle.bookstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String showHome() {
        return "home"; // Return the name of your template
    }
}