package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends  Employe {

    public  Double getPrimeAnnuelle (){
        return null;

    }
    private Double caAnnuel;

    public  Commercial (Double caAnnuel ){
        this.caAnnuel = caAnnuel;
    }
    public Double getCaAnnuel (){
        return caAnnuel;
    }
    public void setCaAnnuel (Double caAnnuel){
        this.caAnnuel = caAnnuel;}

}
