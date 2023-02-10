package it.gestioneprenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.gestioneprenotazioni.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer> {

	@Query(
			nativeQuery = true,
			value = "SELECT p FROM postazioni p JOIN edifici ON p.edificio_id = edifici.edificio_id WHERE p.tipo = :tipo AND edifici.citta = :citta")
	List<Postazione> findPostazioneByTipoAndCittà(@Param("tipo")String tipo, @Param("citta")String citta);
}
