package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;


@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;


}
