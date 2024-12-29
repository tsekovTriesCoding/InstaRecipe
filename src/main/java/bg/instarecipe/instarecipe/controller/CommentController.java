package bg.instarecipe.instarecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentController {

    @PostMapping("/recipes/{id}/comments")
    public String addComment(@RequestParam int recipeId) {
        return "home";
    }
}
