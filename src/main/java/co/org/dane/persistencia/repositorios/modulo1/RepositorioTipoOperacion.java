/**
 * 
 */
package co.org.dane.persistencia.repositorios.modulo1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.org.dane.persistencia.entidades.modulo1.TipoOperacion;

/**
 * @author ALFONSO
 *
 */
@Repository
public interface RepositorioTipoOperacion  extends JpaRepository<TipoOperacion, Integer>{

	@Query("SELECT t FROM TipoOperacion t ORDER BY t.orden ASC")
	List<TipoOperacion> findAllTipoOperacion();
}
