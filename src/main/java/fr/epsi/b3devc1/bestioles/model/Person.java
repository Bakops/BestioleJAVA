package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;
    private String firstname;
    private String lastname;
    private String login;
    private String mdp;
    private Boolean active;

    @ManyToMany
    @JoinTable(
            name = "person_animals",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "animals_id")
    )
    private List<Animal> animals;

    @ManyToMany
    @JoinTable(
            name = "person_role",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    // Getters et Setters
}