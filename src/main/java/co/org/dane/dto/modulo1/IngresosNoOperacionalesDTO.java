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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getValor() {
		return valor;
	}
	public void setValor(long valor) {
		this.valor = valor;
	}
	public int getIdTipoIngresosNoOperacionales() {
		return idTipoIngresosNoOperacionales;
	}
	public void setIdTipoIngresosNoOperacionales(int idTipoIngresosNoOperacionales) {
		this.idTipoIngresosNoOperacionales = idTipoIngresosNoOperacionales;
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
