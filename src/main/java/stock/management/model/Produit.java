package stock.management.model;

import java.util.Date;

import javax.persistence.*;



@Entity
public class Produit {
	@Id @GeneratedValue
	private Integer id; 
	private String description ; 
	private float prixAchat; 
	private float prixVente; 
	private String dateEnregistrement; 
	private int quantiteStock;
	
	@ManyToOne @JoinColumn(name = "mag_id") 
	private Magasin mag;

	
	public Produit() {
		super();
	}


	public Produit(Integer id, String description, float prixAchat, float prixVente, String dateEnregistrement,
			int quantiteStock, Magasin mag) {
		super();
		this.id = id;
		this.description = description;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.dateEnregistrement = dateEnregistrement;
		this.quantiteStock = quantiteStock;
		this.mag = mag;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getPrixAchat() {
		return prixAchat;
	}


	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}


	public float getPrixVente() {
		return prixVente;
	}


	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}


	public String getDateEnregistrement() {
		return dateEnregistrement;
	}


	public void setDateEnregistrement(String dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}


	public int getQuantiteStock() {
		return quantiteStock;
	}


	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}


	public Magasin getMag() {
		return mag;
	}


	public void setMag(Magasin mag) {
		this.mag = mag;
	}
	
	
	
	

}
