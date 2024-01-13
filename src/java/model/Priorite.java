 package model;

 import annotation.Column;
 import annotation.Table;
 import crud.Generalisation;
 

@Table(name = "Priorite")
public class Priorite extends Generalisation {
     
@Column(name = "id")
Integer id;
@Column(name = "nom")
String nom;


     
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



}

