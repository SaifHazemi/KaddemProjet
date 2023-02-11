package tn.inetum.blm.kaddemprojet.Services.Contrat;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.inetum.blm.kaddemprojet.Entities.Contrat;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Repository.ContratRepository;
import tn.inetum.blm.kaddemprojet.Repository.EtudiantRepository;

import java.util.List;
@Service
public class IContratServiceImp implements IContratService {
    @Autowired
    private ContratRepository cr;

    public IContratServiceImp(ContratRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<Contrat> retrieveAllContrats() {
        return cr.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return cr.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return cr.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return cr.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        cr.deleteById(idContrat);
    }
}
