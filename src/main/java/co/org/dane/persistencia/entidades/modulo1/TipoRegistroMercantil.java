/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

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
@Table(name = "EAC_TIPO_REGISTRO_MERCANTIL")
@Setter
@Getter
public class TipoRegistroMercantil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqTipoRegistroMercantil" )
	@SequenceGenerator( name = "SeqTipoRegistroMercantil", sequenceName = "SEQ_TIPO_REGISTRO_MERCANTIL", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_TIPO_REGISTRO_MERCANTIL_PK", nullable = false )
	private int id;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "TIPO_REGISTRO_MERCANTIL", nullable = false, updatable = true, length = 100 )
	private String tipoRegistroMercantil;

	
	
}
