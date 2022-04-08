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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
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
