package bg.instarecipe.instarecipe.service;

import bg.instarecipe.instarecipe.model.entity.User;

public interface UserService {
    boolean checkCredentials(String username, String password);

    User getByEmail(String username);

    void login(String email);
}
