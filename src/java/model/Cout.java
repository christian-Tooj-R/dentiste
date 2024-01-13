 package model;

 import annotation.Column;
 import annotation.Table;
 import crud.Generalisation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
 


@Table(name = "Cout")
public class Cout extends Generalisation {     
@Column(name = "valeur")
Double valeur;
@Column(name = "idtraitement")
Integer idtraitement;
@Column(name = "id")
Integer id;
@Column(name = "pts_")
Integer pts_;
@Column(name = "_pts")
Integer _pts;


     
public Integer getPts_(){
    return pts_;
}


public void setPts_(Integer obj){
     pts_ = obj;
}


public Double getValeur(){
    return valeur;
}


public void setValeur(Double obj){
     valeur = obj;
}


public Integer getIdtraitement(){
    return idtraitement;
}


public void setIdtraitement(Integer obj){
     idtraitement = obj;
}


public Integer getId(){
    return id;
}


public void setId(Integer obj){
     id = obj;
}


public Integer get_pts(){
    return _pts;
}


public void set_pts(Integer obj){
     _pts = obj;
}


/*public List<Cout> selectIN(String numero_dent,int idp)throws Exception{
    Connection connect = new Connect().getConnection();
    String query = "select * from cout where iddent IN ("+numero_dent+") and idpriorite = "+idp+" order by id";
    PreparedStatement p = connect.prepareStatement(query);
    ResultSet rs = p.executeQuery();
    List<Cout> all = new ArrayList<>();
    while (rs.next()) {
        Cout c = new Cout();
        c.setId(rs.getInt("id"));
        c.setIdpriorite(rs.getInt("idpriorite"));
        c.setIddent(rs.getInt("iddent"));
        c.setValeur(rs.getDouble("valeur"));
        all.add(c);
    }
    connect.close();
    return all;
}
/*
public List<Cout> getProposition(double budget,String numero_dent,int idpriorite)throws Exception{
    List<Cout> all = selectIN(numero_dent,idpriorite);
    List<Cout> traiter = new ArrayList<>();
    for (Cout c : all) {
        if(budget >= c.getValeur()){
            budget -= c.getValeur();
            traiter.add(c);
        }
    }
    if(traiter.isEmpty()){
        throw new Exception("Vous n'avez pas assez de budget pour votre traitement");
    }
    return traiter;
}*/


}

