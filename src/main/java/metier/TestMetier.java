package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Accessoire> prods = metier.getProduitsParMotCle("HP");
for (Accessoire p : prods)
System.out.println(p.getNomProduit());
}
}