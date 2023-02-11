package tn.inetum.blm.kaddemprojet.Services.Universite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.inetum.blm.kaddemprojet.Entities.Universite;
import tn.inetum.blm.kaddemprojet.Repository.EtudiantRepository;
import tn.inetum.blm.kaddemprojet.Repository.UniversiteRepository;

import java.util.List;
@Service
public class IUniversiteServiceImp implements IUniversiteService{
    @Autowired
    private UniversiteRepository ur;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return ur.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return ur.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        ur.deleteById(idUniversite);
    }
}
