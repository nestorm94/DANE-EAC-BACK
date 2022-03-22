/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_CARATULA_UNICA")
@Setter
@Getter
//@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class CaratulaUnica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqCaratulaUnica" )
	@SequenceGenerator( name = "SeqCaratulaUnica", sequenceName = "SEQ_CARATULA_UNICA", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_CARATULA_UNICA_PK", nullable = false )
	private long id;
	
	//IDNOREMP Número de orden, identificación de cada empresa en el directorio 
	@Column( name = "NUMERO_ORDEN", nullable = false, updatable = true, length = 6 )
	private int numeroOrden;//ok
	
	//IDNITCC NIT 
	@Column( name = "NUMERO_DOCUMENTO", nullable = false, updatable = true, length = 10 )
	private long numeroDocumento;//ok
	
	//IDDV Dígito de verificación 
	@Column( name = "DIGITO_VERIFICACION", nullable = false, updatable = true, length = 1 )
	private byte digitoVerificacion;//ok
	
	//IDCAMA Registro de cámara 
	@Column( name = "NUMERO_CAMARA", nullable = true, updatable = true, length = 3 )
	private int numeroCamara;//ok
	
	//IDREG Registro mercantil
	@Column( name = "NUMERO_REGISTRO", nullable = true, updatable = true, length = 11 )
	private long numeroRegistro;//ok	
	
	//IDPRORAZ Razón social de la empresa
	@Column( name = "RAZON_SOCIAL", nullable = false, updatable = true, length = 80 )
	private String razonSocial;
	
	//IDIGG Localización georeferenciada de la gerencia (código asignado por georefenciación - LGGR)
	@Column( name = "GEOREFERENCIA_GERENCIA", nullable = false, updatable = true, length = 11 )
	private double georeferenciaGerecia;
	
	//IDNOMCOM Nombre comercial
	@Column( name = "NOMBRE_COMERCIAL", nullable = false, updatable = true, length = 80 )
	private String nombreComercial;
	
	//IDSIGLA Sigla
	@Column( name = "SIGLA", nullable = true, updatable = true, length = 10 )
	private String sigla;
	
	//IDWEB Página Web 
	@Column( name = "PAGINA_WEB", nullable = true, updatable = true, length = 40 )
	private String paginaWeb;
	
	//IDIGG Localización georeferenciada de la gerencia (código asignado por georefenciación - LGGR)
	@Column( name = "GEOREFERENCIA_NOTIFICACION", nullable = false, updatable = true, length = 11 )
	private double georeferenciaNotificacion;
	
	@Column( name = "CUAL_TIPO_ORGANIZACION", nullable = true, updatable = true, length = 30 )
	private String cualTipoOrgaizacion;
	
	//IDFEINI Fecha inicio operaciones
	@Column( name = "FECHA_CONSTITUCION_DESDE", nullable = true, updatable = true )
	private Date fechaConstitucionDesde;
	
	//IDFECIE Fecha terminación operaciones
	@Column( name = "FECHA_CONSTITUCION_HASTA", nullable = true, updatable = true )
	private Date fechaConstitucionHasta;
	
	@Column( name = "CUAL_OTRO_ESTADO", nullable = true, updatable = true, length = 30 )
	private String cualOtroEstado;
	
	@Column( name = "NUMERO_UNIDADES_APOYO", nullable = true, updatable = true, length = 5 )
	private String numeroUnidadesApoyo;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "ID_DIRECCION_PRINCIPAL_FK", nullable = true, updatable = true)
//	private Direccion direccionPrincipal;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "ID_DIRECCION_NOTIFICACION_FK", nullable = true, updatable = true)
//	private Direccion direccionNotificacion;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<Direccion> direcciones; 
	
	//tipoRegistroMercantil TipoRegistroMercantil
	//direccionNotificacio Direccion --OK
	//tipoOrganizacion TipoOrganizacion --ok
	//subTipoOrganizacion SubTipoOrganizacion ok
	//capitalSocialNacional CapitalSocial
	//capitalSocialExtranjero CapitalSocial
	//estadoEmpresa EstadoEmpresa
	//importacion Operaciones
	//exportacion Operaciones
	//variablesEmpresa List<VariablesEmpresa>
	//ingresosNoOperacionales List<IngresosNoOperacionales>
	//informacionFuncionamiento InformacionFuncionamiento
	//periodosRecoleccion PeriodosRecoleccion
	//novedadesEncuesta List<NovedadesEncuesta>
	//estadosEncuesta List<EstadosEncuesta>
	//estadoModulos List<EstadoModulos>
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_DOCUMENTO_FK", nullable = false, updatable = true)
	private TipoDocumento tipoDocumento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_REGISTRO_MERC_FK", nullable = true, updatable = true)
	private TipoRegistroMercantil tipoRegistroMercantil;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_ORGANIZACION_FK", nullable = true, updatable = true)
	private TipoOrganizacion tipoOrganizacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUC_TIPO_ORGANIZACION_FK", nullable = true, updatable = true)
	private SubTipoOrganizacion subTipoOrganizacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ESTADO_EMPRESA_FK", nullable = true, updatable = true)
	private EstadoEmpresa estadoEmpresa;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<CapitalSocial> capitalSocial;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<Operacion> operaciones;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<VariableEmpresa> variablesEmpresa;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<IngresosNoOperacionales> ingresosNoOperacionales;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private InformacionFuncionamiento informacionFuncionamiento;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERIODO_RECOLECCION_FK", nullable = false, updatable = true)
	private PeriodoRecoleccion periodoRecoleccion;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<NovedadEncuesta> novedadesEncuestas;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<EstadoEncuesta> estadosEncuestas;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<EstadoModulos> estadoModulos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIRECTORIO_FK", nullable = false, updatable = true)
	private Directorio directorio;

	@Override
	public String toString() {
		return "CaratulaUnica [id=" + id + ", numeroOrden=" + numeroOrden + ", numeroDocumento=" + numeroDocumento
				+ ", digitoVerificacion=" + digitoVerificacion + ", numeroCamara=" + numeroCamara + ", numeroRegistro="
				+ numeroRegistro + ", razonSocial=" + razonSocial + ", georeferenciaGerecia=" + georeferenciaGerecia
				+ ", nombreComercial=" + nombreComercial + ", sigla=" + sigla + ", paginaWeb=" + paginaWeb
				+ ", georeferenciaNotificacion=" + georeferenciaNotificacion + ", cualTipoOrgaizacion="
				+ cualTipoOrgaizacion + ", fechaConstitucionDesde=" + fechaConstitucionDesde
				+ ", fechaConstitucionHasta=" + fechaConstitucionHasta + ", cualOtroEstado=" + cualOtroEstado
				+ ", numeroUnidadesApoyo=" + numeroUnidadesApoyo + ", direcciones=" + direcciones + ", tipoDocumento="
				+ tipoDocumento + ", tipoRegistroMercantil=" + tipoRegistroMercantil + ", tipoOrganizacion="
				+ tipoOrganizacion + ", subTipoOrganizacion=" + subTipoOrganizacion + ", estadoEmpresa=" + estadoEmpresa
				+ ", capitalSocial=" + capitalSocial + ", operaciones=" + operaciones + ", variablesEmpresa="
				+ variablesEmpresa + ", ingresosNoOperacionales=" + ingresosNoOperacionales
				+ ", informacionFuncionamiento=" + informacionFuncionamiento + ", periodoRecoleccion="
				+ periodoRecoleccion + ", novedadesEncuestas=" + novedadesEncuestas + ", estadosEncuestas="
				+ estadosEncuestas + ", estadoModulos=" + estadoModulos + ", directorio=" + directorio + "]";
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
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
	public Date getFechaConstitucionDesde() {
		return fechaConstitucionDesde;
	}

	/**
	 * @param fechaConstitucionDesde the fechaConstitucionDesde to set
	 */
	public void setFechaConstitucionDesde(Date fechaConstitucionDesde) {
		this.fechaConstitucionDesde = fechaConstitucionDesde;
	}

	/**
	 * @return the fechaConstitucionHasta
	 */
	public Date getFechaConstitucionHasta() {
		return fechaConstitucionHasta;
	}

	/**
	 * @param fechaConstitucionHasta the fechaConstitucionHasta to set
	 */
	public void setFechaConstitucionHasta(Date fechaConstitucionHasta) {
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
	 * @return the direcciones
	 */
	public Collection<Direccion> getDirecciones() {
		return direcciones;
	}

	/**
	 * @param direcciones the direcciones to set
	 */
	public void setDirecciones(Collection<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the tipoRegistroMercantil
	 */
	public TipoRegistroMercantil getTipoRegistroMercantil() {
		return tipoRegistroMercantil;
	}

	/**
	 * @param tipoRegistroMercantil the tipoRegistroMercantil to set
	 */
	public void setTipoRegistroMercantil(TipoRegistroMercantil tipoRegistroMercantil) {
		this.tipoRegistroMercantil = tipoRegistroMercantil;
	}

	/**
	 * @return the tipoOrganizacion
	 */
	public TipoOrganizacion getTipoOrganizacion() {
		return tipoOrganizacion;
	}

	/**
	 * @param tipoOrganizacion the tipoOrganizacion to set
	 */
	public void setTipoOrganizacion(TipoOrganizacion tipoOrganizacion) {
		this.tipoOrganizacion = tipoOrganizacion;
	}

	/**
	 * @return the subTipoOrganizacion
	 */
	public SubTipoOrganizacion getSubTipoOrganizacion() {
		return subTipoOrganizacion;
	}

	/**
	 * @param subTipoOrganizacion the subTipoOrganizacion to set
	 */
	public void setSubTipoOrganizacion(SubTipoOrganizacion subTipoOrganizacion) {
		this.subTipoOrganizacion = subTipoOrganizacion;
	}

	/**
	 * @return the estadoEmpresa
	 */
	public EstadoEmpresa getEstadoEmpresa() {
		return estadoEmpresa;
	}

	/**
	 * @param estadoEmpresa the estadoEmpresa to set
	 */
	public void setEstadoEmpresa(EstadoEmpresa estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

	/**
	 * @return the capitalSocial
	 */
	public Collection<CapitalSocial> getCapitalSocial() {
		return capitalSocial;
	}

	/**
	 * @param capitalSocial the capitalSocial to set
	 */
	public void setCapitalSocial(Collection<CapitalSocial> capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	/**
	 * @return the operaciones
	 */
	public Collection<Operacion> getOperaciones() {
		return operaciones;
	}

	/**
	 * @param operaciones the operaciones to set
	 */
	public void setOperaciones(Collection<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	/**
	 * @return the variablesEmpresa
	 */
	public Collection<VariableEmpresa> getVariablesEmpresa() {
		return variablesEmpresa;
	}

	/**
	 * @param variablesEmpresa the variablesEmpresa to set
	 */
	public void setVariablesEmpresa(Collection<VariableEmpresa> variablesEmpresa) {
		this.variablesEmpresa = variablesEmpresa;
	}

	/**
	 * @return the ingresosNoOperacionales
	 */
	public Collection<IngresosNoOperacionales> getIngresosNoOperacionales() {
		return ingresosNoOperacionales;
	}

	/**
	 * @param ingresosNoOperacionales the ingresosNoOperacionales to set
	 */
	public void setIngresosNoOperacionales(Collection<IngresosNoOperacionales> ingresosNoOperacionales) {
		this.ingresosNoOperacionales = ingresosNoOperacionales;
	}

	/**
	 * @return the informacionFuncionamiento
	 */
	public InformacionFuncionamiento getInformacionFuncionamiento() {
		return informacionFuncionamiento;
	}

	/**
	 * @param informacionFuncionamiento the informacionFuncionamiento to set
	 */
	public void setInformacionFuncionamiento(InformacionFuncionamiento informacionFuncionamiento) {
		this.informacionFuncionamiento = informacionFuncionamiento;
	}

	/**
	 * @return the periodoRecoleccion
	 */
	public PeriodoRecoleccion getPeriodoRecoleccion() {
		return periodoRecoleccion;
	}

	/**
	 * @param periodoRecoleccion the periodoRecoleccion to set
	 */
	public void setPeriodoRecoleccion(PeriodoRecoleccion periodoRecoleccion) {
		this.periodoRecoleccion = periodoRecoleccion;
	}

	/**
	 * @return the novedadesEncuestas
	 */
	public Collection<NovedadEncuesta> getNovedadesEncuestas() {
		return novedadesEncuestas;
	}

	/**
	 * @param novedadesEncuestas the novedadesEncuestas to set
	 */
	public void setNovedadesEncuestas(Collection<NovedadEncuesta> novedadesEncuestas) {
		this.novedadesEncuestas = novedadesEncuestas;
	}

	/**
	 * @return the estadosEncuestas
	 */
	public Collection<EstadoEncuesta> getEstadosEncuestas() {
		return estadosEncuestas;
	}

	/**
	 * @param estadosEncuestas the estadosEncuestas to set
	 */
	public void setEstadosEncuestas(Collection<EstadoEncuesta> estadosEncuestas) {
		this.estadosEncuestas = estadosEncuestas;
	}

	/**
	 * @return the estadoModulos
	 */
	public Collection<EstadoModulos> getEstadoModulos() {
		return estadoModulos;
	}

	/**
	 * @param estadoModulos the estadoModulos to set
	 */
	public void setEstadoModulos(Collection<EstadoModulos> estadoModulos) {
		this.estadoModulos = estadoModulos;
	}

	/**
	 * @return the directorio
	 */
	public Directorio getDirectorio() {
		return directorio;
	}

	/**
	 * @param directorio the directorio to set
	 */
	public void setDirectorio(Directorio directorio) {
		this.directorio = directorio;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	
}
