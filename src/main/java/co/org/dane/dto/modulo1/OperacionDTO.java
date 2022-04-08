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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getBienes() {
		return bienes;
	}
	public void setBienes(int bienes) {
		this.bienes = bienes;
	}
	public int getServicios() {
		return servicios;
	}
	public void setServicios(int servicios) {
		this.servicios = servicios;
	}
	public int getNinguna() {
		return ninguna;
	}
	public void setNinguna(int ninguna) {
		this.ninguna = ninguna;
	}
	public int getIdTipoOperacion() {
		return idTipoOperacion;
	}
	public void setIdTipoOperacion(int idTipoOperacion) {
		this.idTipoOperacion = idTipoOperacion;
	}
	public long getIdCaratulaUnica() {
		return idCaratulaUnica;
	}
	public void setIdCaratulaUnica(long idCaratulaUnica) {
		this.idCaratulaUnica = idCaratulaUnica;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
