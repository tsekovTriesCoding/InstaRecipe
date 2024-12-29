package bg.instarecipe.instarecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    @GetMapping("/categories/{name}")
    public String category(@PathVariable String name) {
        return "/category/" + name;
    }
}
