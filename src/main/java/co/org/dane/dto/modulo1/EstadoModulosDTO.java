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
public class EstadoModulosDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String estado;
	private int idModulo;
	private long idCaratulaUnica;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the idModulo
	 */
	public int getIdModulo() {
		return idModulo;
	}
	/**
	 * @param idModulo the idModulo to set
	 */
	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
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
