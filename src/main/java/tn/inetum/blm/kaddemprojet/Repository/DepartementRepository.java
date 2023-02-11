package tn.inetum.blm.kaddemprojet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.inetum.blm.kaddemprojet.Entities.Departement;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
