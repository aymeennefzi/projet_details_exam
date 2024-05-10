package com.example.projet_details.Controllers;

import com.example.projet_details.Service.IPorijetDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProjetDetailController {
    private final IPorijetDetailService iPorijetDetailService ;

    @PostMapping("/Affect/{id}/{idP}")
    public void assignProjetDetailToProjet(@PathVariable("id") Long projetId,@PathVariable("idP") Long projetDetailId) {
        this.iPorijetDetailService.assignProjetDetailToProjet(projetId ,projetDetailId);
    }
}
