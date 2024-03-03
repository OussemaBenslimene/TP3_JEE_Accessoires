package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Accessoire> getProduitsParMotCle(String mc) {
List<Accessoire> prods= new ArrayList<Accessoire>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from accessoire where nom_produit LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Accessoire p = new Accessoire();
p.setIdProduit(rs.getLong("ID"));
p.setNomProduit(rs.getString("NOM_PRODUIT"));
p.setCategorie(rs.getString("CATEGORIE"));
p.setPrix(rs.getDouble("PRIX"));
prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addProduit(Accessoire p) {
// TODO Auto-generated method stub
}
}