package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;


@Entity
@Table(name = "species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "common_name", nullable = false)
    private String commonName;

    @Column(name = "latin_name", nullable = false)
    private String latinName;


}