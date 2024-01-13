/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Proposition;
import model.Traitement;

/**
 *
 * @author Christian
 */
public class Main {
    public static void main(String[] args) {
        try {
        //    Cout c = new Cout();
        /*    List<Cout> proposition = c.getProposition(70000,"3,7,2,8,5,6",1);
            for (Cout cout : proposition) {
                System.out.println("Dent numero => "+cout.getIddent()+"-----"+cout.getValeur());
            }
            double sum = proposition.stream().mapToDouble(Cout::getValeur).sum();
            System.out.println("Total =  "+sum);*/
     /*   int[] tableau = {4,7,6,2,3,5,8};
        int[] tab = c.triage(tableau);
            for (int i : tab) {
                System.out.println(i);
            }*/
       //     List<Traitement> traitement = new Traitement().getTraitement(5,32000);
            List<Proposition> hash = new Traitement().getProposition(100000,1);
            for (Proposition proposition : hash) {
                System.out.println("Numero dent  "+proposition.getNumero_dent());
                List<Traitement> all = proposition.getAll();
                for (Traitement trait : all) {
                    System.out.println(trait.getNom()+"    cout  "+trait.getCout());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
