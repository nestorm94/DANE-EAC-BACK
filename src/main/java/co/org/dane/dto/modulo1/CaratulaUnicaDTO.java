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
	//vamos en este punto
	private int idTipoRegistroMercantil;
	private int idTipoOrganizacion;
	private int idSubTipoOrganizacion;
	private int idEstadoEmpresa;
	private int idPeriodoRecoleccion;
	private long idDirectorio;
	private int idEstadoEncuesta;
	
	
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
	 * @return the numeroOrden
	 */
	public int getNumeroOrden() {
		return numeroOrden;
	}


	/**
	 * @param numeroOrden the numeroOrden to set
	 */
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}


	/**
	 * @return the numeroDocumento
	 */
	public long getNumeroDocumento() {
		return numeroDocumento;
	}


	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	/**
	 * @return the digitoVerificacion
	 */
	public byte getDigitoVerificacion() {
		return digitoVerificacion;
	}


	/**
	 * @param digitoVerificacion the digitoVerificacion to set
	 */
	public void setDigitoVerificacion(byte digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}


	/**
	 * @return the numeroCamara
	 */
	public int getNumeroCamara() {
		return numeroCamara;
	}


	/**
	 * @param numeroCamara the numeroCamara to set
	 */
	public void setNumeroCamara(int numeroCamara) {
		this.numeroCamara = numeroCamara;
	}


	/**
	 * @return the numeroRegistro
	 */
	public long getNumeroRegistro() {
		return numeroRegistro;
	}


	/**
	 * @param numeroRegistro the numeroRegistro to set
	 */
	public void setNumeroRegistro(long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}


	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}


	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	/**
	 * @return the georeferenciaGerecia
	 */
	public double getGeoreferenciaGerecia() {
		return georeferenciaGerecia;
	}


	/**
	 * @param georeferenciaGerecia the georeferenciaGerecia to set
	 */
	public void setGeoreferenciaGerecia(double georeferenciaGerecia) {
		this.georeferenciaGerecia = georeferenciaGerecia;
	}


	/**
	 * @return the nombreComercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}


	/**
	 * @param nombreComercial the nombreComercial to set
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}


	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}


	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
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
	 * @return the georeferenciaNotificacion
	 */
	public double getGeoreferenciaNotificacion() {
		return georeferenciaNotificacion;
	}


	/**
	 * @param georeferenciaNotificacion the georeferenciaNotificacion to set
	 */
	public void setGeoreferenciaNotificacion(double georeferenciaNotificacion) {
		this.georeferenciaNotificacion = georeferenciaNotificacion;
	}


	/**
	 * @return the cualTipoOrgaizacion
	 */
	public String getCualTipoOrgaizacion() {
		return cualTipoOrgaizacion;
	}


	/**
	 * @param cualTipoOrgaizacion the cualTipoOrgaizacion to set
	 */
	public void setCualTipoOrgaizacion(String cualTipoOrgaizacion) {
		this.cualTipoOrgaizacion = cualTipoOrgaizacion;
	}


	/**
	 * @return the fechaConstitucionDesde
	 */
	public String getFechaConstitucionDesde() {
		return fechaConstitucionDesde;
	}


	/**
	 * @param fechaConstitucionDesde the fechaConstitucionDesde to set
	 */
	public void setFechaConstitucionDesde(String fechaConstitucionDesde) {
		this.fechaConstitucionDesde = fechaConstitucionDesde;
	}


	/**
	 * @return the fechaConstitucionHasta
	 */
	public String getFechaConstitucionHasta() {
		return fechaConstitucionHasta;
	}


	/**
	 * @param fechaConstitucionHasta the fechaConstitucionHasta to set
	 */
	public void setFechaConstitucionHasta(String fechaConstitucionHasta) {
		this.fechaConstitucionHasta = fechaConstitucionHasta;
	}


	/**
	 * @return the cualOtroEstado
	 */
	public String getCualOtroEstado() {
		return cualOtroEstado;
	}


	/**
	 * @param cualOtroEstado the cualOtroEstado to set
	 */
	public void setCualOtroEstado(String cualOtroEstado) {
		this.cualOtroEstado = cualOtroEstado;
	}


	/**
	 * @return the numeroUnidadesApoyo
	 */
	public String getNumeroUnidadesApoyo() {
		return numeroUnidadesApoyo;
	}


	/**
	 * @param numeroUnidadesApoyo the numeroUnidadesApoyo to set
	 */
	public void setNumeroUnidadesApoyo(String numeroUnidadesApoyo) {
		this.numeroUnidadesApoyo = numeroUnidadesApoyo;
	}


	/**
	 * @return the idTipoDocumento
	 */
	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}


	/**
	 * @param idTipoDocumento the idTipoDocumento to set
	 */
	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}


	/**
	 * @return the idTipoRegistroMercantil
	 */
	public int getIdTipoRegistroMercantil() {
		return idTipoRegistroMercantil;
	}


	/**
	 * @param idTipoRegistroMercantil the idTipoRegistroMercantil to set
	 */
	public void setIdTipoRegistroMercantil(int idTipoRegistroMercantil) {
		this.idTipoRegistroMercantil = idTipoRegistroMercantil;
	}


	/**
	 * @return the idTipoOrganizacion
	 */
	public int getIdTipoOrganizacion() {
		return idTipoOrganizacion;
	}


	/**
	 * @param idTipoOrganizacion the idTipoOrganizacion to set
	 */
	public void setIdTipoOrganizacion(int idTipoOrganizacion) {
		this.idTipoOrganizacion = idTipoOrganizacion;
	}


	/**
	 * @return the idSubTipoOrganizacion
	 */
	public int getIdSubTipoOrganizacion() {
		return idSubTipoOrganizacion;
	}


	/**
	 * @param idSubTipoOrganizacion the idSubTipoOrganizacion to set
	 */
	public void setIdSubTipoOrganizacion(int idSubTipoOrganizacion) {
		this.idSubTipoOrganizacion = idSubTipoOrganizacion;
	}


	/**
	 * @return the idEstadoEmpresa
	 */
	public int getIdEstadoEmpresa() {
		return idEstadoEmpresa;
	}


	/**
	 * @param idEstadoEmpresa the idEstadoEmpresa to set
	 */
	public void setIdEstadoEmpresa(int idEstadoEmpresa) {
		this.idEstadoEmpresa = idEstadoEmpresa;
	}


	/**
	 * @return the idPeriodoRecoleccion
	 */
	public int getIdPeriodoRecoleccion() {
		return idPeriodoRecoleccion;
	}


	/**
	 * @param idPeriodoRecoleccion the idPeriodoRecoleccion to set
	 */
	public void setIdPeriodoRecoleccion(int idPeriodoRecoleccion) {
		this.idPeriodoRecoleccion = idPeriodoRecoleccion;
	}


	/**
	 * @return the idDirectorio
	 */
	public long getIdDirectorio() {
		return idDirectorio;
	}


	/**
	 * @param idDirectorio the idDirectorio to set
	 */
	public void setIdDirectorio(long idDirectorio) {
		this.idDirectorio = idDirectorio;
	}


	/**
	 * @return the idEstadoEncuesta
	 */
	public int getIdEstadoEncuesta() {
		return idEstadoEncuesta;
	}


	/**
	 * @param idEstadoEncuesta the idEstadoEncuesta to set
	 */
	public void setIdEstadoEncuesta(int idEstadoEncuesta) {
		this.idEstadoEncuesta = idEstadoEncuesta;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}
	
}
