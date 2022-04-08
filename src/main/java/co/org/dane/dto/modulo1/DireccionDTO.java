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
public class DireccionDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private double localizacionGeoreferenciada;
	private String direccion;
	private String telefono;
	private String redesSociales;
	private String correoElectronico;
	private String paginaWeb;
	private int idDepartamento;
	private int idMunicipio;
	private int idTipoDireccion;
	private long idCaratulaUnica;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getLocalizacionGeoreferenciada() {
		return localizacionGeoreferenciada;
	}
	public void setLocalizacionGeoreferenciada(double localizacionGeoreferenciada) {
		this.localizacionGeoreferenciada = localizacionGeoreferenciada;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getPaginaWeb() {
		return paginaWeb;
	}
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public int getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public int getIdTipoDireccion() {
		return idTipoDireccion;
	}
	public void setIdTipoDireccion(int idTipoDireccion) {
		this.idTipoDireccion = idTipoDireccion;
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
