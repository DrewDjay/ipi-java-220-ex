package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * Created by pjvilloud on 21/09/17.
 */
public abstract class Employe {
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire = Entreprise.SALAIRE_BASE;

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public Employe() {
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

//public final Integer getNombreAnneeAnciennete (){
    //return dateEmbauche;
    // }
    // public void setDateEmbauche (LocalDate dateEmbauche) throws Exception {
    // if (dateEmbauche.isBefore(LocalDate.now())) {
    // this.dateEmbauche = dateEmbauche;
    // } else {
    //    throw new Exception("la date d'embauche ne peu être posterieure a la date courante");
    //  }
    // }

    public Integer getNbConges() {
        return Entreprise.NB_CONGES_BASE;
    }


    public void setDateEmbauche(LocalDate dateEmbauche) throws Exception {
        if (dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())) {
            throw new Exception(("La date d'embauche ne peut être postérieure à la date courante"));
        }
        this.dateEmbauche = dateEmbauche;

    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;

    }

    public final Integer getNombreAnneeAnciennete() {
        return LocalDate.now().getYear() - this.dateEmbauche.getYear();

    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(nom, employe.nom) &&
                Objects.equals(prenom, employe.prenom) &&
                Objects.equals(matricule, employe.matricule) &&
                Objects.equals(dateEmbauche, employe.dateEmbauche) &&
                Objects.equals(salaire, employe.salaire);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }
    public void augmenterSalaire (Double pourcentage){
        salaire = salaire + salaire * pourcentage;
    }
   public  abstract Double getPrimeAnnuelle ();

}


