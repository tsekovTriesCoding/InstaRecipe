package bg.instarecipe.instarecipe.init;

import bg.instarecipe.instarecipe.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FirstInit implements CommandLineRunner {
    private final UserService userService;

    public FirstInit(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
