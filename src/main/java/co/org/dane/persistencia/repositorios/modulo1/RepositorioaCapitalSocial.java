/**
 * 
 */
package co.org.dane.persistencia.repositorios.modulo1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.org.dane.persistencia.entidades.modulo1.CapitalSocial;

/**
 * @author ALFONSO
 *
 */
@Repository
public interface RepositorioaCapitalSocial extends JpaRepository<CapitalSocial, Long>{

	@Query("SELECT c FROM CapitalSocial c WHERE c.caratulaUnica.id = :idCaratula")
	List<CapitalSocial> findCapitalSocialByIdCaratula(long idCaratula);
}
