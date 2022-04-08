/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_DIRECCIONES")
@Setter
@Getter
public class Direccion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqDireccion" )
	@SequenceGenerator( name = "SeqDireccion", sequenceName = "SEQ_DIRECCIONES", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_DIRECCION_PK", nullable = false )
	private long id;
	
	//IDIGG Localización georeferenciada de la gerencia (código asignado por georefenciación - LGGR) 
	@Column( name = "LOCALIZACION_GEOREFERENCIADA", nullable = true, updatable = true )
	private double localizacionGeoreferenciada;
	
	//IDDIRECC Domicilio principal o dirección de la gerencia
	@Column( name = "DIRECCION", nullable = false, updatable = true, length = 80 )
	private String direccion;
	
	//IDTEL Teléfono 
	@Column( name = "TELEFONO", nullable = false, updatable = true, length = 10 )
	private String telefono;
	
	//IDRED Redes sociales
	@Column( name = "REDES_SOCIALES", nullable = true, updatable = true, length = 80 )
	private String redesSociales;
		
	//IDMAIL Correo electrónico
	@Column( name = "CORREO_ELECTRONICO", nullable = true, updatable = true, length = 40 )
	private String correoElectronico;
	
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
		
	//IDWEB Página Web 
	@Column( name = "PAGINA_WEB", nullable = true, updatable = true, length = 40 )
	private String paginaWeb;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DEPARTAMENTO_FK", nullable = false, updatable = true)
	private Departamento departamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MUNICIPIO_FK", nullable = false, updatable = true)
	private Municipio municipio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_DIRECCION_FK", nullable = false, updatable = true)
	private TipoDireccion tipoDireccion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARATULA_UNICA_FK", nullable = false, updatable = true)
	private CaratulaUnica caratulaUnica;

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

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public TipoDireccion getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(TipoDireccion tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

	public CaratulaUnica getCaratulaUnica() {
		return caratulaUnica;
	}

	public void setCaratulaUnica(CaratulaUnica caratulaUnica) {
		this.caratulaUnica = caratulaUnica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
