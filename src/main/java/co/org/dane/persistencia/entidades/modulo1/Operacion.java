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
@Table(name = "EAC_OPERACIONES")
@Setter
@Getter
public class Operacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqOperacion" )
	@SequenceGenerator( name = "SeqOperacion", sequenceName = "SEQ_OPERACIONES", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_OPERACION_PK", nullable = false )
	private long id;
	
	@Column( name = "BIENES", nullable = false, updatable = true, length = 1 )
	private int bienes;
	
	@Column( name = "SERVICIOS", nullable = false, updatable = true, length = 2 )
	private int servicios;
	
	@Column( name = "NINGUNA", nullable = false, updatable = true, length = 3 )
	private int ninguna;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_TIPO_OPERACION_FK", nullable = false, updatable = true)
	private TipoOperacion tipoOperacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CARATULA_UNICA_FK", nullable = false, updatable = true)
	private CaratulaUnica caratulaUnica;

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the bienes
	 */
	public int getBienes() {
		return bienes;
	}

	/**
	 * @param bienes the bienes to set
	 */
	public void setBienes(int bienes) {
		this.bienes = bienes;
	}

	/**
	 * @return the servicios
	 */
	public int getServicios() {
		return servicios;
	}

	/**
	 * @param servicios the servicios to set
	 */
	public void setServicios(int servicios) {
		this.servicios = servicios;
	}

	/**
	 * @return the ninguna
	 */
	public int getNinguna() {
		return ninguna;
	}

	/**
	 * @param ninguna the ninguna to set
	 */
	public void setNinguna(int ninguna) {
		this.ninguna = ninguna;
	}

	/**
	 * @return the tipoOperacion
	 */
	public TipoOperacion getTipoOperacion() {
		return tipoOperacion;
	}

	/**
	 * @param tipoOperacion the tipoOperacion to set
	 */
	public void setTipoOperacion(TipoOperacion tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
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
