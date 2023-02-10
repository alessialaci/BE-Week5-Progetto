package it.gestioneprenotazioni.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestioneprenotazioni.entities.Postazione;
import it.gestioneprenotazioni.entities.Prenotazione;
import it.gestioneprenotazioni.entities.Utente;
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
	
	
//	
//	public void checkPrenotazione(Utente utente, Postazione postazione, LocalDate data) {
//		List<Prenotazione> lista = prenotazioneRepo.findByData(data).stream().filter(l -> l.getUtente().getId() == utente.getId()).toList();
//		if (prenotazioneRepo.countByData(data) >= p.getMaxPartecipanti()) {
//			System.out.println("Siamo spiacenti, la postazione e gia al completo");
//			return false;
//		} else if (result.size() > 0) {
//			System.out.println("Siamo spiacenti non puoi effettuare piu prenotazioni per la stessa data");
//			return false;
//		} else {
//			return true;
//		}
//	}
	
}
