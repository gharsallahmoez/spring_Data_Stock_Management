package stock.management.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stock.management.model.Magasin;
import stock.management.model.Produit;
import stock.management.service.IGestionStock;

@Controller
public class AppController {
	@Autowired
	IGestionStock service;


	public void setService(IGestionStock service) {
		this.service = service;
	} 
	
	@GetMapping("/home")
	public String listMag(Model m) {
		List<Magasin> lm = service.getAllMagasins();
		m.addAttribute("listeMagasin",lm);
		return "home";
	}
	
	@GetMapping("/produits/{num}")
	public String listProd(Model m,@PathVariable("num") int numMag) {
		List<Produit> lp = service.getAllProduitByMag(numMag);
		m.addAttribute("listeProduit",lp);
		return "produits";
	}
	
	@GetMapping("/produit")
	public String addProd(Model model) {
		Produit p = new Produit(); 
		List<Magasin> lm = service.getAllMagasins();
		model.addAttribute("magasins", lm);
		model.addAttribute("produit", p);

		return ("produit");
	}

	@PostMapping("saveProduit")
	public String saveProd(Model model, @ModelAttribute("produit") Produit p) {
		
	
		Magasin m = service.getMagById(1);
		p.setMag(m);
		service.addProduit(p);
		return ("redirect:/home");
	}
	
	
}
