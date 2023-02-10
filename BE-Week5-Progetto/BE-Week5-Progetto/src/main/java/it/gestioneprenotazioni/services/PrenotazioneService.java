package it.gestioneprenotazioni.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestioneprenotazioni.entities.Prenotazione;
import it.gestioneprenotazioni.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository prenotazioneRepo;
	
	public void insert(Prenotazione pren) {
		try {
			prenotazioneRepo.save(pren);
			System.out.println("Prenotazione inserita con successo");
		} catch (Exception ex) {
			System.out.println("Non è stato possibile salvare la Prenotazione");
		}
	}
	
    public long getCountPrenotazioni(LocalDate data, int id) {
    	return prenotazioneRepo.getCountPrenotazioni(data, id);
    }
    
    public long getCountPrenotazioniUtente(LocalDate data, int id) {
    	return prenotazioneRepo.getCountPrenotazioniUtente(data, id);
    }
	
}
