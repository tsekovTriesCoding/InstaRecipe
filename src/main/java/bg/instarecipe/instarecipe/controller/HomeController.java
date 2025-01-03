package bg.instarecipe.instarecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    String index() {
        return "index";
    }

    @GetMapping("home")
    String home() {
        return "home";
    }

    @GetMapping("/about")
    String about() {
        return "about";
    }
}
