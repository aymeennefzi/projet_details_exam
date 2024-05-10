package com.example.projet_details.Controllers;


import com.example.projet_details.Entities.Projet;
import com.example.projet_details.Service.ProjetServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProjetController {
    private final ProjetServiceImple projetServiceImple;

    @PostMapping("/AddEtAffect")
    public Projet addProjetAndProjetDetailAndAssign(@RequestBody Projet projet) {
        return this.projetServiceImple.addProjetAndProjetDetailAndAssign(projet);
    }
}
