/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_SUB_TIPO_ORGANIZACION")
@Setter
@Getter
public class SubTipoOrganizacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqSubTipoOrganizacion" )
	@SequenceGenerator( name = "SeqSubTipoOrganizacion", sequenceName = "SEQ_SUB_TIPO_ORGANIZACION", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_SUB_TIPO_ORGANIZACION_PK", nullable = false )
	private int id;
	
	@Column( name = "CODIGO", nullable = false, updatable = true, length = 4 )
	private String codigo;
	
	@Column( name = "ORDEN", nullable = true, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "NOMBRE", nullable = false, updatable = true, length = 100 )
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_ORGANIZACION_FK", nullable = false, updatable = true)
	private TipoOrganizacion tipoOrganizacion;

	
	
}
