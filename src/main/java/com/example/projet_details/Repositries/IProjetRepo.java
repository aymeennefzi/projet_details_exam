package com.example.projet_details.Repositries;

import com.example.projet_details.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjetRepo extends JpaRepository<Projet , Long> {
}
