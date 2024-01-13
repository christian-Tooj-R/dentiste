 package model;

 import annotation.Column;
 import annotation.Table;
 import crud.Generalisation;
 

 @Table(name = "Dent")
 public class Dent extends Generalisation {
     
@Column(name = "numero")
Integer numero;


     
public Integer getNumero(){
    return numero;
}


public void setNumero(Integer obj){
     numero = obj;
}



}

