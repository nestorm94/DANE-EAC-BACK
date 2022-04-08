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
public class CaratulaUnicaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private int numeroOrden;
	private long numeroDocumento;
	private byte digitoVerificacion;
	private int numeroCamara;
	private long numeroRegistro;	
	private String razonSocial;
	private double georeferenciaGerecia;
	private String nombreComercial;
	private String sigla;
	private String paginaWeb;
	private double georeferenciaNotificacion;
	private String cualTipoOrgaizacion;
	private String fechaConstitucionDesde;
	private String fechaConstitucionHasta;
	private String cualOtroEstado;
	private String numeroUnidadesApoyo;	
		
	private int idTipoDocumento;	
	private int idTipoCausa;
	private int idTipoRegistroMercantil;
	private int idTipoOrganizacion;
	private int idSubTipoOrganizacion;
	private int idEstadoEmpresa;
	private int idPeriodoRecoleccion;
	private long idDirectorio;
	private int idEstadoEncuesta;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public long getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public byte getDigitoVerificacion() {
		return digitoVerificacion;
	}
	public void setDigitoVerificacion(byte digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}
	public int getNumeroCamara() {
		return numeroCamara;
	}
	public void setNumeroCamara(int numeroCamara) {
		this.numeroCamara = numeroCamara;
	}
	public long getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public double getGeoreferenciaGerecia() {
		return georeferenciaGerecia;
	}
	public void setGeoreferenciaGerecia(double georeferenciaGerecia) {
		this.georeferenciaGerecia = georeferenciaGerecia;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPaginaWeb() {
		return paginaWeb;
	}
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	public double getGeoreferenciaNotificacion() {
		return georeferenciaNotificacion;
	}
	public void setGeoreferenciaNotificacion(double georeferenciaNotificacion) {
		this.georeferenciaNotificacion = georeferenciaNotificacion;
	}
	public String getCualTipoOrgaizacion() {
		return cualTipoOrgaizacion;
	}
	public void setCualTipoOrgaizacion(String cualTipoOrgaizacion) {
		this.cualTipoOrgaizacion = cualTipoOrgaizacion;
	}
	public String getFechaConstitucionDesde() {
		return fechaConstitucionDesde;
	}
	public void setFechaConstitucionDesde(String fechaConstitucionDesde) {
		this.fechaConstitucionDesde = fechaConstitucionDesde;
	}
	public String getFechaConstitucionHasta() {
		return fechaConstitucionHasta;
	}
	public void setFechaConstitucionHasta(String fechaConstitucionHasta) {
		this.fechaConstitucionHasta = fechaConstitucionHasta;
	}
	public String getCualOtroEstado() {
		return cualOtroEstado;
	}
	public void setCualOtroEstado(String cualOtroEstado) {
		this.cualOtroEstado = cualOtroEstado;
	}
	public String getNumeroUnidadesApoyo() {
		return numeroUnidadesApoyo;
	}
	public void setNumeroUnidadesApoyo(String numeroUnidadesApoyo) {
		this.numeroUnidadesApoyo = numeroUnidadesApoyo;
	}
	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public int getIdTipoCausa() {
		return idTipoCausa;
	}
	public void setIdTipoCausa(int idTipoCausa) {
		this.idTipoCausa = idTipoCausa;
	}
	public int getIdTipoRegistroMercantil() {
		return idTipoRegistroMercantil;
	}
	public void setIdTipoRegistroMercantil(int idTipoRegistroMercantil) {
		this.idTipoRegistroMercantil = idTipoRegistroMercantil;
	}
	public int getIdTipoOrganizacion() {
		return idTipoOrganizacion;
	}
	public void setIdTipoOrganizacion(int idTipoOrganizacion) {
		this.idTipoOrganizacion = idTipoOrganizacion;
	}
	public int getIdSubTipoOrganizacion() {
		return idSubTipoOrganizacion;
	}
	public void setIdSubTipoOrganizacion(int idSubTipoOrganizacion) {
		this.idSubTipoOrganizacion = idSubTipoOrganizacion;
	}
	public int getIdEstadoEmpresa() {
		return idEstadoEmpresa;
	}
	public void setIdEstadoEmpresa(int idEstadoEmpresa) {
		this.idEstadoEmpresa = idEstadoEmpresa;
	}
	public int getIdPeriodoRecoleccion() {
		return idPeriodoRecoleccion;
	}
	public void setIdPeriodoRecoleccion(int idPeriodoRecoleccion) {
		this.idPeriodoRecoleccion = idPeriodoRecoleccion;
	}
	public long getIdDirectorio() {
		return idDirectorio;
	}
	public void setIdDirectorio(long idDirectorio) {
		this.idDirectorio = idDirectorio;
	}
	public int getIdEstadoEncuesta() {
		return idEstadoEncuesta;
	}
	public void setIdEstadoEncuesta(int idEstadoEncuesta) {
		this.idEstadoEncuesta = idEstadoEncuesta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
