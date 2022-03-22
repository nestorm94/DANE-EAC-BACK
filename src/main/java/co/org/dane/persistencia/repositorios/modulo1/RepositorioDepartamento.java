/**
 * 
 */
package co.org.dane.persistencia.repositorios.modulo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.org.dane.persistencia.entidades.modulo1.Departamento;

/**
 * @author ALFONSO
 *
 */
@Repository
public interface RepositorioDepartamento  extends JpaRepository<Departamento, Integer>{

}
