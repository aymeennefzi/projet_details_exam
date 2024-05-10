package com.example.projet_details.Service;

import com.example.projet_details.Entities.Projet;
import com.example.projet_details.Entities.ProjetDetail;
import com.example.projet_details.Repositries.IProjetDetailRepo;
import com.example.projet_details.Repositries.IProjetRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjetServiceImple implements IProjetService{

    private final IProjetRepo iProjetRepo;
    private final IProjetDetailRepo iProjetDetailRepo;
    @Transactional
    @Override
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
      ProjetDetail projetDetail=projet.getProjetDetail();
      iProjetDetailRepo.save(projetDetail);
      return iProjetRepo.save(projet);
    }
}
