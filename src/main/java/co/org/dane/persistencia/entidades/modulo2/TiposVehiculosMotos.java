/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_TIPOS_VEHICULOS_MOTOS")
@Setter
@Getter
public class TiposVehiculosMotos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqTiposVehiculosMotos" )
	@SequenceGenerator( name = "SeqTiposVehiculosMotos", sequenceName = "SEQ_TIPOS_VEHICULOS_MOTOS", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_TIPOS_VEHICULOS_MOTOS_PK", nullable = false )
	private int id;
	
	@Column( name = "CODIGO", nullable = false, updatable = true, length = 2 )
	private int codigo;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "NOMBRE", nullable = false, updatable = true, length = 100 )
	private String nombre;

}
