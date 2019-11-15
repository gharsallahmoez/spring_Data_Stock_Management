package stock.management.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock.management.model.Magasin;
import stock.management.model.Produit;

@Repository
public interface IGestionMagasin extends CrudRepository<Magasin, Integer> {}

