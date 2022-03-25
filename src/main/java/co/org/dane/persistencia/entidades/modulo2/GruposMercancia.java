/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo2;

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

import co.org.dane.persistencia.entidades.modulo1.CodigoCIIU;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_GRUPOS_MERCANCIA")
@Setter
@Getter
public class GruposMercancia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqGruposMercancia" )
	@SequenceGenerator( name = "SeqGruposMercancia", sequenceName = "SEQ_GRUPOS_MERCANCIA", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_GRUPOS_MERCANCIA_PK", nullable = false )
	private int id;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 3 )
	private int orden;
	
	@Column( name = "CODIGO", nullable = false, updatable = true, length = 2 )
	private String codigo;
	
	@Column( name = "NOMBRE", nullable = false, updatable = true, length = 100 )
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CODIGO_CIIU_FK", nullable = false, updatable = true)
	private CodigoCIIU codigoCIIU;

}
