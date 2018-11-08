package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Entreprise {

   public static final  Double SALAIRE_BASE = new Double (1480.27);
   public static final Integer NB_CONGES_BASE = new Integer (25);
   public static final Double INDICE_MANAGER = new Double (1.3);
   public static final Double PRIME_MANAGER_PAR_TECHNICIEN = new Double (250d);
   public static final Double PRIME_ANCIENNETE = new Double (100.0);


   public static Double primeAnnuelleBase () {
     return LocalDate.now().getYear() / 2d;


   }








}







