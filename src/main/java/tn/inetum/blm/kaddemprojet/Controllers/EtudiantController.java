package tn.inetum.blm.kaddemprojet.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Entities.Contrat;
import tn.inetum.blm.kaddemprojet.Services.Contrat.IContratService;
import tn.inetum.blm.kaddemprojet.Services.Etudiant.IEtudiantService;

import java.io.Console;
import java.util.List;

@RestController
public class EtudiantController {
    private IEtudiantService ie;
    private IContratService ic;

    public EtudiantController(IEtudiantService ie,IContratService ic) {
        this.ie = ie;
        this.ic = ic;

    }
    @GetMapping("/getEtudiantById/{id}")
    public Etudiant getEtudiantById(@PathVariable int id){
        return ie.retrieveEtudiant(id);
    }
    @PostMapping("/ajouterEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){

        Etudiant etudiant =ie.addEtudiant(e);
        for (Contrat c : e.getContrats()) {
            c.setEtudiant(etudiant);
            ic.updateContrat(c);
        }
        return etudiant;
    }
    @GetMapping("/getAllEtudiants")
    public List<Etudiant> getAllEtudiants(){
        return ie.retrieveAllEtudiants();
    }
    @DeleteMapping("/deleteEtudiantById/{id}")
    public void deleteEtudiantById(@PathVariable int id){
        ie.removeEtudiant(id);
    }
    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        return ie.updateEtudiant(e);
    }
}
