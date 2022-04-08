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
public class VariableEmpresaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private int numeroEstablecimientos;
	private long ingreso;
	private int personalOcupado;
	private long remuneracion;
	private long otrosCostosGastos;
	private int idSeccion;
	private int idCodigoCIIU;
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
	 * @return the numeroEstablecimientos
	 */
	public int getNumeroEstablecimientos() {
		return numeroEstablecimientos;
	}
	/**
	 * @param numeroEstablecimientos the numeroEstablecimientos to set
	 */
	public void setNumeroEstablecimientos(int numeroEstablecimientos) {
		this.numeroEstablecimientos = numeroEstablecimientos;
	}
	/**
	 * @return the ingreso
	 */
	public long getIngreso() {
		return ingreso;
	}
	/**
	 * @param ingreso the ingreso to set
	 */
	public void setIngreso(long ingreso) {
		this.ingreso = ingreso;
	}
	/**
	 * @return the personalOcupado
	 */
	public int getPersonalOcupado() {
		return personalOcupado;
	}
	/**
	 * @param personalOcupado the personalOcupado to set
	 */
	public void setPersonalOcupado(int personalOcupado) {
		this.personalOcupado = personalOcupado;
	}
	/**
	 * @return the remuneracion
	 */
	public long getRemuneracion() {
		return remuneracion;
	}
	/**
	 * @param remuneracion the remuneracion to set
	 */
	public void setRemuneracion(long remuneracion) {
		this.remuneracion = remuneracion;
	}
	/**
	 * @return the otrosCostosGastos
	 */
	public long getOtrosCostosGastos() {
		return otrosCostosGastos;
	}
	/**
	 * @param otrosCostosGastos the otrosCostosGastos to set
	 */
	public void setOtrosCostosGastos(long otrosCostosGastos) {
		this.otrosCostosGastos = otrosCostosGastos;
	}
	/**
	 * @return the idSeccion
	 */
	public int getIdSeccion() {
		return idSeccion;
	}
	/**
	 * @param idSeccion the idSeccion to set
	 */
	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}
	/**
	 * @return the idCodigoCIIU
	 */
	public int getIdCodigoCIIU() {
		return idCodigoCIIU;
	}
	/**
	 * @param idCodigoCIIU the idCodigoCIIU to set
	 */
	public void setIdCodigoCIIU(int idCodigoCIIU) {
		this.idCodigoCIIU = idCodigoCIIU;
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
