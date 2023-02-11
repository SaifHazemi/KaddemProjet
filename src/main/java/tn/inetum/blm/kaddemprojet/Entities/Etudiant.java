package tn.inetum.blm.kaddemprojet.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    private Option option;
    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats;
    @ManyToMany
    @JoinTable(name = "ETUDIANT_Equipe_TABLE",
    joinColumns = {
            @JoinColumn(name = "etudiant_id",referencedColumnName = "idEtudiant")
    },inverseJoinColumns = {
            @JoinColumn(name = "equipe_id",referencedColumnName = "idEquipe")
    })
    private List<Equipe> Equipes;
    @ManyToOne
    private Departement departement;
}
