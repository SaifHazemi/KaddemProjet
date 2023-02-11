package tn.inetum.blm.kaddemprojet.Services.Departement;

import tn.inetum.blm.kaddemprojet.Entities.Departement;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Entities.Universite;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
    ;

}
