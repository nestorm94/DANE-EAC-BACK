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

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPublico() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the privado
	 */
	public int getPrivado() {
		return privado;
	}

	/**
	 * @param privado the privado to set
	 */
	public void setPrivado(int privado) {
		this.privado = privado;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the tipoCapitalSocial
	 */
	public TipoCapitalSocial getTipoCapitalSocial() {
		return tipoCapitalSocial;
	}

	/**
	 * @param tipoCapitalSocial the tipoCapitalSocial to set
	 */
	public void setTipoCapitalSocial(TipoCapitalSocial tipoCapitalSocial) {
		this.tipoCapitalSocial = tipoCapitalSocial;
	}

	/**
	 * @return the caratulaUnica
	 */
	public CaratulaUnica getCaratulaUnica() {
		return caratulaUnica;
	}

	/**
	 * @param caratulaUnica the caratulaUnica to set
	 */
	public void setCaratulaUnica(CaratulaUnica caratulaUnica) {
		this.caratulaUnica = caratulaUnica;
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
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param publico the publico to set
	 */
	public void setPublico(int publico) {
		this.publico = publico;
	}
	
	
	
}
