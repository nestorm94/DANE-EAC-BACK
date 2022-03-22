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
@Table(name = "EAC_INGRESOS_NO_OPERACIONALES")
@Setter
@Getter
public class IngresosNoOperacionales implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqIngresosNoOperacionales" )
	@SequenceGenerator( name = "SeqIngresosNoOperacionales", sequenceName = "SEQ_INGRESOS_NO_OPERACIONALES", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_INGRESO_NO_OPERACIONAL_PK", nullable = false )
	private long id;
	
	@Column( name = "VALOR", nullable = false, updatable = true, length = 12 )
	private long valor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TIPO_INGRESO_NO_OPERACIONAL_FK")
	private TipoIngresosNoOperacionales tipoIngresosNoOperacionales;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CARATULA_UNICA_FK")
	private CaratulaUnica caratulaUnica;

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the valor
	 */
	public long getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(long valor) {
		this.valor = valor;
	}

	/**
	 * @return the tipoIngresosNoOperacionales
	 */
	public TipoIngresosNoOperacionales getTipoIngresosNoOperacionales() {
		return tipoIngresosNoOperacionales;
	}

	/**
	 * @param tipoIngresosNoOperacionales the tipoIngresosNoOperacionales to set
	 */
	public void setTipoIngresosNoOperacionales(TipoIngresosNoOperacionales tipoIngresosNoOperacionales) {
		this.tipoIngresosNoOperacionales = tipoIngresosNoOperacionales;
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

}
