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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAnioInicioOperaciones() {
		return anioInicioOperaciones;
	}
	public void setAnioInicioOperaciones(int anioInicioOperaciones) {
		this.anioInicioOperaciones = anioInicioOperaciones;
	}
	public int getMesesOperacion() {
		return mesesOperacion;
	}
	public void setMesesOperacion(int mesesOperacion) {
		this.mesesOperacion = mesesOperacion;
	}
	public String getCualOtraCausa() {
		return cualOtraCausa;
	}
	public void setCualOtraCausa(String cualOtraCausa) {
		this.cualOtraCausa = cualOtraCausa;
	}
	public int getNumeroDepartamentos() {
		return numeroDepartamentos;
	}
	public void setNumeroDepartamentos(int numeroDepartamentos) {
		this.numeroDepartamentos = numeroDepartamentos;
	}
	public Date getFechaDiligenciamiento() {
		return fechaDiligenciamiento;
	}
	public void setFechaDiligenciamiento(Date fechaDiligenciamiento) {
		this.fechaDiligenciamiento = fechaDiligenciamiento;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getEmailRepresentante() {
		return emailRepresentante;
	}
	public void setEmailRepresentante(String emailRepresentante) {
		this.emailRepresentante = emailRepresentante;
	}
	public long getCelularRepresentante() {
		return celularRepresentante;
	}
	public void setCelularRepresentante(long celularRepresentante) {
		this.celularRepresentante = celularRepresentante;
	}
	public String getPersonaDiligencia() {
		return personaDiligencia;
	}
	public void setPersonaDiligencia(String personaDiligencia) {
		this.personaDiligencia = personaDiligencia;
	}
	public String getCargoDiligencia() {
		return cargoDiligencia;
	}
	public void setCargoDiligencia(String cargoDiligencia) {
		this.cargoDiligencia = cargoDiligencia;
	}
	public String getEmailDiligencia() {
		return emailDiligencia;
	}
	public void setEmailDiligencia(String emailDiligencia) {
		this.emailDiligencia = emailDiligencia;
	}
	public long getTelefonoDiligencia() {
		return telefonoDiligencia;
	}
	public void setTelefonoDiligencia(long telefonoDiligencia) {
		this.telefonoDiligencia = telefonoDiligencia;
	}
	public long getExtensionDiligencia() {
		return extensionDiligencia;
	}
	public void setExtensionDiligencia(long extensionDiligencia) {
		this.extensionDiligencia = extensionDiligencia;
	}
	public long getCelularDiligencia() {
		return celularDiligencia;
	}
	public void setCelularDiligencia(long celularDiligencia) {
		this.celularDiligencia = celularDiligencia;
	}
	public int getIdTipoCausa() {
		return idTipoCausa;
	}
	public void setIdTipoCausa(int idTipoCausa) {
		this.idTipoCausa = idTipoCausa;
	}
	public long getIdCaratulaUnica() {
		return idCaratulaUnica;
	}
	public void setIdCaratulaUnica(long idCaratulaUnica) {
		this.idCaratulaUnica = idCaratulaUnica;
	}
	
	

}
