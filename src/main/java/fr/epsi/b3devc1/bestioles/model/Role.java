package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;

    private String label;

    public Integer  getId() { return id; }
    public void setId(Integer  id) { this.id = id; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
}
