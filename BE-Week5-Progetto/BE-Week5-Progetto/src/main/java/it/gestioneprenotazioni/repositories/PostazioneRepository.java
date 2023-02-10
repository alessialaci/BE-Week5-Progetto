package it.gestioneprenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.gestioneprenotazioni.entities.Postazione;
import it.gestioneprenotazioni.entities.TipoPostazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer> {

    @Query("SELECT p FROM Postazione p JOIN p.edificio e WHERE p.tipo = :tipo AND e.citta = :citta")
    List<Postazione> findPostazioneByTipoAndCittà(@Param("tipo") TipoPostazione tipo, @Param("citta") String citta);
	
}
