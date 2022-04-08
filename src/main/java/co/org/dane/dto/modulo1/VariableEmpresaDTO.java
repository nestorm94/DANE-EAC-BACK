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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumeroEstablecimientos() {
		return numeroEstablecimientos;
	}
	public void setNumeroEstablecimientos(int numeroEstablecimientos) {
		this.numeroEstablecimientos = numeroEstablecimientos;
	}
	public long getIngreso() {
		return ingreso;
	}
	public void setIngreso(long ingreso) {
		this.ingreso = ingreso;
	}
	public int getPersonalOcupado() {
		return personalOcupado;
	}
	public void setPersonalOcupado(int personalOcupado) {
		this.personalOcupado = personalOcupado;
	}
	public long getRemuneracion() {
		return remuneracion;
	}
	public void setRemuneracion(long remuneracion) {
		this.remuneracion = remuneracion;
	}
	public long getOtrosCostosGastos() {
		return otrosCostosGastos;
	}
	public void setOtrosCostosGastos(long otrosCostosGastos) {
		this.otrosCostosGastos = otrosCostosGastos;
	}
	public int getIdSeccion() {
		return idSeccion;
	}
	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}
	public int getIdCodigoCIIU() {
		return idCodigoCIIU;
	}
	public void setIdCodigoCIIU(int idCodigoCIIU) {
		this.idCodigoCIIU = idCodigoCIIU;
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
