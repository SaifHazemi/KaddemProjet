package tn.inetum.blm.kaddemprojet.Services.Universite;

import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);
    void removeUniversite (Integer idUniversite);

}
