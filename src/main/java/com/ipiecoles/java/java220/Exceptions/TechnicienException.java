package com.ipiecoles.java.java220.Exceptions;

import com.ipiecoles.java.java220.Technicien;

public class TechnicienException extends Exception{
    public static final String message = "Le grade doit être compris entre 1 et 5 : ";
    public TechnicienException(Technicien technicien, Integer grade){
        super(message + grade + technicien.toString());
        System.out.println(this.getMessage());
    }

}
