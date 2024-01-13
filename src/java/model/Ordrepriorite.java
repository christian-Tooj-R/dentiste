 package model;

 import annotation.Column;
 import annotation.Table;
 import crud.Generalisation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
 

 @Table(name = "Ordrepriorite")
 public class Ordrepriorite extends Generalisation {
     
@Column(name = "idpriorite")
Integer idpriorite;
@Column(name = "id")
Integer id;
@Column(name = "iddent")
Integer iddent;


     public List<Ordrepriorite> selectIN(String numero_dent,int idp)throws Exception{
    Connection connect = new Connect().getConnection();
    String query = "select * from Ordrepriorite where iddent IN ("+numero_dent+") and idpriorite = "+idp+" order by id";
    PreparedStatement p = connect.prepareStatement(query);
         System.out.println("Queryyy   "+query);
    ResultSet rs = p.executeQuery();
    List<Ordrepriorite> all = new ArrayList<>();
    while (rs.next()) {
        Ordrepriorite c = new Ordrepriorite();
        c.setId(rs.getInt("id"));
        c.setIdpriorite(rs.getInt("idpriorite"));
        c.setIddent(rs.getInt("iddent"));
        all.add(c);
    }
    connect.close();
    return all;
}
     
public Integer getIdpriorite(){
    return idpriorite;
}


public void setIdpriorite(Integer obj){
     idpriorite = obj;
}


public Integer getId(){
    return id;
}


public void setId(Integer obj){
     id = obj;
}


public Integer getIddent(){
    return iddent;
}


public void setIddent(Integer obj){
     iddent = obj;
}



}

