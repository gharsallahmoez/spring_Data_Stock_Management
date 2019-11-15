package stock.management.service;

import java.util.List;

import stock.management.model.Magasin;
import stock.management.model.Produit;

public interface IGestionStock {
public Produit getProduitByIdProduit(Integer id); 
public List<Produit> getAllProduits();
public List<Magasin> getAllMagasins();
public List<Produit> getAllProduitByMag(Integer id); 
public void addProduit(Produit p); 
public Magasin getMagById(Integer id);
	
}
