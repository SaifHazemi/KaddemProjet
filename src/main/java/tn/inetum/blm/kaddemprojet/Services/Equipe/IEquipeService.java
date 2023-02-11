package tn.inetum.blm.kaddemprojet.Services.Equipe;

import tn.inetum.blm.kaddemprojet.Entities.Equipe;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
    void removeEquipe (Integer idEquipe);

}
