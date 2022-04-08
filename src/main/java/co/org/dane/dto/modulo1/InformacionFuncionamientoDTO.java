/**
 * 
 */
package co.org.dane.dto.modulo1;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Setter
@Getter
public class InformacionFuncionamientoDTO {
	
	private long id;
	private int anioInicioOperaciones;
	private int mesesOperacion;
	private String cualOtraCausa;
	private int numeroDepartamentos;
	private Date fechaDiligenciamiento;
	private String representanteLegal;
	private String emailRepresentante;
	private long celularRepresentante;
	private String personaDiligencia;
	private String cargoDiligencia;
	private String emailDiligencia;
	private long telefonoDiligencia;
	private long extensionDiligencia;
	private long celularDiligencia;
	private int idTipoCausa;
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
	 * @return the anioInicioOperaciones
	 */
	public int getAnioInicioOperaciones() {
		return anioInicioOperaciones;
	}
	/**
	 * @param anioInicioOperaciones the anioInicioOperaciones to set
	 */
	public void setAnioInicioOperaciones(int anioInicioOperaciones) {
		this.anioInicioOperaciones = anioInicioOperaciones;
	}
	/**
	 * @return the mesesOperacion
	 */
	public int getMesesOperacion() {
		return mesesOperacion;
	}
	/**
	 * @param mesesOperacion the mesesOperacion to set
	 */
	public void setMesesOperacion(int mesesOperacion) {
		this.mesesOperacion = mesesOperacion;
	}
	/**
	 * @return the cualOtraCausa
	 */
	public String getCualOtraCausa() {
		return cualOtraCausa;
	}
	/**
	 * @param cualOtraCausa the cualOtraCausa to set
	 */
	public void setCualOtraCausa(String cualOtraCausa) {
		this.cualOtraCausa = cualOtraCausa;
	}
	/**
	 * @return the numeroDepartamentos
	 */
	public int getNumeroDepartamentos() {
		return numeroDepartamentos;
	}
	/**
	 * @param numeroDepartamentos the numeroDepartamentos to set
	 */
	public void setNumeroDepartamentos(int numeroDepartamentos) {
		this.numeroDepartamentos = numeroDepartamentos;
	}
	/**
	 * @return the fechaDiligenciamiento
	 */
	public Date getFechaDiligenciamiento() {
		return fechaDiligenciamiento;
	}
	/**
	 * @param fechaDiligenciamiento the fechaDiligenciamiento to set
	 */
	public void setFechaDiligenciamiento(Date fechaDiligenciamiento) {
		this.fechaDiligenciamiento = fechaDiligenciamiento;
	}
	/**
	 * @return the representanteLegal
	 */
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	/**
	 * @param representanteLegal the representanteLegal to set
	 */
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	/**
	 * @return the emailRepresentante
	 */
	public String getEmailRepresentante() {
		return emailRepresentante;
	}
	/**
	 * @param emailRepresentante the emailRepresentante to set
	 */
	public void setEmailRepresentante(String emailRepresentante) {
		this.emailRepresentante = emailRepresentante;
	}
	/**
	 * @return the celularRepresentante
	 */
	public long getCelularRepresentante() {
		return celularRepresentante;
	}
	/**
	 * @param celularRepresentante the celularRepresentante to set
	 */
	public void setCelularRepresentante(long celularRepresentante) {
		this.celularRepresentante = celularRepresentante;
	}
	/**
	 * @return the personaDiligencia
	 */
	public String getPersonaDiligencia() {
		return personaDiligencia;
	}
	/**
	 * @param personaDiligencia the personaDiligencia to set
	 */
	public void setPersonaDiligencia(String personaDiligencia) {
		this.personaDiligencia = personaDiligencia;
	}
	/**
	 * @return the cargoDiligencia
	 */
	public String getCargoDiligencia() {
		return cargoDiligencia;
	}
	/**
	 * @param cargoDiligencia the cargoDiligencia to set
	 */
	public void setCargoDiligencia(String cargoDiligencia) {
		this.cargoDiligencia = cargoDiligencia;
	}
	/**
	 * @return the emailDiligencia
	 */
	public String getEmailDiligencia() {
		return emailDiligencia;
	}
	/**
	 * @param emailDiligencia the emailDiligencia to set
	 */
	public void setEmailDiligencia(String emailDiligencia) {
		this.emailDiligencia = emailDiligencia;
	}
	/**
	 * @return the telefonoDiligencia
	 */
	public long getTelefonoDiligencia() {
		return telefonoDiligencia;
	}
	/**
	 * @param telefonoDiligencia the telefonoDiligencia to set
	 */
	public void setTelefonoDiligencia(long telefonoDiligencia) {
		this.telefonoDiligencia = telefonoDiligencia;
	}
	/**
	 * @return the extensionDiligencia
	 */
	public long getExtensionDiligencia() {
		return extensionDiligencia;
	}
	/**
	 * @param extensionDiligencia the extensionDiligencia to set
	 */
	public void setExtensionDiligencia(long extensionDiligencia) {
		this.extensionDiligencia = extensionDiligencia;
	}
	/**
	 * @return the celularDiligencia
	 */
	public long getCelularDiligencia() {
		return celularDiligencia;
	}
	/**
	 * @param celularDiligencia the celularDiligencia to set
	 */
	public void setCelularDiligencia(long celularDiligencia) {
		this.celularDiligencia = celularDiligencia;
	}
	/**
	 * @return the idTipoCausa
	 */
	public int getIdTipoCausa() {
		return idTipoCausa;
	}
	/**
	 * @param idTipoCausa the idTipoCausa to set
	 */
	public void setIdTipoCausa(int idTipoCausa) {
		this.idTipoCausa = idTipoCausa;
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
	public void setIdCaratulaUnica(Object idCaratulaUnica2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
