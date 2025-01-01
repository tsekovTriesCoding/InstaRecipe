package bg.instarecipe.instarecipe.service.impl;

import bg.instarecipe.instarecipe.model.entity.User;
import bg.instarecipe.instarecipe.repository.UserRepository;
import bg.instarecipe.instarecipe.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean checkCredentials(String username, String password) {
        User user = this.getByEmail(username);

        if (user == null) {
            return false;
        }

        return this.passwordEncoder.matches(password, user.getPassword());
    }

    @Override
    public User getByEmail(String username) {
        return this.userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void login(String email) {

    }
}
