package com.example.projet_details.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description ;
    private String technolgie ;
    private long cout;
    private Date dateDebut;
    @OneToOne(mappedBy = "projetDetail" , cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    Projet projet ;
}
