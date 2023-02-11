package tn.inetum.blm.kaddemprojet.Services.Departement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.inetum.blm.kaddemprojet.Entities.Departement;
import tn.inetum.blm.kaddemprojet.Entities.Universite;
import tn.inetum.blm.kaddemprojet.Repository.ContratRepository;
import tn.inetum.blm.kaddemprojet.Repository.DepartementRepository;

import java.util.List;
@Service
public class IDepartementServiceImp implements IDepartementService {
    @Autowired
    private DepartementRepository dr;

    public IDepartementServiceImp(DepartementRepository dr) {
        this.dr = dr;
    }
    @Override
    public List<Departement> retrieveAllDepartements() {
        return dr.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return dr.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return dr.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return dr.findById(idDepart).orElse(null);
    }

}
