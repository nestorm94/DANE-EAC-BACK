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
	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}
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
	 * @return the publico
	 */
	public int getPublico() {
		return publico;
	}
	/**
	 * @param publico the publico to set
	 */
	public void setPublico(int publico) {
		this.publico = publico;
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
	 * @return the idTipoCapitalSocial
	 */
	public int getIdTipoCapitalSocial() {
		return idTipoCapitalSocial;
	}
	/**
	 * @param idTipoCapitalSocial the idTipoCapitalSocial to set
	 */
	public void setIdTipoCapitalSocial(int idTipoCapitalSocial) {
		this.idTipoCapitalSocial = idTipoCapitalSocial;
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
	public void setIdCaratulaUnica(Object idCaratulaUnica2) {
		// TODO Auto-generated method stub
		
	}
}
