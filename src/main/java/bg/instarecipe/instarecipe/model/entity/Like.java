package bg.instarecipe.instarecipe.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "likes",uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "recipe_id"}))
public class Like extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @Column
    private LocalDate likedDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public LocalDate getLikedDate() {
        return likedDate;
    }

    public Like setLikedDate(LocalDate likedDate) {
        this.likedDate = likedDate;
        return this;
    }
}
