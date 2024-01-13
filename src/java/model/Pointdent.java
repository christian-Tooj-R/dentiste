 package model;

 import annotation.Column;
 import annotation.Table;
 import crud.Generalisation;
import java.sql.Connection;
import java.util.List;
 

 @Table(name = "Pointdent")
 public class Pointdent extends Generalisation {
     
@Column(name = "pts")
Integer pts;
@Column(name = "iddent")
Integer iddent;


public String getAllIddent()throws Exception{
    Connection connect = new Connect().getConnection();
    List<Pointdent> all = new Pointdent().select(connect,"");
    String all_id = "";
    for (Pointdent pdt : all) {
        all_id += "," + pdt.getIddent();
    }
    return all_id.replaceFirst(",","");
}

     

public Integer getPts(){
    return pts;
}


public void setPts(Integer obj){
     pts = obj;
}


public Integer getIddent(){
    return iddent;
}


public void setIddent(Integer obj){
     iddent = obj;
}



}

