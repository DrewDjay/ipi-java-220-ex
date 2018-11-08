package com.ipiecoles.java.java220;

import com.ipiecoles.java.java220.Exceptions.TechnicienException;
import org.joda.time.LocalDate;

import java.util.Objects;

public class Technicien extends  Employe {

    //public static final String LE_GRADE_DOIT_ÊTRE_COMPRIS_ENTRE_1_ET_5_X_TECHNICIEN_TECHNICIEN_GRADE_X = "Le grade doit être compris entre 1 et 5 : X, technicien : Technicien{grade=X}";
    private Integer grade ;

    public Technicien () {}

    public Technicien (Integer grade) {
        this.grade = grade;
    }

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.grade = grade;
    }



    public Integer getGrade () {
        return grade;
        }

    public void setGrade ( Integer grade) throws TechnicienException {
        if (grade == null || grade <1 || grade>5 ){
            throw new TechnicienException(this, grade);
        }
        this.grade = grade;

    }

    @Override
    public String toString() {
        return ", technicien : Technicien{grade=" + grade + "} " + super.toString();
    }
    @Override
    public void setSalaire (Double salaire){
        super.setSalaire(salaire + salaire * grade/10);

    }
    @Override
    public Integer getNbConges (){
        return super.getNbConges() + super.getNombreAnneeAnciennete();

    }
    @Override
    public Double getPrimeAnnuelle () {
        return (Entreprise.primeAnnuelleBase()+ Entreprise.primeAnnuelleBase() * grade/10) +
                Entreprise.PRIME_ANCIENNETE * super.getNombreAnneeAnciennete ();



    }
}

