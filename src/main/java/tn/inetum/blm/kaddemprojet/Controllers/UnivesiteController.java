package tn.inetum.blm.kaddemprojet.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.inetum.blm.kaddemprojet.Entities.Contrat;
import tn.inetum.blm.kaddemprojet.Entities.Departement;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Entities.Universite;
import tn.inetum.blm.kaddemprojet.Services.Universite.IUniversiteService;
import tn.inetum.blm.kaddemprojet.Services.Universite.IUniversiteService;

import java.util.List;

@RestController
public class UnivesiteController {
    @Autowired
    private IUniversiteService iu;

    public UnivesiteController(IUniversiteService iu) {
        this.iu = iu;
    }

    @GetMapping("/getUniversiteById/{id}")
    public Universite getUniversiteById(@PathVariable int id){
        return iu.retrieveUniversite(id);
    }
    @PostMapping("/ajouterUniversite")
    public Universite addUniversite(@RequestBody Universite e){

        return  iu.addUniversite(e);


    }
    @GetMapping("/getAllUniversites")
    public List<Universite> getAllUniversites(){
        return iu.retrieveAllUniversites();
    }
    @DeleteMapping("/deleteUniversiteById/{id}")
    public void deleteUniversiteById(@PathVariable int id){
        iu.removeUniversite(id);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite e){
        return iu.updateUniversite(e);
    }
}
