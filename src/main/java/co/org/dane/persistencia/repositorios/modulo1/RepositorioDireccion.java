/**
 * 
 */
package co.org.dane.persistencia.repositorios.modulo1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.org.dane.persistencia.entidades.modulo1.Direccion;

/**
 * @author ALFONSO
 *
 */
@Repository
public interface RepositorioDireccion extends JpaRepository<Direccion, Long>{
	
	@Query("SELECT d FROM Direccion d WHERE d.caratulaUnica.id = :idCaratula")
	List<Direccion> findDireccionByIdCaratula(long idCaratula);

}
