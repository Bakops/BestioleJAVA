package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;

@Entity
@Table(name = "species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;

    private String commonName;
    private String latinName;

    public Integer  getId() { return id; }
    public void setId(Integer  id) { this.id = id; }

    public String getCommonName() { return commonName; }
    public void setCommonName(String commonName) { this.commonName = commonName; }

    public String getLatinName() { return latinName; }
    public void setLatinName(String latinName) { this.latinName = latinName; }
}
