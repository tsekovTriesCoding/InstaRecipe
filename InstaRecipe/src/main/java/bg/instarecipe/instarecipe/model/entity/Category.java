package bg.instarecipe.instarecipe.model.entity;

import bg.instarecipe.instarecipe.model.enums.CategoryEnum;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private CategoryEnum name; // Category name (e.g., Vegan, Desserts)

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes;

    public CategoryEnum getName() {
        return name;
    }

    public Category setName(CategoryEnum name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addRecipe(Recipe recipe) {
        if (this.recipes == null) {
            this.recipes = new ArrayList<>();
        }
        this.recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        if (this.recipes != null) {
            this.recipes.remove(recipe);
        }
    }
}
