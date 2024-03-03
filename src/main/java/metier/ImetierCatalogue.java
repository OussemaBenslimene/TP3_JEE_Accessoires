package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Accessoire> getProduitsParMotCle(String mc);
public void addProduit(Accessoire p);
}