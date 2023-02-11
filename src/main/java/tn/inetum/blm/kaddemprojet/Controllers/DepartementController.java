package tn.inetum.blm.kaddemprojet.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.inetum.blm.kaddemprojet.Entities.Departement;
import tn.inetum.blm.kaddemprojet.Services.Departement.IDepartementService;


import java.util.List;

@RestController
public class DepartementController {
    private IDepartementService ide;

    public DepartementController(IDepartementService ide) {
        this.ide = ide;
    }
    @GetMapping("/getDepartementByid/{id}")
    public Departement getDepartementByid(@PathVariable int id){
        return ide.retrieveDepartement(id);
    }
    @PostMapping("/ajouterDepartement")
    public Departement addDepartement(@RequestBody Departement e){
        return ide.addDepartement(e);
    }
    @GetMapping("/getAllDepartements")
    public List<Departement> getAllDepartements(){
        return ide.retrieveAllDepartements();
    }
    @PostMapping("/deleteDepartementByid/{id}")
    public void deleteDepartementByid(@PathVariable int id){
        ide.retrieveDepartement(id);
    }
    @PostMapping("/updateDepartement")
    public Departement updateDepartement(@RequestBody Departement e){
        return ide.updateDepartement(e);
    }
}
