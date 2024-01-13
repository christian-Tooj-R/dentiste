 package model;

 import annotation.Column;
 import annotation.Table;
 import crud.Generalisation;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 

 @Table(name = "Traitement")
 public class Traitement extends Generalisation {
     
@Column(name = "id")
Integer id;
@Column(name = "nom")
String nom;
Double cout;
public List<Traitement> getRemplacement(int ptsdent,double budget)throws Exception{
    Connection connect = new Connect().getConnection();
    Cout ct = new Cout();
    ct.setIdtraitement(1);
    List<Cout> all = ct.select(connect,"");
    List<Traitement> trait = new ArrayList<>();
        while(ptsdent != 0 && budget >= all.get(0).getValeur()){
            Traitement traitement = new Traitement();
            String name = getNomById(all.get(0).getIdtraitement());
            Double c = all.get(0).getValeur();
            budget -= c;
            traitement.setNom(name);
            traitement.setCout(c);
            trait.add(traitement);
            ptsdent--;
        }
    if(ptsdent == 0.0){
         connect = new Connect().getConnection();
         Cout ct2 = new Cout();
         ct2.setIdtraitement(4);
         
            List<Cout> all2 = ct2.select(connect,"");
            
            Traitement traitement = new Traitement();
            traitement.setNom(getNomById(all2.get(0).getIdtraitement()));
            traitement.setCout(all2.get(0).getValeur());
            trait.add(traitement);
        
    }
    return trait;
}
public List<Traitement> getTraitement(int ptsdent,double budget)throws Exception{
    Connection connect = new Connect().getConnection();
    List<Cout> all = new Cout().select(connect,"id");
    List<Traitement> trait = new ArrayList<>();
    int i = 0;
    boolean verif = false;
    while(i < all.size()) {
        System.out.println(ptsdent+"  "+all.get(i).getPts_()+"  "+all.get(i).get_pts());
        if(ptsdent == 0){
            return getRemplacement(ptsdent, budget);
        }
        else if(ptsdent+1 >= all.get(i).getPts_() && ptsdent+1 <= all.get(i).get_pts() && budget >= all.get(i).getValeur()){
            verif = true;
            System.out.println("Tonga ato");
            Traitement traitement = new Traitement();
            String name = getNomById(all.get(i).getIdtraitement());
            Double c = all.get(i).getValeur();
            budget -= c;
            traitement.setNom(name);
            traitement.setCout(c);
            trait.add(traitement);
            ptsdent++;
            System.out.println("Point dent "+ptsdent);
            i = 0;
        }else{
            verif = false;
        }
        if(!verif){
        i++;
            
        }
    }
    return trait;
}

public List<Proposition> getProposition(double budget,int idpriorite)throws Exception{
    Connection connect = null;
    String allId = new Pointdent().getAllIddent();
    List<Ordrepriorite> ordre = new Ordrepriorite().selectIN(allId,idpriorite);
    List<Proposition> proposition = new ArrayList<>();
    double argent = budget;
    double totale_depense = 0.0;
    for (Ordrepriorite op : ordre) {
        
        if(budget != 0.0){
            System.out.println("Id dent   "+op.getIddent());
            connect = new Connect().getConnection();
            Pointdent pdt = new Pointdent();
            pdt.setIddent(op.getIddent());
            List<Pointdent> obj = pdt.select(connect,"");
            int point = obj.get(0).getPts();
            List<Traitement> all = getTraitement(point,budget);
            double totale = all.stream().mapToDouble(Traitement::getCout).sum();
            totale_depense+= totale;
            double reste = budget - totale;
            budget = reste;
            Proposition prop = new Proposition();
            prop.setNumero_dent(op.getIddent());
            prop.setAll(all);
            proposition.add(prop);
        }
        
    }
    double reste = argent - totale_depense;
    if(reste<0){
        throw new Exception("Vous n'avez pas assez d'argent");
    }
    
    return proposition;
}
public String getNomById(int id)throws Exception{
    Connection connect = new Connect().getConnection();
    Traitement trait = new Traitement();
    trait.setId(id);
    List<Traitement> obj = trait.select(connect,"");
    return obj.get(0).getNom();
}
public Integer getId(){
    return id;
}


public void setId(Integer obj){
     id = obj;
}


public String getNom(){
    return nom;
}


public void setNom(String obj){
     nom = obj;
}

    public Double getCout() {
        return cout;
    }

    public void setCout(Double cout) {
        this.cout = cout;
    }




}

