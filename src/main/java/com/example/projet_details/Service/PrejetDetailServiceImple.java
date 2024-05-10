package com.example.projet_details.Service;


import com.example.projet_details.Entities.Projet;
import com.example.projet_details.Entities.ProjetDetail;
import com.example.projet_details.Repositries.IProjetDetailRepo;
import com.example.projet_details.Repositries.IProjetRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrejetDetailServiceImple implements IPorijetDetailService{
    private final IProjetDetailRepo iProjetDetailRepo ;
    private final IProjetRepo iProjetRepo;
    @Override
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet =iProjetRepo.findById(projetId).orElse(null);
        ProjetDetail projetDetail=iProjetDetailRepo.findById(projetDetailId).orElse(null);
        projet.setProjetDetail(projetDetail);
        iProjetRepo.save(projet);
    }
}
