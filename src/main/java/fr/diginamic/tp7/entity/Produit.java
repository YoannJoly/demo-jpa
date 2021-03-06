package fr.diginamic.tp7.entity;

import fr.diginamic.tp7.bo.ScoreNutritionnel;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "produit")
public class Produit {
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(referencedColumnName = "categorie")
    Categorie categorie;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(referencedColumnName = "marque")
    Marque marque;
    @Column(name = "scoreNutritionnel", length = 50, nullable = false)
    ScoreNutritionnel scoreNutritionnel;
    @ManyToMany
    //@ElementCollection
    @JoinColumn(referencedColumnName = "ingredients")
    List<Ingredient> ingredients;
    @ManyToMany
    //@ElementCollection
    @JoinColumn(referencedColumnName = "additif")
    List<Additif> additifs;
    @ManyToMany
    //@ElementCollection
    @JoinColumn(referencedColumnName = "allergene")
    List<Allergene> allergenes;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    public Produit() {
    }

    public Produit(final Categorie categorie, final Marque marque, final ScoreNutritionnel scoreNutritionnel, final List<Ingredient> ingredients, final List<Additif> additifs, final List<Allergene> allergenes) {
        this.categorie = categorie;
        this.marque = marque;
        this.scoreNutritionnel = scoreNutritionnel;
        this.ingredients = ingredients;
        this.additifs = additifs;
        this.allergenes = allergenes;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(final Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(final Marque marque) {
        this.marque = marque;
    }

    public ScoreNutritionnel getScoreNutritionnel() {
        return scoreNutritionnel;
    }

    public void setScoreNutritionnel(final ScoreNutritionnel scoreNutritionnel) {
        this.scoreNutritionnel = scoreNutritionnel;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(final List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(final List<Additif> additifs) {
        this.additifs = additifs;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(final List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }
}
