package tn.inetum.blm.kaddemprojet.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.inetum.blm.kaddemprojet.Entities.Contrat;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Services.Contrat.IContratService;
import tn.inetum.blm.kaddemprojet.Services.Etudiant.IEtudiantService;

import java.util.List;

@RestController
public class ContratController {
    @Autowired
    private IContratService ie;

    public ContratController(IContratService ie) {
        this.ie = ie;
    }

    @GetMapping("/getContratById/{id}")
    public Contrat getContratById(@PathVariable int id){
        return ie.retrieveContrat(id);
    }
    @PostMapping("/ajouterContrat")
    public Contrat addContrat(@RequestBody Contrat e){
        return ie.addContrat(e);

    }
    @GetMapping("/getAllContrats")
    public List<Contrat> getAllContrats(){
        return ie.retrieveAllContrats();
    }
    @PostMapping("/deleteContratById/{id}")
    public void deleteContratById(@PathVariable int id){
        ie.removeContrat(id);
    }
    @PostMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat e){
        return ie.updateContrat(e);
    }
}
