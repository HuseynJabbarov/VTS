package com.hj.VTS.model;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // Standard getters and setters
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @OneToMany(mappedBy = "project")
    private Set<Vulnerability> vulnerabilities;
}