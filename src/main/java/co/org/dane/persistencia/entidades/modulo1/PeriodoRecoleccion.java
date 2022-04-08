/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "EAC_PERIODOS_RECOLECCION")
@Setter
@Getter
public class PeriodoRecoleccion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqPeriodoRecoleccion" )
	@SequenceGenerator( name = "SeqPeriodoRecoleccion", sequenceName = "SEQ_PERIODOS_RECOLECCION", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_PERIODO_RECOLECCION_PK", nullable = false )
	private int id;
	
	@Column( name = "FECHA_DESDE", nullable = false )
	private Date fechaDesde;
	
	@Column( name = "FECHA_HASTA", nullable = false )
	private Date fechaHasta;

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the fechaDesde
	 */
	public Date getFechaDesde() {
		return fechaDesde;
	}

	/**
	 * @param fechaDesde the fechaDesde to set
	 */
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	/**
	 * @return the fechaHasta
	 */
	public Date getFechaHasta() {
		return fechaHasta;
	}

	/**
	 * @param fechaHasta the fechaHasta to set
	 */
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
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
