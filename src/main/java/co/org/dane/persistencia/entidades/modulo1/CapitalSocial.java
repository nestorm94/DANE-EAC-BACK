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
@Table(name = "EAC_CAPITAL_SOCIAL")
@Setter
@Getter
public class CapitalSocial implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqCapitalSocial" )
	@SequenceGenerator( name = "SeqCapitalSocial", sequenceName = "SEQ_CAPITAL_SOCIAL", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_CAPITAL_SOCIAL_PK", nullable = false )
	private long id;
	
	@Column( name = "PUBLICO", nullable = false, updatable = true, length = 3 )
	private int publico;
	
	@Column( name = "PRIVADO", nullable = false, updatable = true, length = 3 )
	private int privado;
	
	@Column( name = "TOTAL", nullable = false, updatable = true, length = 3 )
	private int total;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoCapitalSocial tipoCapitalSocial;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARATULA_UNICA_FK", nullable = false, updatable = true)
	private CaratulaUnica caratulaUnica;
	
	
}
