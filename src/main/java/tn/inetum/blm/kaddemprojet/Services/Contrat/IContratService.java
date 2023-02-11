package tn.inetum.blm.kaddemprojet.Services.Contrat;

import tn.inetum.blm.kaddemprojet.Entities.Contrat;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);
}
