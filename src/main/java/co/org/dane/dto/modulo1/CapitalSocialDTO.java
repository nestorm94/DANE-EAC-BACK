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
public class CapitalSocialDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private int publico;
	private int privado;
	private int total;
	private int idTipoCapitalSocial;
	private long idCaratulaUnica;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPublico() {
		return publico;
	}
	public void setPublico(int publico) {
		this.publico = publico;
	}
	public int getPrivado() {
		return privado;
	}
	public void setPrivado(int privado) {
		this.privado = privado;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getIdTipoCapitalSocial() {
		return idTipoCapitalSocial;
	}
	public void setIdTipoCapitalSocial(int idTipoCapitalSocial) {
		this.idTipoCapitalSocial = idTipoCapitalSocial;
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
