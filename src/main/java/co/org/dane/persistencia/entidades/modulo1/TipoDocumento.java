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
@Table(name = "EAC_TIPO_DOCUMENTO")
@Setter
@Getter
public class TipoDocumento implements Serializable{

	private static final long serialVersionUID = 5597431768761326662L;

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqTipoDocumento" )
	@SequenceGenerator( name = "SeqTipoDocumento", sequenceName = "SEQ_TIPO_DOCUMENTO", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_TIPO_DOCUMENTO_PK", nullable = false )
	private int id;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "TIPO_DOCUMENTO", nullable = false, updatable = true, length = 100 )
	private String tipoDocumento;

	
	
}
