/**
 * 
 */
package co.org.dane.dto.modulo1;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Setter
@Getter
public class OperacionDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private int bienes;
	private int servicios;
	private int ninguna;
	private int idTipoOperacion;
	private long idCaratulaUnica;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
	 * @return the idTipoOperacion
	 */
	public int getIdTipoOperacion() {
		return idTipoOperacion;
	}
	/**
	 * @param idTipoOperacion the idTipoOperacion to set
	 */
	public void setIdTipoOperacion(int idTipoOperacion) {
		this.idTipoOperacion = idTipoOperacion;
	}
	/**
	 * @return the idCaratulaUnica
	 */
	public long getIdCaratulaUnica() {
		return idCaratulaUnica;
	}
	/**
	 * @param idCaratulaUnica the idCaratulaUnica to set
	 */
	public void setIdCaratulaUnica(long idCaratulaUnica) {
		this.idCaratulaUnica = idCaratulaUnica;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
