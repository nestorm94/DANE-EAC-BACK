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
@Table(name = "EAC_TIPO_CAPITAL_SOCIAL")
@Setter
@Getter
public class TipoCapitalSocial implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqTipoCapitalSocial" )
	@SequenceGenerator( name = "SeqTipoCapitalSocial", sequenceName = "SEQ_TIPO_CAPITAL_SOCIAL", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_TIPO_CAPITAL_SOCIAL_PK", nullable = false )
	private int id;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "TIPO_CAPITAL_SOCIAL", nullable = false, updatable = true, length = 50 )
	private String tipoCapitalSocial;

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}

	/**
	 * @return the tipoCapitalSocial
	 */
	public String getTipoCapitalSocial() {
		return tipoCapitalSocial;
	}

	/**
	 * @param tipoCapitalSocial the tipoCapitalSocial to set
	 */
	public void setTipoCapitalSocial(String tipoCapitalSocial) {
		this.tipoCapitalSocial = tipoCapitalSocial;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
