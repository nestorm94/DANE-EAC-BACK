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
	 * @return the localizacionGeoreferenciada
	 */
	public double getLocalizacionGeoreferenciada() {
		return localizacionGeoreferenciada;
	}
	/**
	 * @param localizacionGeoreferenciada the localizacionGeoreferenciada to set
	 */
	public void setLocalizacionGeoreferenciada(double localizacionGeoreferenciada) {
		this.localizacionGeoreferenciada = localizacionGeoreferenciada;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the redesSociales
	 */
	public String getRedesSociales() {
		return redesSociales;
	}
	/**
	 * @param redesSociales the redesSociales to set
	 */
	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}
	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	/**
	 * @return the paginaWeb
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}
	/**
	 * @param paginaWeb the paginaWeb to set
	 */
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	/**
	 * @return the idDepartamento
	 */
	public int getIdDepartamento() {
		return idDepartamento;
	}
	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	/**
	 * @return the idMunicipio
	 */
	public int getIdMunicipio() {
		return idMunicipio;
	}
	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	/**
	 * @return the idTipoDireccion
	 */
	public int getIdTipoDireccion() {
		return idTipoDireccion;
	}
	/**
	 * @param idTipoDireccion the idTipoDireccion to set
	 */
	public void setIdTipoDireccion(int idTipoDireccion) {
		this.idTipoDireccion = idTipoDireccion;
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
