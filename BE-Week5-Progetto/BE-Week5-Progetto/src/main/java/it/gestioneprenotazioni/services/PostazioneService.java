package it.gestioneprenotazioni.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestioneprenotazioni.entities.Postazione;
import it.gestioneprenotazioni.entities.TipoPostazione;
import it.gestioneprenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioneService {
	
	@Autowired
	private PostazioneRepository postazioneRepo;
	
	public void insert(Postazione p) {
		try {
			postazioneRepo.save(p);
			System.out.println("Postazione inserita con successo");
		} catch (Exception ex) {
			System.out.println("Non è stato possibile salvare la Postazione");
		}
	}
	
    public Optional<Postazione> getById(int id) {
		return postazioneRepo.findById(id);
	}
	
    public List<Postazione> getFromTipoAndCitta(TipoPostazione tipo, String citta) {
    	return postazioneRepo.findPostazioneByTipoAndCittà(tipo, citta);
    }

}