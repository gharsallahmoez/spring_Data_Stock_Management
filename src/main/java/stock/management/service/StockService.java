package stock.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.management.dao.IGestionMagasin;
import stock.management.dao.IGestionProduit;
import stock.management.model.Magasin;
import stock.management.model.Produit;

@Service
public class StockService implements IGestionStock{
	@Autowired
	IGestionMagasin mag; 
	@Autowired
	IGestionProduit prod;
	public void setMag(IGestionMagasin mag) {
		this.mag = mag;
	}

	public void setProd(IGestionProduit prod) {
		this.prod = prod;
	} 
	
	public Produit getProduitByIdProduit(Integer id) {
		return prod.findOne(id);
	}
	public List<Produit> getAllProduits(){
		return (List<Produit>) prod.findAll();
	}
	public List<Magasin> getAllMagasins(){
		return (List<Magasin>) mag.findAll();
		}
	public List<Produit> getAllProduitByMag(Integer id){
		return prod.getAllProduitByMagId(id);
		
	}
	public void addProduit(Produit p) {
		prod.save(p);
	}
	public Magasin getMagById(Integer id) {
		return mag.findOne(id);
	}
	

}
