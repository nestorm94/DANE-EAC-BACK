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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.org.dane.persistencia.entidades.modulo2.ClientePrincipal;
import co.org.dane.persistencia.entidades.modulo2.IngresosNetosPorGrupos;
import co.org.dane.persistencia.entidades.modulo2.MetodosVenta;
import co.org.dane.persistencia.entidades.modulo2.VehiculosComercializados;
import co.org.dane.persistencia.entidades.modulo2.VentasVehiculosMotos;
import co.org.dane.persistencia.entidades.modulo3.GastosCausadosPersonal;
import co.org.dane.persistencia.entidades.modulo3.PersonalOcupado;
import co.org.dane.persistencia.entidades.modulo4.ComprasInventario;
import co.org.dane.persistencia.entidades.modulo4.CostosCausados;
import co.org.dane.persistencia.entidades.modulo4.OtrosGastosCausados;
import co.org.dane.persistencia.entidades.modulo4.ValorActivos;
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
	
	@Column( name = "USUARIO_CREACION", nullable = true, updatable = true, length = 30 )
	private String usuarioCreacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "FECHA_CREACION", nullable = true, updatable = true )
	private Date fechaCreacion;
	
	@Column( name = "USUARIO_MODIFICACION", nullable = true, updatable = true, length = 30 )
	private String usuarioModificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "FECHA_MODIFICACION", nullable = true, updatable = true)
	private Date fechaModificacion;
	
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_CAUSA_FK", nullable = true, updatable = true)
	private TipoCausa tipoCausa;
	
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
	
	//----------------------------------------
	//Relaciones con las entidaes de Modulo 2
	//----------------------------------------
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<IngresosNetosPorGrupos> ingresosNetosPorGrupos;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<VentasVehiculosMotos> ventasVehiculosMotos; 

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<MetodosVenta> metodosVenta;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private ClientePrincipal clientePrincipal;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<VehiculosComercializados> vehiculosComercializados;
	
	//----------------------------------------
	//Relaciones con las entidaes de Modulo 3
	//----------------------------------------
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<PersonalOcupado> personalOcupado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<GastosCausadosPersonal> gastosCausadosPersonal;
	
	//----------------------------------------
	//Relaciones con las entidaes de Modulo 4
	//----------------------------------------
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<ComprasInventario> comprasInventarios;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<CostosCausados> costosCausados;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<OtrosGastosCausados> otrosGastosCausados;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caratulaUnica")
	private Collection<ValorActivos> valorActivos;
	
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

	public Date getFechaConstitucionDesde() {
		return fechaConstitucionDesde;
	}

	public void setFechaConstitucionDesde(Date fechaConstitucionDesde) {
		this.fechaConstitucionDesde = fechaConstitucionDesde;
	}

	public Date getFechaConstitucionHasta() {
		return fechaConstitucionHasta;
	}

	public void setFechaConstitucionHasta(Date fechaConstitucionHasta) {
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

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Collection<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Collection<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public TipoRegistroMercantil getTipoRegistroMercantil() {
		return tipoRegistroMercantil;
	}

	public void setTipoRegistroMercantil(TipoRegistroMercantil tipoRegistroMercantil) {
		this.tipoRegistroMercantil = tipoRegistroMercantil;
	}

	public TipoOrganizacion getTipoOrganizacion() {
		return tipoOrganizacion;
	}

	public void setTipoOrganizacion(TipoOrganizacion tipoOrganizacion) {
		this.tipoOrganizacion = tipoOrganizacion;
	}

	public SubTipoOrganizacion getSubTipoOrganizacion() {
		return subTipoOrganizacion;
	}

	public void setSubTipoOrganizacion(SubTipoOrganizacion subTipoOrganizacion) {
		this.subTipoOrganizacion = subTipoOrganizacion;
	}

	public EstadoEmpresa getEstadoEmpresa() {
		return estadoEmpresa;
	}

	public void setEstadoEmpresa(EstadoEmpresa estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

	public TipoCausa getTipoCausa() {
		return tipoCausa;
	}

	public void setTipoCausa(TipoCausa tipoCausa) {
		this.tipoCausa = tipoCausa;
	}

	public Collection<CapitalSocial> getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(Collection<CapitalSocial> capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public Collection<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(Collection<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public Collection<VariableEmpresa> getVariablesEmpresa() {
		return variablesEmpresa;
	}

	public void setVariablesEmpresa(Collection<VariableEmpresa> variablesEmpresa) {
		this.variablesEmpresa = variablesEmpresa;
	}

	public Collection<IngresosNoOperacionales> getIngresosNoOperacionales() {
		return ingresosNoOperacionales;
	}

	public void setIngresosNoOperacionales(Collection<IngresosNoOperacionales> ingresosNoOperacionales) {
		this.ingresosNoOperacionales = ingresosNoOperacionales;
	}

	public InformacionFuncionamiento getInformacionFuncionamiento() {
		return informacionFuncionamiento;
	}

	public void setInformacionFuncionamiento(InformacionFuncionamiento informacionFuncionamiento) {
		this.informacionFuncionamiento = informacionFuncionamiento;
	}

	public PeriodoRecoleccion getPeriodoRecoleccion() {
		return periodoRecoleccion;
	}

	public void setPeriodoRecoleccion(PeriodoRecoleccion periodoRecoleccion) {
		this.periodoRecoleccion = periodoRecoleccion;
	}

	public Collection<NovedadEncuesta> getNovedadesEncuestas() {
		return novedadesEncuestas;
	}

	public void setNovedadesEncuestas(Collection<NovedadEncuesta> novedadesEncuestas) {
		this.novedadesEncuestas = novedadesEncuestas;
	}

	public Collection<EstadoEncuesta> getEstadosEncuestas() {
		return estadosEncuestas;
	}

	public void setEstadosEncuestas(Collection<EstadoEncuesta> estadosEncuestas) {
		this.estadosEncuestas = estadosEncuestas;
	}

	public Collection<EstadoModulos> getEstadoModulos() {
		return estadoModulos;
	}

	public void setEstadoModulos(Collection<EstadoModulos> estadoModulos) {
		this.estadoModulos = estadoModulos;
	}

	public Directorio getDirectorio() {
		return directorio;
	}

	public void setDirectorio(Directorio directorio) {
		this.directorio = directorio;
	}

	public Collection<IngresosNetosPorGrupos> getIngresosNetosPorGrupos() {
		return ingresosNetosPorGrupos;
	}

	public void setIngresosNetosPorGrupos(Collection<IngresosNetosPorGrupos> ingresosNetosPorGrupos) {
		this.ingresosNetosPorGrupos = ingresosNetosPorGrupos;
	}

	public Collection<VentasVehiculosMotos> getVentasVehiculosMotos() {
		return ventasVehiculosMotos;
	}

	public void setVentasVehiculosMotos(Collection<VentasVehiculosMotos> ventasVehiculosMotos) {
		this.ventasVehiculosMotos = ventasVehiculosMotos;
	}

	public Collection<MetodosVenta> getMetodosVenta() {
		return metodosVenta;
	}

	public void setMetodosVenta(Collection<MetodosVenta> metodosVenta) {
		this.metodosVenta = metodosVenta;
	}

	public ClientePrincipal getClientePrincipal() {
		return clientePrincipal;
	}

	public void setClientePrincipal(ClientePrincipal clientePrincipal) {
		this.clientePrincipal = clientePrincipal;
	}

	public Collection<VehiculosComercializados> getVehiculosComercializados() {
		return vehiculosComercializados;
	}

	public void setVehiculosComercializados(Collection<VehiculosComercializados> vehiculosComercializados) {
		this.vehiculosComercializados = vehiculosComercializados;
	}

	public Collection<PersonalOcupado> getPersonalOcupado() {
		return personalOcupado;
	}

	public void setPersonalOcupado(Collection<PersonalOcupado> personalOcupado) {
		this.personalOcupado = personalOcupado;
	}

	public Collection<GastosCausadosPersonal> getGastosCausadosPersonal() {
		return gastosCausadosPersonal;
	}

	public void setGastosCausadosPersonal(Collection<GastosCausadosPersonal> gastosCausadosPersonal) {
		this.gastosCausadosPersonal = gastosCausadosPersonal;
	}

	public Collection<ComprasInventario> getComprasInventarios() {
		return comprasInventarios;
	}

	public void setComprasInventarios(Collection<ComprasInventario> comprasInventarios) {
		this.comprasInventarios = comprasInventarios;
	}

	public Collection<CostosCausados> getCostosCausados() {
		return costosCausados;
	}

	public void setCostosCausados(Collection<CostosCausados> costosCausados) {
		this.costosCausados = costosCausados;
	}

	public Collection<OtrosGastosCausados> getOtrosGastosCausados() {
		return otrosGastosCausados;
	}

	public void setOtrosGastosCausados(Collection<OtrosGastosCausados> otrosGastosCausados) {
		this.otrosGastosCausados = otrosGastosCausados;
	}

	public Collection<ValorActivos> getValorActivos() {
		return valorActivos;
	}

	public void setValorActivos(Collection<ValorActivos> valorActivos) {
		this.valorActivos = valorActivos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
