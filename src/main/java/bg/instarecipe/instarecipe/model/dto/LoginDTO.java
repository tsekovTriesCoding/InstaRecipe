package bg.instarecipe.instarecipe.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginDTO {

    @NotNull
    @Email
    @Size(min = 3, max = 20, message = "Length must be between 5 and 20 characters")
    private String email;

    @Size(min = 5, message = "Length must be between 5 and 20 characters")
    @NotNull
    private String password;

    public LoginDTO() {
    }

    public String getEmail() {
        return email;
    }

    public LoginDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
