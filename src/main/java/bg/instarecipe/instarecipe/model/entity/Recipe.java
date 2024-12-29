package bg.instarecipe.instarecipe.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe extends BaseEntity {
    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @ElementCollection
    @CollectionTable(name = "recipe_ingredients", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column
    private List<String> ingredients;

    @Column(columnDefinition = "LONGTEXT")
    private String instructions;

    @Column
    private LocalDate createdDate;

    @Column
    private LocalDate updatedDate;

    @Column
    private String image;

    @Column
    private int prepTime;

    @Column
    private int cookTime;

    @Column
    private int servings;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User createdBy;

    @ManyToMany
    @JoinTable(name = "recipes_categories",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Like> likes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Recipe setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Recipe setComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    public int getCookTime() {
        return cookTime;
    }

    public Recipe setCookTime(int cookTime) {
        this.cookTime = cookTime;
        return this;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public Recipe setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Recipe setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Recipe setImage(String image) {
        this.image = image;
        return this;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public Recipe setLikes(List<Like> likes) {
        this.likes = likes;
        return this;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public Recipe setPrepTime(int prepTime) {
        this.prepTime = prepTime;
        return this;
    }

    public int getServings() {
        return servings;
    }

    public Recipe setServings(int servings) {
        this.servings = servings;
        return this;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public Recipe setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public int getLikeCount() {
        return likes.size();
    }
}

