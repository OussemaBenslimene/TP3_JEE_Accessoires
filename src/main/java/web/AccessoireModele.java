package web;
import java.util.ArrayList;
import java.util.List;
import metier.Accessoire;
public class AccessoireModele {
private String motCle;
List<Accessoire> produits = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Accessoire> getProduits() {
return produits;
}
public void setProduits(List<Accessoire> produits) {
this.produits = produits;
}

}