package com.example.projet_details.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nom ;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;
    @ManyToMany
    Set<Projet> projets ;
}
