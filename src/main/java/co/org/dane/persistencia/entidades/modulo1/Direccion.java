/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
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
		// TODO Auto-generated method stub
		return 0;
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
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the municipio
	 */
	public Municipio getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the tipoDireccion
	 */
	public TipoDireccion getTipoDireccion() {
		return tipoDireccion;
	}

	/**
	 * @param tipoDireccion the tipoDireccion to set
	 */
	public void setTipoDireccion(TipoDireccion tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

	/**
	 * @return the caratulaUnica
	 */
	public CaratulaUnica getCaratulaUnica() {
		return caratulaUnica;
	}

	/**
	 * @param caratulaUnica the caratulaUnica to set
	 */
	public void setCaratulaUnica(CaratulaUnica caratulaUnica) {
		this.caratulaUnica = caratulaUnica;
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
