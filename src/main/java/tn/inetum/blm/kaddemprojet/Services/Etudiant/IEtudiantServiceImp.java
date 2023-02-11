package tn.inetum.blm.kaddemprojet.Services.Etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.inetum.blm.kaddemprojet.Entities.Etudiant;
import tn.inetum.blm.kaddemprojet.Repository.EtudiantRepository;

import java.util.List;
@Service
public class IEtudiantServiceImp implements IEtudiantService{
    @Autowired
    private EtudiantRepository er;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return er.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return er.save(e);

    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return er.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        er.deleteById(idEtudiant);
    }
}
