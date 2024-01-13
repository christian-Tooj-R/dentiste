/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Christian
 */
public class Proposition {
    int numero_dent;
    List<Traitement> all;
    
    
    

    public int getNumero_dent() {
        return numero_dent;
    }

    public void setNumero_dent(int numero_dent) {
        this.numero_dent = numero_dent;
    }

    public List<Traitement> getAll() {
        return all;
    }

    public void setAll(List<Traitement> all) {
        this.all = all;
    }
    
    
}
