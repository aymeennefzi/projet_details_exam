package com.example.projet_details.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projet implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String sujet ;
    @JsonIgnore
    @ManyToMany(mappedBy = "projets")
    Set<Equipe> equipes ;
    @OneToOne
    ProjetDetail projetDetail ;

}
