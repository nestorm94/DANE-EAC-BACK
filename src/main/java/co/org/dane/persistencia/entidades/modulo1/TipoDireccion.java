///**
// * 
// */
package co.org.dane.persistencia.entidades.modulo1;
//
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_TIPO_DIRECCION")
@Setter
@Getter
public class TipoDireccion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "ID_TIPO_DIRECCION_PK", nullable = false )
	private int id;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "TIPO_DIRECCION", nullable = false, updatable = true, length = 80 )
	private String tipoDireccion;
}
