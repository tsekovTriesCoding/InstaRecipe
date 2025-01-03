package bg.instarecipe.instarecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipes")
public class RecipeController {
    @GetMapping
    String recipe() {
        return "recipes";
    }

    @GetMapping("/add")
    String add() {
        return "add-recipe";
    }

    @GetMapping("/details")
    public String details() {
        return "recipe-details";
    }

    @GetMapping("/edit")
    String edit() {
        return "edit-recipe";
    }

    @GetMapping("/my-recipes")
    String myRecipes() {
        return "my-recipes";
    }
}
