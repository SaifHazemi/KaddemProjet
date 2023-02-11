package tn.inetum.blm.kaddemprojet.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.inetum.blm.kaddemprojet.Entities.Equipe;
import tn.inetum.blm.kaddemprojet.Services.Equipe.IEquipeService;

import java.util.List;

@RestController
public class EquipeController {
    private IEquipeService iq;

    public EquipeController(IEquipeService iq) {
        this.iq = iq;
    }
    @GetMapping("/getEquipeById/{id}")
    public Equipe getEquipeById(@PathVariable int id){
        return iq.retrieveEquipe(id);
    }
    @PostMapping("/ajouterEquipe")
    public Equipe addEquipe(@RequestBody Equipe e){
        return iq.addEquipe(e);
    }
    @GetMapping("/getAllEquipes")
    public List<Equipe> getAllEquipes(){
        return iq.retrieveAllEquipes();
    }
    @PostMapping("/deleteEquipeById/{id}")
    public void deleteEquipeById(@PathVariable int id){
        iq.removeEquipe(id);
    }
    @PostMapping("/updateEquipe")
    public Equipe updateEquipe(@RequestBody Equipe e){
        return iq.updateEquipe(e);
    }
}
