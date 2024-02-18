package model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // Standard getters and setters
    @OneToMany(mappedBy = "owner")
    private Set<Project> projects;
}

