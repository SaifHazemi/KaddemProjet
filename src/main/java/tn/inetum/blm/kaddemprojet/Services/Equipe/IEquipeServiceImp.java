package tn.inetum.blm.kaddemprojet.Services.Equipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.inetum.blm.kaddemprojet.Entities.Equipe;
import tn.inetum.blm.kaddemprojet.Repository.EquipeRepository;
import tn.inetum.blm.kaddemprojet.Repository.EtudiantRepository;

import java.util.List;
@Service
public class IEquipeServiceImp implements IEquipeService {
    @Autowired
    private EquipeRepository eq;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return eq.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return eq.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return eq.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return eq.findById(idEquipe).orElse(null);
    }

    @Override
    public void removeEquipe(Integer idEquipe) {
        eq.deleteById(idEquipe);
    }
}
