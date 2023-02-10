package it.gestioneprenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestioneprenotazioni.entities.Edificio;
import it.gestioneprenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {
	
	@Autowired
	private EdificioRepository edificioRepo;
	
	public void insert(Edificio e) {
		try {
			edificioRepo.save(e);
			System.out.println("Edificio inserito con successo");
		} catch (Exception ex) {
			System.out.println("Non è stato possibile salvare l'edificio");
		}
	}
	
    public Optional<Edificio> getById(int id) {
		return edificioRepo.findById(id);
	}

}
