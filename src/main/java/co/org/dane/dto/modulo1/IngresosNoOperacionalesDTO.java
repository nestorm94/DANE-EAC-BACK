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
public class IngresosNoOperacionalesDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long valor;
	private int idTipoIngresosNoOperacionales;
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
	 * @return the idTipoIngresosNoOperacionales
	 */
	public int getIdTipoIngresosNoOperacionales() {
		return idTipoIngresosNoOperacionales;
	}
	/**
	 * @param idTipoIngresosNoOperacionales the idTipoIngresosNoOperacionales to set
	 */
	public void setIdTipoIngresosNoOperacionales(int idTipoIngresosNoOperacionales) {
		this.idTipoIngresosNoOperacionales = idTipoIngresosNoOperacionales;
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
