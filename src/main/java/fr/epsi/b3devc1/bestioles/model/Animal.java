package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;
    private String name;
    private String sex;

    @ManyToOne
    @JoinColumn(name = "species_id", nullable = false)
    private com.example.bestioles.model.Species species;
}
