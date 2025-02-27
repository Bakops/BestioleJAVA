package fr.epsi.b3devc1.bestioles.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private String firstname;
    private String lastname;
    private String login;
    private String mdp;
    private boolean active;

    @ManyToMany
    @JoinTable(
            name = "person_animals",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "animals_id")
    )
    private Set<Animal> animals;

    @ManyToMany
    @JoinTable(
            name = "person_role",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    public Integer  getId() { return Math.toIntExact(id); }
    public void setId(Integer  id) { this.id = Long.valueOf(id); }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getMdp() { return mdp; }
    public void setMdp(String mdp) { this.mdp = mdp; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Set<Animal> getAnimals() { return animals; }
    public void setAnimals(Set<Animal> animals) { this.animals = animals; }

    public Set<Role> getRoles() { return roles; }
    public void setRoles(Set<Role> roles) { this.roles = roles; }
}
