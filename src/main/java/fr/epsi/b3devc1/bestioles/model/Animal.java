package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;
    private String name;
    private String sex;

    @ManyToOne
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;

    public Integer getId() { return id; }
    public void setId(Long id) { this.id = Math.toIntExact(id); }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public Species getSpecies() { return species; }
    public void setSpecies(Species species) { this.species = species; }
}
